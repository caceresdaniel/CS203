package application;

import java.io.Serializable;

public class Hexagon implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6320590345528710462L;
	private int hexagonLabel;
	private String sideOne;
	private String sideTwo;
	private String sideThree;
	private String sideFour;
	private String sideFive;
	private String sideSix;

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
		return "Hexagon #: " + hexagonLabel + " ,with colors in order from segment 1 to segment 6 " + sideOne + ", "
				+ sideTwo + ", " + sideThree + ", " + sideFour + ", " + sideFive + ", " + sideSix;
	}
}
