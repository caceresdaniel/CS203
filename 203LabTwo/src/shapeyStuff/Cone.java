package shapeyStuff;

public class Cone implements Shape{
	private double height;
	private double radius;
	
	public Cone (double heightIn, double radiusIn){
		this.height = heightIn;
		this.radius = radiusIn;
	}
	
	@Override
	public double getVolume() {
		double volume = (1/3) * Math.PI * Math.pow(radius, 2) * height;
		return volume;
	}
	
	public String toString(){
		return "Cone with radius: " + radius + " and volume: " + getVolume();
	}
}
