package shapeyStuff;

public class Sphere implements Shape {
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
