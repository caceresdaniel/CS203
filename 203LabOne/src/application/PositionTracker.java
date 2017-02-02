package application;

public class PositionTracker {

	private boolean allFill = false;
	private boolean posOne;
	private boolean posTwo;
	private boolean posThree;
	private boolean posFour;
	private boolean posFive;
	private boolean posSix;
	private int inPosOne;
	private int inPosTwo;
	private int inPosThree;
	private int inPosFour;
	private int inPosFive;
	private int inPosSix;
	
	public PositionTracker(){}

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

	
	public boolean isPosOne() {
		return posOne;
	}

	public void setPosOne(boolean posOne) {
		this.posOne = posOne;
	}

	public boolean isPosTwo() {
		return posTwo;
	}

	public void setPosTwo(boolean posTwo) {
		this.posTwo = posTwo;
	}

	public boolean isPosThree() {
		return posThree;
	}

	public void setPosThree(boolean posThree) {
		this.posThree = posThree;
	}

	public boolean isPosFour() {
		return posFour;
	}

	public void setPosFour(boolean posFour) {
		this.posFour = posFour;
	}

	public boolean isPosFive() {
		return posFive;
	}

	public void setPosFive(boolean posFive) {
		this.posFive = posFive;
	}

	public boolean isPosSix() {
		return posSix;
	}

	public void setPosSix(boolean posSix) {
		this.posSix = posSix;
	}

	public boolean isAllFill() {
		return allFill;
	}

	public void setAllFill(boolean allFill) {
		this.allFill = allFill;
	}
}