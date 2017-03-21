package application;

public class PositionTracker {

	private boolean allFill = false;
	private boolean posOneFilled = false;
	private boolean posTwoFilled = false;
	private boolean posThreeFilled = false;
	private boolean posFourFilled = false;
	private boolean posFiveFilled = false;
	private boolean posSixFilled = false;
	private boolean posZeroFilled = false;

	private int inPosOne;
	private int inPosTwo;
	private int inPosThree;
	private int inPosFour;
	private int inPosFive;
	private int inPosSix;
	private int inPosZero;

	
	public void resetVariables() {
		this.allFill = false;
		this.posOneFilled = false;
		this.posTwoFilled = false;
		this.posThreeFilled = false;
		this.posFourFilled = false;
		this.posFiveFilled = false;
		this.posSixFilled = false;
		this.posZeroFilled = false;
		this.inPosOne = -1;
		this.inPosTwo = -1;
		this.inPosThree = -1;
		this.inPosFour = -1;
		this.inPosFive = -1;
		this.inPosSix = -1;
		this.inPosZero = -1;
	}

	public boolean isAllFill() {
		return allFill;
	}

	public void setAllFill(boolean allFill) {
		this.allFill = allFill;
	}

	public boolean isPosOneFilled() {
		return posOneFilled;
	}

	public void setPosOneFilled(boolean posOneFilled) {
		this.posOneFilled = posOneFilled;
	}

	public boolean isPosTwoFilled() {
		return posTwoFilled;
	}

	public void setPosTwoFilled(boolean posTwoFilled) {
		this.posTwoFilled = posTwoFilled;
	}

	public boolean isPosThreeFilled() {
		return posThreeFilled;
	}

	public void setPosThreeFilled(boolean posThreeFilled) {
		this.posThreeFilled = posThreeFilled;
	}

	public boolean isPosFourFilled() {
		return posFourFilled;
	}

	public void setPosFourFilled(boolean posFourFilled) {
		this.posFourFilled = posFourFilled;
	}

	public boolean isPosFiveFilled() {
		return posFiveFilled;
	}

	public void setPosFiveFilled(boolean posFiveFilled) {
		this.posFiveFilled = posFiveFilled;
	}

	public boolean isPosSixFilled() {
		return posSixFilled;
	}

	public void setPosSixFilled(boolean posSixFilled) {
		this.posSixFilled = posSixFilled;
	}

	public boolean isPosZeroFilled() {
		return posZeroFilled;
	}

	public void setPosZeroFilled(boolean posZeroFilled) {
		this.posZeroFilled = posZeroFilled;
	}

	public int getInPosOne() {
		return inPosOne;
	}

	public void setInPosOne(int inPosOne) {
		this.inPosOne = inPosOne;
	}

	public int getInPosTwo() {
		return inPosTwo;
	}

	public void setInPosTwo(int inPosTwo) {
		this.inPosTwo = inPosTwo;
	}

	public int getInPosThree() {
		return inPosThree;
	}

	public void setInPosThree(int inPosThree) {
		this.inPosThree = inPosThree;
	}

	public int getInPosFour() {
		return inPosFour;
	}

	public void setInPosFour(int inPosFour) {
		this.inPosFour = inPosFour;
	}

	public int getInPosFive() {
		return inPosFive;
	}

	public void setInPosFive(int inPosFive) {
		this.inPosFive = inPosFive;
	}

	public int getInPosSix() {
		return inPosSix;
	}

	public void setInPosSix(int inPosSix) {
		this.inPosSix = inPosSix;
	}

	public int getInPosZero() {
		return inPosZero;
	}

	public void setInPosZero(int inPosZero) {
		this.inPosZero = inPosZero;
	}

}