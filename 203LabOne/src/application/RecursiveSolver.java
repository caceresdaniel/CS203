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
	public boolean noMatch = true;
	public int currentHex = 0;
	public int inPosZero ;
	public int position;
	public static PositionTracker p = new PositionTracker();

	/****************************************************************************/
	// Recursive helper method that sends the hexagon to the position that it is
	// currently on and solves it clockwise
	public void solver(List<Hexagon> hexagons) {
		printer();
		positionChooser();
		hexChooser(hexagons, position);
		System.out.println(
				"currently at position " + position + " with hexagon " + currentHex + " with rotations " + rotations);
		rotations = 0;

		if (p.isAllFill()) {

			System.out.println("Solved with hexagons: ");
			for (int i = 0; i < hexagons.size(); i++) {
				System.out.println(hexagons.get(i).toString());
			}
			// calls the GUI to show the solution
			Application.launch(GUI.class);
			System.out.println("done");
		} else {
			matchChecker(hexagons, currentHex, position);
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
	}

	/*****************************************/
	// connects them recursively if they match
	// if they dont match
	public void matchChecker(List<Hexagon> hexagons, int currentHex, int position) {
		Hexagon ch = hexagons.get(currentHex);
		Hexagon numa1 = hexagons.get(inPosZero);

		if (position == 0) {
			p.setInPosZero(inPosZero);
			p.setPosZero(true);
			numa1.setConnected(true);
			numa1.addToList(0);
			numa1.getUsedIn().add(0);
			System.out.println("doing pos 0");
			solver(hexagons);
		} else if (position == 1) {
			if (numa1.getSideOne().equals(ch.getSideFour()) && !(p.isPosOne())) {
				p.setInPosOne(currentHex);
				p.setPosOne(true);
				ch.setConnected(true);
				ch.getUsedIn().add(1);
				ch.addToList(1);

				solver(hexagons);
			} else if (rotations == 6) {
				ch.getUsedIn().add(1);
				solver(hexagons);
			}
		} else if (position == 2) {
			if (numa1.getSideTwo().equals(ch.getSideFive())
					&& hexagons.get(p.getInPosOne()).getSideThree().equals(ch.getSideSix()) && !(p.isPosTwo())) {
				p.setInPosTwo(currentHex);
				p.setPosTwo(true);
				ch.setConnected(true);
				ch.getUsedIn().add(2);
				ch.addToList(2);

				solver(hexagons);
			} else if (rotations == 6) {
				ch.getUsedIn().add(2);
				solver(hexagons);
			}
		} else if (position == 3) {
			if (numa1.getSideThree().equals(ch.getSideSix())
					&& hexagons.get(p.getInPosTwo()).getSideFour().equals(ch.getSideOne()) && !(p.isPosThree())) {
				p.setInPosThree(currentHex);
				p.setPosThree(true);
				ch.setConnected(true);
				ch.getUsedIn().add(3);
				ch.addToList(3);

				solver(hexagons);
			} else if (rotations == 6) {
				ch.getUsedIn().add(3);
				solver(hexagons);
			}
		} else if (position == 4) {
			if (numa1.getSideFour().equals(ch.getSideOne())
					&& hexagons.get(p.getInPosThree()).getSideFive().equals(ch.getSideTwo()) && !(p.isPosFour())) {
				p.setInPosFour(currentHex);
				p.setPosFour(true);
				ch.setConnected(true);
				ch.getUsedIn().add(4);
				ch.addToList(4);

				solver(hexagons);
			} else if (rotations == 6) {
				ch.getUsedIn().add(4);
				solver(hexagons);
			}
		} else if (position == 5) {
			if (numa1.getSideFive().equals(ch.getSideTwo())
					&& hexagons.get(p.getInPosFour()).getSideSix().equals(ch.getSideThree()) && !(p.isPosFive())) {
				p.setInPosFive(currentHex);
				p.setPosFive(true);
				ch.setConnected(true);
				ch.getUsedIn().add(5);
				ch.addToList(5);

				solver(hexagons);
			} else if (rotations == 6) {
				ch.getUsedIn().add(5);
				solver(hexagons);
			}
		} else if (position == 6) {
			if (numa1.getSideSix().equals(ch.getSideThree())
					&& hexagons.get(p.getInPosFive()).getSideOne().equals(ch.getSideFour())
					&& hexagons.get(p.getInPosOne()).getSideFive().equals(ch.getSideTwo()) && !(p.isPosSix())) {
				p.setInPosSix(currentHex);
				p.setPosSix(true);
				ch.setConnected(true);
				ch.getUsedIn().add(6);
				ch.addToList(6);

				solver(hexagons);
			} else if (rotations == 6) {
				ch.getUsedIn().add(6);
				noMatch = true;
				JOptionPane.showMessageDialog(null, "No Solution!");
			}
		}
		if (ch.isConnected() == false && rotations < 6) {
			rotator(hexagons, currentHex);
			rotations++;
			matchChecker(hexagons, currentHex, position);
		}
	}

	/*******************************************************************/
	// Method that picks a hexagon that has not been used at the current
	// position the program is currently solving at
	public void hexChooser(List<Hexagon> hexagons, int position) {
		if (p.isPosZero() == false) {
			for (int i = 0; i < 6; i++) {
				for (int y = 0; y < hexagons.get(i).getUsedIn().size(); y++) {
					contains = IntStream.of(hexagons.get(i).getUsedIn().get(y)).anyMatch(x -> x == position);
					if (hexagons.get(i).isConnected() == false && contains == false) {
						inPosZero = i;
					}
				}
			}
		} else {
			for (int j = 0; j < 6; j++) {
				for (int k = 0; k < hexagons.get(j).getUsedIn().size(); k++) {
					contains = IntStream.of(hexagons.get(j).getUsedIn().get(k)).anyMatch(x -> x == position);
				}
				if (hexagons.get(j).isConnected() == false && contains == false && rotations == 6) {
					currentHex = j;
				}
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

		if (p.isPosZero() == false) {
			position = 0;
		} else if (p.isPosOne() == false) {
			position = 1;
		} else if (p.isPosTwo() == false) {
			position = 2;
		} else if (p.isPosThree() == false) {
			position = 3;
		} else if (p.isPosFour() == false) {
			position = 4;
		} else if (p.isPosFive() == false) {
			position = 5;
		} else if (p.isPosSix() == false) {
			position = 6;
		} else {
			p.setAllFill(true);
		}
	}

	/****************************************************************/
	// Main where the GUI is called for user to do what he/she wants
	public void monitor() {
		String[] options = { "Quit", "Solve", "Grab Colors From File", "Print hexagon colors" };
		int selection;

		do {
			selection = JOptionPane.showOptionDialog(null, "What would you like to do?", "Main Menu",
					JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, null);

			switch (selection) {
			case 1:
				hexChooser(hexagons, position);
				solver(hexagons);
				break;
			case 2:
				try {
					grabFromFile();
				} catch (IOException e) {
					System.err.println(e);
					System.exit(1);
				}
				break;
			case 3:
				JOptionPane.showMessageDialog(null, hexagons.toArray());
				break;
			}
		} while (selection != 0);
	}

	/**************************************************/
	// reads from selected file and send the information
	// to the spaceRemover method where the spaces get
	// removed and then saves information to the
	// hexagon object
	private void grabFromFile() throws IOException {
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

	public void printer() {
		System.out.println(p.getInPosZero());
		System.out.println(p.getInPosOne());
		System.out.println(p.getInPosTwo());
		System.out.println(p.getInPosThree());
		System.out.println(p.getInPosFour());
		System.out.println(p.getInPosFive());
		System.out.println(p.getInPosSix());

	}
}