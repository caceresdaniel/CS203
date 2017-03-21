package application;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class RecursiveSolver {

	public static List<Hexagon> hexagons = new ArrayList<Hexagon>();
	public boolean contains = false;
	public int rotations = 0;
	
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

			positionPrinter();
			System.out.println("done");
		} else {

			hexagons.get(0).setConnected(true);
			positionChooser();
			hexChooser(hexagons, position);
			rotations = 0;
			System.out.println("currently at position " + position + " using hex " + currentHex);
			matchChecker(hexagons, currentHex, position);
		}
	}

	/*****************************************/
	// connects them recursively if they match
	// if they dont match
	public void matchChecker(List<Hexagon> hexagons, int currentHex, int position) {

		Hexagon ch = hexagons.get(currentHex);
		if (position == 0) {
			ch.setConnected(true);
			p.setInPosZero(currentHex);
			p.setPosZeroFilled(true);
			ch.addToList(0);
			solver(hexagons);
		} else if (position == 1) {
			if (hexagons.get(p.getInPosZero()).getSideOne().equals(ch.getSideFour()) && !(p.isPosOneFilled())) {
				p.setInPosOne(currentHex);
				p.setPosOneFilled(true);
				ch.setConnected(true);
				ch.addToList(1);
				rotations = 0;
				System.out.println("matched");
				solver(hexagons);
			} else if (rotations == 6) {
				ch.getUsedIn().add(1);
				System.out.println("not able to match");
				solver(hexagons);
			} else {
				
			}
		} else if (position == 2) {
			if (hexagons.get(p.getInPosZero()).getSideTwo().equals(ch.getSideFive())
					&& hexagons.get(p.getInPosOne()).getSideThree().equals(ch.getSideSix()) && !(p.isPosTwoFilled())) {
				p.setInPosTwo(currentHex);
				p.setPosTwoFilled(true);
				ch.setConnected(true);
				ch.addToList(2);
				rotations = 0;
				System.out.println("matched");
				solver(hexagons);
			} else if (rotations == 6) {
				ch.getUsedIn().add(2);
				System.out.println("no match");
				solver(hexagons);
			} else {
			
			}
			 
		} else if (position == 3) {
			if (hexagons.get(p.getInPosZero()).getSideThree().equals(ch.getSideSix())
					&& hexagons.get(p.getInPosTwo()).getSideFour().equals(ch.getSideOne()) && !(p.isPosThreeFilled())) {
				p.setInPosThree(currentHex);
				p.setPosThreeFilled(true);
				ch.setConnected(true);
				ch.addToList(3);
				rotations = 0;
				System.out.println("matched");
				solver(hexagons);
			} else if (rotations == 6) {
				ch.getUsedIn().add(3);
				System.out.println("no match");
				solver(hexagons);
			}
			else {
				
			}
		} else if (position == 4) {
			if (hexagons.get(p.getInPosZero()).getSideFour().equals(ch.getSideOne())
					&& hexagons.get(p.getInPosThree()).getSideFive().equals(ch.getSideTwo())
					&& !(p.isPosFourFilled())) {
				p.setInPosFour(currentHex);
				p.setPosFourFilled(true);
				ch.setConnected(true);
				ch.addToList(4);
				rotations = 0;
				System.out.println("matched");
				solver(hexagons);
			} else if (rotations == 6) {
				ch.getUsedIn().add(4);
				System.out.println("no match");
				solver(hexagons);
			} else {
				
			}
		} else if (position == 5) {
			if (hexagons.get(p.getInPosZero()).getSideFive().equals(ch.getSideTwo())
					&& hexagons.get(p.getInPosFour()).getSideSix().equals(ch.getSideThree())
					&& !(p.isPosFiveFilled())) {
				p.setInPosFive(currentHex);
				p.setPosFiveFilled(true);
				ch.setConnected(true);
				ch.addToList(5);
				rotations = 0;
				System.out.println("matched");
				solver(hexagons);
			} else if (rotations == 6) {
				ch.getUsedIn().add(5);
				System.out.println("no match");
				solver(hexagons);
			} else {
				
			}
		} else if (position == 6) {
			if (hexagons.get(p.getInPosZero()).getSideSix().equals(ch.getSideThree())
					&& hexagons.get(p.getInPosFive()).getSideOne().equals(ch.getSideFour())
					&& hexagons.get(p.getInPosOne()).getSideFive().equals(ch.getSideTwo()) && !(p.isPosSixFilled())) {
				p.setInPosSix(currentHex);
				p.setPosSixFilled(true);
				ch.setConnected(true);
				ch.addToList(6);
				rotations = 0;
				System.out.println("matched");
				solver(hexagons);
			} else if (rotations == 6) {
				ch.getUsedIn().add(6);
				
				JOptionPane.showMessageDialog(null, "No Solution!");
			}
		}
		if (ch.isConnected() == false && rotations < 6) {
			rotator(hexagons, currentHex);

			System.out.println("did something in position " + position + " " + currentHex + " " + rotations);
			System.out.println(hexagons.get(currentHex).toString());
			matchChecker(hexagons, currentHex, position);
		}
	}

	/*******************************************************************/
	// Method that picks a hexagon that has not been used at the current
	// position the
	// program is currently solving at
	public void hexChooser(List<Hexagon> hexagons, int position) {

		for (int j = 0; j < 7; j++) {
			for (int k = 0; k < hexagons.get(j).getUsedIn().size(); k++) {
				contains = IntStream.of(hexagons.get(j).getUsedIn().get(k)).anyMatch(x -> x == position);
			}
			if (hexagons.get(j).isConnected() == false && contains == false) {
				currentHex = j;
				System.out.println(j);
				break;
			}
		}
		System.out.println(contains);

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
		
		if(hexagons.size() > 0){
			hexagons.clear();
			reset();
		}

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
	
	public void reset(){
		for(int i = 0; i < hexagons.size(); i ++){
			hexagons.get(i).resetVariables();
			hexagons.get(i).getUsedIn();
		}
		
		hexagons.clear();
		p.resetVariables();
		
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