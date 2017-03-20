package application;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javafx.application.Application;

public class RecursiveSolver {

	public static List<Hexagon> hexagons = new ArrayList<Hexagon>();
	public boolean contains = false;
	public int rotations = 0;
	public boolean noMatches = false;
	public int currentHex = 0;
	public int position;
	public static PositionTracker p = new PositionTracker();

	/****************************************************************************/
	// Recursive helper method that sends the hexagon to the position that it is
	// currently on and solves it clockwise
	public void solver(List<Hexagon> hexagons) {

		if (p.isAllFill()) {

			System.out.println("Solved with hexagons: ");
			for (int i = 0; i < hexagons.size(); i++) {
				System.out.println(hexagons.get(i).toString());
			}
			Application.launch(GUI.class);
			positionPrinter();
			System.out.println("done");
		} else {

			positionChooser();
			hexChooser(hexagons, position);
			rotations = 0;
			System.out.println("currently at position " + position + " using hex " + currentHex);
			matchChecker(hexagons, currentHex, position);
		}
	}

	/*****************************************/
	// connects them recursively if they match
	// if they dont match go back some steps
	public void matchChecker(List<Hexagon> hexagons, int currentHex, int position) {
		Hexagon ch = hexagons.get(currentHex);

		if (position == 0) {
			if (!p.isPosZeroFilled()) {
				System.out.println("set hex " + currentHex + " at position " + position);
				ch.setConnected(true);
				p.setPosZeroFilled(true);
				p.setInPosZero(currentHex);
				solver(hexagons);
			}
		} else if (position == 1) {
			System.out.println(hexagons.get(p.getInPosZero()).getSideOne());
			System.out.println(ch.getSideFour());
			if (hexagons.get(p.getInPosZero()).getSideOne().equals(ch.getSideFour())) {
				System.out.println("set hex " + currentHex + " at position " + position);
				p.setPosOneFilled(true);
				p.setInPosOne(currentHex);
				ch.setConnected(true);
				solver(hexagons);
				rotations = 0;
			} else if (rotations == 6) {
				ch.setNext(true);
				System.out.println("no match");
				solver(hexagons);
			}
		} else if (position == 2) {
			p.setAllFill(true);
			System.out.println("not yet implemented" + position);
		} else if (position == 3) {
			System.out.println("not yet implemented" + position);
		} else if (position == 4) {
			System.out.println("not yet implemented" + position);
		} else if (position == 5) {
			System.out.println("not yet implemented" + position);
		} else if (position == 6) {
			System.out.println("not yet implemented" + position);
		}
		if (noMatches) {
			// implement backtracking here
			// create method that resets each hexagons connections
			// starts all over but with new hexagon in the middle
		} else if (!(ch.isConnected()) && rotations < 6) {
			System.out.println(currentHex + " " + ch.isConnected());
			System.out.println("doing a flip");
			rotator(hexagons, currentHex);
			matchChecker(hexagons, currentHex, position);
		}

	}

	/*******************************************************************/
	// Method that picks a hexagon that has not been used at the current
	// position the
	// program is currently solving at
	public void hexChooser(List<Hexagon> hexagons, int position) {

		for (int i = 0; i < hexagons.size(); i++) {
			if (!(hexagons.get(i).isConnected()) && hexagons.get(i).isNext() && i < 5) {
				currentHex = i + 1;
				break;
			} else if (!(hexagons.get(i).isConnected())) {
				currentHex = i;
				break;
			}
		}

	}

	/**************************************************************************/
	// This method goes through the object PositionTracker to see what position
	// is occupied,if it is occupied it goes on to the next one until it finds
	// an empty
	// position if all positions are occupied it is assumed that it is solved
	// and returns
	// true to the variable allFill which will terminate the program
	public void positionChooser() {

		if (!(p.isPosZeroFilled())) {
			position = 0;
		} else if (!(p.isPosOneFilled())) {
			position = 1;
		} else if (!(p.isPosTwoFilled())) {
			position = 2;
		} else if (!(p.isPosThreeFilled())) {
			position = 3;
		} else if (!(p.isPosFourFilled())) {
			position = 4;
		} else if (!(p.isPosFiveFilled())) {
			position = 5;
		} else if (!(p.isPosSixFilled())) {
			position = 6;
		} else {
			p.setAllFill(true);
		}
	}

	/********************************************/
	// Method that rotates the hexagon clockwise
	public void rotator(List<Hexagon> hexagons, int currentHex) {
		Hexagon h = hexagons.get(currentHex);

		String temp;

		temp = h.getSideOne();
		h.setSideOne(h.getSideSix());
		h.setSideSix(h.getSideFive());
		h.setSideFive(h.getSideFour());
		h.setSideFour(h.getSideThree());
		h.setSideThree(h.getSideTwo());
		h.setSideTwo(temp);
		rotations++;
		System.out.println("rotated");
	}


	/**************************************************/
	// reads from selected file and send the information
	// to the spaceRemover method where the spaces get
	// removed and then saves information to the
	// hexagon object
	public void grabFromFile() throws IOException {
		String[] field;

		JFileChooser fc = new JFileChooser();
		int val = fc.showOpenDialog(null);

		if (val == JFileChooser.APPROVE_OPTION) {
			File file = fc.getSelectedFile();
			Scanner fReader = new Scanner(file);

			while (fReader.hasNextLine()) {

				String noSpaces;
				String lineOfData;

				lineOfData = fReader.nextLine();
				noSpaces = spaceRemover(lineOfData);
				field = noSpaces.split("");

				hexagons.add(new Hexagon(Integer.parseInt(field[0]), field[1], field[2], field[3], field[4], field[5],
						field[6]));

			}
			fReader.close();
		}
	}

	/*********************************************************/
	// removes spaces then sends back the string of information
	// to be saved in the hexagon object
	private String spaceRemover(String lineOfData) {
		String noSpaces = "";

		for (int i = 0; i < lineOfData.length(); i++) {
			if (lineOfData.charAt(i) != ' ')
				noSpaces += lineOfData.charAt(i);
		}

		return noSpaces;
	}

	/******************************************************************/
	// inserting a zero to all objects to avoid crashes due to indicies
	public void insertZero() {
		for (int i = 0; i < hexagons.size(); i++) {
			hexagons.get(i).getUsedIn().add(0);
		}
	}

	public void positionPrinter() {
		System.out.println(p.getInPosOne());
		System.out.println(p.getInPosTwo());
		System.out.println(p.getInPosThree());
		System.out.println(p.getInPosFour());
		System.out.println(p.getInPosFive());
		System.out.println(p.getInPosSix());
	}
}
