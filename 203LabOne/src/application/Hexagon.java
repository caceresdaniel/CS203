package application;

import java.util.ArrayList;

public class Hexagon{

	private int hexagonLabel;
	private String sideOne;
	private String sideTwo;
	private String sideThree;
	private String sideFour;
	private String sideFive;
	private String sideSix;
	private int sidesConnected = 0;
	private boolean connected = false;
	//private int position;
	private ArrayList<Integer> usedIn = new ArrayList<Integer>();

	public Hexagon() {
	}

	public ArrayList<Integer> getUsedIn() {
		return usedIn;
	}
	
	public void addToList(int num){
		usedIn.add(num);
	}
	
	public void setUsedIn(ArrayList<Integer> usedIn) {
		this.usedIn = usedIn;
	}

	public Hexagon(int hexagonLabelIn, String sideOneIn, String sideTwoIn, String sideThreeIn, String sideFourIn,
			String sideFiveIn, String sideSixIn) {

		hexagonLabel = hexagonLabelIn;
		sideOne = sideOneIn;
		sideTwo = sideTwoIn;
		sideThree = sideThreeIn;
		sideFour = sideFourIn;
		sideFive = sideFiveIn;
		sideSix = sideSixIn;
	}
	
//	public int getPosition() {
//		return position;
//	}
//	
//	public void setPosition(int position) {
//		this.position = position;
//	}
	
	public boolean isConnected() {
		return connected;
	}
	
	public void setConnected(boolean connected) {
		this.connected = connected;
	}
	
	public int getSidesConnected() {
		return sidesConnected;
	}
	
	public void setSidesConnected(int sidesConnected) {
		this.sidesConnected = sidesConnected;
	}

	public int getHexagonLabel() {
		return hexagonLabel;
	}

	public void setHexagonLabel(int hexagonLabel) {
		this.hexagonLabel = hexagonLabel;
	}

	public String getSideOne() {
		return sideOne;
	}

	public void setSideOne(String sideOne) {
		this.sideOne = sideOne;
	}

	public String getSideTwo() {
		return sideTwo;
	}

	public void setSideTwo(String sideTwo) {
		this.sideTwo = sideTwo;
	}

	public String getSideThree() {
		return sideThree;
	}

	public void setSideThree(String sideThree) {
		this.sideThree = sideThree;
	}

	public String getSideFour() {
		return sideFour;
	}

	public void setSideFour(String sideFour) {
		this.sideFour = sideFour;
	}

	public String getSideFive() {
		return sideFive;
	}

	public void setSideFive(String sideFive) {
		this.sideFive = sideFive;
	}

	public String getSideSix() {
		return sideSix;
	}

	public void setSideSix(String sideSix) {
		this.sideSix = sideSix;
	}

	public String toString() {
		return "Hexagon #: " + hexagonLabel + ", with colors in order from segment 1 to segment 6 " + sideOne + ", "
				+ sideTwo + ", " + sideThree + ", " + sideFour + ", " + sideFive + ", " + sideSix;
	}
}