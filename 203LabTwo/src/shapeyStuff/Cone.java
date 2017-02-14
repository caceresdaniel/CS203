package shapeyStuff;

public class Cone implements Shape{
	private double height;
	private double radius;
	
	public Cone(double heightIn, double radiusIn){
		this.height = heightIn;
		this.radius = radiusIn;
	}

	@Override
	public double getVolume() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public String toString(){
		return "Cone with radius: " + radius + "and volume ";
	}
}
