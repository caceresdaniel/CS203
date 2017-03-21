

import java.io.Serializable;

public class Ellipsoid implements Shape, Serializable{
	private static final long serialVersionUID = 1L;
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
		double volume = (4.0/3.0)* Math.PI * radius1 * radius2 * radius3;
		return volume;
	}

	public String toString(){
		return "Ellipsoid with 3 radii: " + radius1 + ", " + radius2 + ", " + radius3 + "; and volume of " + getVolume() ;
	}
}