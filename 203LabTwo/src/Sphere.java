
import java.io.Serializable;

public class Sphere implements Shape, Serializable {
	private static final long serialVersionUID = 1L;
	private double radius;

	public Sphere(double radiusIn) {
		this.radius = radiusIn;
	}

	@Override
	public double getVolume() {
		double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
		return volume;
	}

	public String toString() {
		return "Sphere with radius: " + radius + " and volume: " + getVolume();
	}
}