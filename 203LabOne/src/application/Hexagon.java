package application;

import java.util.ArrayList;

public class Hexagon {

	private int hexagonLabel;
	private String sideOne;
	private String sideTwo;
	private String sideThree;
	private String sideFour;
	private String sideFive;
	private String sideSix;


	private ArrayList<Integer> usedIn = new ArrayList<Integer>();

	public Hexagon() {
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
	
	public boolean isNext() {
		return next;
	}

	public void setNext(boolean next) {
		this.next = next;
	}

	public boolean isUsedInPosOne() {
		return usedInPosOne;
	}

	public void setUsedInPosOne(boolean usedInPosOne) {
		this.usedInPosOne = usedInPosOne;
	}

	public boolean isUsedInPosTwo() {
		return usedInPosTwo;
	}

	public void setUsedInPosTwo(boolean usedInPosTwo) {
		this.usedInPosTwo = usedInPosTwo;
	}

	public boolean isUsedInPosThree() {
		return usedInPosThree;
	}

	public void setUsedInPosThree(boolean usedInPosThree) {
		this.usedInPosThree = usedInPosThree;
	}

	public boolean isUsedInPosFour() {
		return usedInPosFour;
	}

	public void setUsedInPosFour(boolean usedInPosFour) {
		this.usedInPosFour = usedInPosFour;
	}

	public boolean isUsedInPosFive() {
		return usedInPosFive;
	}

	public void setUsedInPosFive(boolean usedInPosFive) {
		this.usedInPosFive = usedInPosFive;
	}

	public boolean isUsedInPosSix() {
		return usedInPosSix;
	}

	public void setUsedInPosSix(boolean usedInPosSix) {
		this.usedInPosSix = usedInPosSix;
	}

	public ArrayList<Integer> getUsedIn() {
		return usedIn;
	}

	public void addToList(int num) {
		usedIn.add(num);
	}

	public void setUsedIn(ArrayList<Integer> usedIn) {
		this.usedIn = usedIn;
	}

	public boolean isConnected() {
		return connected;
	}

	public void setConnected(boolean connected) {
		this.connected = connected;
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