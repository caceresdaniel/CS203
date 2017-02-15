package shapeyStuff;

import java.io.Serializable;

public class Sphere implements Shape, Serializable {
	private static final long serialVersionUID = 3052069155291603479L;
	private double radius;
	
	public Sphere (double radiusIn){
		this.radius = radiusIn;
	}

	@Override
	public double getVolume() {
		double volume = (4/3) * Math.PI * Math.pow(radius, 3);
		return volume;
	}
	
	public String toString(){
		return "Sphere with radius: " + radius + "and volume: " + getVolume();
	}
}
