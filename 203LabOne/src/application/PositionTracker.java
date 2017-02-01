package application;

public class PositionTracker {

	private boolean posOne;
	private boolean posTwo;
	private boolean posThree;
	private boolean posFour;
	private boolean posFive;
	private boolean posSix;
	
	public PositionTracker(){}
	
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

	
	
	private boolean allFill = false;
	
}
