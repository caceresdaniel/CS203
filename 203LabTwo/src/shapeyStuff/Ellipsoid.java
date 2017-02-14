package shapeyStuff;

public class Ellipsoid implements Shape {
	private double radius1;
	private double radius2;
	private double radius3;
	
	public Ellipsoid(double radius1In, double radius2In, double radius3In){
		this.radius1 = radius1In;
		this.radius2 = radius2In;
		this.radius3 = radius3In;
	}

	@Override
	public double getVolume() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public String toString(){
		return "Elipsoid with 3 radii that are " + radius1 + ", " + radius2 + ", " + radius3 + " and volume of";
	}
}
