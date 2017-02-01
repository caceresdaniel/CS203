package application;

import java.util.List;

public class RecursiveSolver {

	PositionTracker p = new PositionTracker();

	public void solver(List<Hexagon> hexagons) {
		// base case, if hexagon has a match to all its sides it is complete
		if (p.isAllFill()) {
			System.out.println("Solved");
		} else {

			matchChecker(hexagons, 2, 1);
		}

	}

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
	// connects them if they match

	public void matchChecker(List<Hexagon> hexagons, int currentHex, int position) {

		int rotations = 0;
		Hexagon h = hexagons.get(0);
		Hexagon ch = hexagons.get(currentHex);

		if (position == 1) {
			if (h.getSideOne().equals(ch.getSideFour()) && !(p.isPosOne())) {
				h.setSidesConnected(h.getSidesConnected() + 1);
				p.setPosOne(true);
				rotations = 0;
				System.out.println("matched");
			} else if (rotations < 6 && p.isPosOne() == false) {
				rotator(hexagons, currentHex);
				matchChecker(hexagons, currentHex, position);
				rotations++;
				System.out.println("did something" + position + " " + currentHex + " " + rotations);
			}
		} else if (position == 2) {
			if (h.getSideTwo().equals(ch.getSideFive()) && h.getSideThree().equals(ch.getSideFive()) && !(p.isPosOne())) {
				h.setSidesConnected(h.getSidesConnected() + 1);
				p.setPosOne(true);
				rotations = 0;
				System.out.println("matched");
			} else if (rotations < 6 && p.isPosOne() == false) {
				rotator(hexagons, currentHex);
				rotations++;
				matchChecker(hexagons, currentHex, position);
				System.out.println("did something 2 " + position + " " + currentHex + " " + rotations);
			}
		} else if (position == 3){
			if (h.getSideOne().equals(ch.getSideFour()) && !(p.isPosOne())) {
				h.setSidesConnected(h.getSidesConnected() + 1);
				p.setPosOne(true);
				rotations = 0;
				System.out.println("matched");
			} else if (rotations < 6 && p.isPosOne() == false) {
				rotator(hexagons, currentHex);
				rotations++;
				matchChecker(hexagons, currentHex, position);
				System.out.println("did something 2 " + position + " " + currentHex + " " + rotations);
			}
		} else if (position == 4){
			if (h.getSideOne().equals(ch.getSideFour()) && !(p.isPosOne())) {
				h.setSidesConnected(h.getSidesConnected() + 1);
				p.setPosOne(true);
				rotations = 0;
				System.out.println("matched");
			} else if (rotations < 6 && p.isPosOne() == false) {
				rotator(hexagons, currentHex);
				rotations++;
				matchChecker(hexagons, currentHex, position);
				System.out.println("did something 2 " + position + " " + currentHex + " " + rotations);
			}
		} else if (position == 5){
			if (h.getSideOne().equals(ch.getSideFour()) && !(p.isPosOne())) {
				h.setSidesConnected(h.getSidesConnected() + 1);
				p.setPosOne(true);
				rotations = 0;
				System.out.println("matched");
			} else if (rotations < 6 && p.isPosOne() == false) {
				rotator(hexagons, currentHex);
				rotations++;
				matchChecker(hexagons, currentHex, position);
				System.out.println("did something 2 " + position + " " + currentHex + " " + rotations);
			}
		} else if (position == 6) {
			if (h.getSideOne().equals(ch.getSideFour()) && !(p.isPosOne())) {
				h.setSidesConnected(h.getSidesConnected() + 1);
				p.setPosOne(true);
				rotations = 0;
				System.out.println("matched");
			} else if (rotations < 6 && p.isPosOne() == false) {
				rotator(hexagons, currentHex);
				rotations++;
				matchChecker(hexagons, currentHex, position);
				System.out.println("did something 2 " + position + " " + currentHex + " " + rotations);
			}
		}
	}
}
