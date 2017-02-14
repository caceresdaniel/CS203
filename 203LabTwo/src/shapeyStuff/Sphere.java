package shapeyStuff;

public class Sphere implements Shape {
	private double radius;
	
	public Sphere(double radiusIn){
		this.radius = radiusIn;
	}

	@Override
	public double getVolume() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public String toString(){
		return "Sphere with radius: " + radius + " and volume of: ";
	}
}
