package application;

import java.util.List;

public class RecursiveSolver {

	public void solver(List<Hexagon> hexagons) {
		//base case, if hexagon has a match to all its sides it is complete
		if(hexagons.get(0).getSidesConnected() == 6){
			System.out.println("Solved");
		} else {
			for(int i = 0; i < hexagons.size(); i++){
				if(){
					
				}
			}
			rotator(hexagons, 1);
		}
		
	}
	//Method that rotates the hexagon clockwise
	public void rotator(List<Hexagon> hexagons, int currentHex){
		
		Hexagon h = hexagons.get(currentHex);
		
		String temp;
		
		temp = h.getSideOne();
		h.setSideOne(h.getSideSix());
		h.setSideSix(h.getSideFive());
		h.setSideFive(h.getSideFour());
		h.setSideFour(h.getSideThree());
		h.setSideThree(h.getSideTwo());
		h.setSideTwo(temp);
			
		System.out.println(h.toString());	
	}
	public void matchChecker(List<Hexagon> hexagon){
		
	}
}
