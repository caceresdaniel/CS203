package application;

import java.util.List;

public class RecursiveSolver {

	public int rotations = 0;
	public boolean noMatch = false;
	public int currentHex = 0;
	
	PositionTracker p = new PositionTracker();

	
	public void solver(List<Hexagon> hexagons) {
		hexagons.get(0).setConnected(true);
		int position = positionChooser();
		if (p.isAllFill()) {
			System.out.println("Solved");
		} else {
			matchChecker(hexagons, 1, position);
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

	// connects them recursively if they match
	public void matchChecker(List<Hexagon> hexagons, int currentHex, int position) {

		Hexagon h = hexagons.get(0);
		Hexagon ch = hexagons.get(currentHex);

		if (rotations > 6) {
			noMatch = true;
		}

		if (position == 1) {
			if (h.getSideOne().equals(ch.getSideFour()) && !(p.isPosOne())) {
				h.setSidesConnected(h.getSidesConnected() + 1);
				p.setInPosOne(currentHex);
				p.setPosOne(true);
				ch.setConnected(true);
				ch.addToList(1);
				rotations = 0;
				System.out.println("matched");
			} else if (rotations < 6 && !(p.isPosOne()) && !(noMatch)) {
				rotator(hexagons, currentHex);
				rotations++;
				System.out.println("did something in position " + position + " " + currentHex + " " + rotations);
				matchChecker(hexagons, currentHex, position);
			} else if (rotations == 6) {
				System.out.println("not able to match");
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
			} else if (rotations < 6 && !(p.isPosTwo()) && !(noMatch)) {
				rotator(hexagons, currentHex);
				rotations++;
				System.out.println("did something in position " + position + " " + currentHex + " " + rotations);
				matchChecker(hexagons, currentHex, position);
			} else if (rotations == 6) {
				System.out.println("no match");
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
			} else if (rotations < 6 && !(p.isPosThree()) && !(noMatch)) {
				rotator(hexagons, currentHex);
				rotations++;
				System.out.println("did something in position " + position + " " + currentHex + " " + rotations);
				matchChecker(hexagons, currentHex, position);
			} else if (rotations == 6) {
				System.out.println("no match");
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
			} else if (rotations < 6 && !(p.isPosFour()) && !(noMatch)) {
				rotator(hexagons, currentHex);
				rotations++;
				System.out.println("did something in position " + position + " " + currentHex + " " + rotations);
				matchChecker(hexagons, currentHex, position);
			} else if (rotations == 6) {
				System.out.println("no match");
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
			} else if (rotations < 6 && !(p.isPosFive()) && !(noMatch)) {
				rotator(hexagons, currentHex);
				rotations++;
				System.out.println("did something in position " + position + " " + currentHex + " " + rotations);
				matchChecker(hexagons, currentHex, position);
			} else if (rotations == 6) {
				System.out.println("no match");
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
			} else if (rotations < 6 && !(p.isPosSix()) && !(noMatch)) {
				rotator(hexagons, currentHex);
				rotations++;
				System.out.println("did something in position " + position + " " + currentHex + " " + rotations);
				matchChecker(hexagons, currentHex, position);
			} else if (rotations == 6) {
				System.out.println("no match");
			}
		}
	}

	public int hexChooser(List<Hexagon> hexagons, int position) {
		int hex;
		
		//use the position and the array list that each hexagon has to see where t hey have been used and pick 
		// the hex with that int[] a = {1,2,3,4};
		//boolean contains = IntStream.of(a).anyMatch(x -> x == 4);
		for (int i = 0; i < 6; i++) {
			if(!(hexagons.get(i).isConnected()) &&){
				
			}
		}

		return hex;
	}
	public int positionChooser(){
		int pos = 0;
		if(p.isPosOne() == false){
			pos = 1;
		} else if(p.isPosTwo() == false){
			pos = 2;
		} else if(p.isPosThree() == false){
			pos = 3;
		} else if (p.isPosFour() == false){
			pos = 4;
		}else if (p.isPosFive() == false){
			pos = 5;
		}else if (p.isPosSix() == false){
			pos = 6;
		} else {
			p.setAllFill(true);
		}
		return pos;
	}
}