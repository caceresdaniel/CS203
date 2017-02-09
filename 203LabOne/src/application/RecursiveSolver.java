package application;

import java.util.List;
import java.util.stream.IntStream;

import javax.swing.JOptionPane;

import javafx.application.Application;

public class RecursiveSolver {

	public boolean contains = false;
	public int rotations = 0;
	public boolean noMatch = true;
	public int currentHex = 0;
	public int position;
	GUI gui = new GUI();
	PositionTracker p = new PositionTracker();

	/****************************************************************************/
	// Recursive helper method that sends the hexagon to the position that it is
	// currently on and solves it clockwise
	public void solver(List<Hexagon> hexagons) {

		hexagons.get(0).setConnected(true);
		positionChooser();
		hexChooser(hexagons, position);
		rotations = 0;

		System.out.println("currently at position " + position + " using hex " + currentHex);
		if (p.isAllFill()) {

			System.out.println("Solved with hexagons: ");
			for (int i = 0; i < hexagons.size(); i++) {
				System.out.println(hexagons.get(i).toString());
			}
			gui.addShapes();
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

		System.out.println("rotated");
	}

	/*****************************************/
	// connects them recursively if they match
	// if they dont match
	public void matchChecker(List<Hexagon> hexagons, int currentHex, int position) {
		Hexagon h = hexagons.get(0);
		Hexagon ch = hexagons.get(currentHex);

		if (position == 1) {
			if (h.getSideOne().equals(ch.getSideFour()) && !(p.isPosOne())) {
				h.setSidesConnected(h.getSidesConnected() + 1);
				p.setInPosOne(currentHex);
				p.setPosOne(true);
				ch.setConnected(true);
				ch.addToList(1);
				rotations = 0;
				System.out.println("matched");
				solver(hexagons);
			} else if (rotations == 6) {
				ch.getUsedIn().add(1);
				System.out.println("not able to match");
				solver(hexagons);
			}
		} else if (position == 2) {
			if (h.getSideTwo().equals(ch.getSideFive())
					&& hexagons.get(p.getInPosOne()).getSideThree().equals(ch.getSideSix()) && !(p.isPosTwo())) {
				h.setSidesConnected(h.getSidesConnected() + 1);
				p.setInPosTwo(currentHex);
				p.setPosTwo(true);
				ch.setConnected(true);
				ch.addToList(2);
				rotations = 0;
				System.out.println("matched");
				solver(hexagons);
			} else if (rotations == 6) {
				ch.getUsedIn().add(2);
				System.out.println("no match");
				solver(hexagons);
			}
		} else if (position == 3) {
			if (h.getSideThree().equals(ch.getSideSix())
					&& hexagons.get(p.getInPosTwo()).getSideFour().equals(ch.getSideOne()) && !(p.isPosThree())) {
				h.setSidesConnected(h.getSidesConnected() + 1);
				p.setInPosThree(currentHex);
				p.setPosThree(true);
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
		} else if (position == 4) {
			if (h.getSideFour().equals(ch.getSideOne())
					&& hexagons.get(p.getInPosThree()).getSideFive().equals(ch.getSideTwo()) && !(p.isPosFour())) {
				h.setSidesConnected(h.getSidesConnected() + 1);
				p.setInPosFour(currentHex);
				p.setPosFour(true);
				ch.setConnected(true);
				ch.addToList(4);
				rotations = 0;
				System.out.println("matched");
				solver(hexagons);
			} else if (rotations == 6) {
				ch.getUsedIn().add(4);
				System.out.println("no match");
				solver(hexagons);
			}
		} else if (position == 5) {
			if (h.getSideFive().equals(ch.getSideTwo())
					&& hexagons.get(p.getInPosFour()).getSideSix().equals(ch.getSideThree()) && !(p.isPosFive())) {
				h.setSidesConnected(h.getSidesConnected() + 1);
				p.setInPosFive(currentHex);
				p.setPosFive(true);
				ch.setConnected(true);
				ch.addToList(5);
				rotations = 0;
				System.out.println("matched");
				solver(hexagons);
			} else if (rotations == 6) {
				ch.getUsedIn().add(5);
				System.out.println("no match");
				solver(hexagons);
			}
		} else if (position == 6) {
			if (h.getSideSix().equals(ch.getSideThree())
					&& hexagons.get(p.getInPosFive()).getSideOne().equals(ch.getSideFour())
					&& hexagons.get(p.getInPosOne()).getSideFive().equals(ch.getSideTwo()) && !(p.isPosSix())) {
				h.setSidesConnected(h.getSidesConnected() + 1);
				p.setInPosSix(currentHex);
				p.setPosSix(true);
				ch.setConnected(true);
				ch.addToList(6);
				rotations = 0;
				System.out.println("matched");
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
			System.out.println("did something in position " + position + " " + currentHex + " " + rotations);

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

		if (p.isPosOne() == false) {
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
}