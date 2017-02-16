package shapeyStuff;

import java.io.File;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args){
		File cone = new File("cones.dat");
		File ellipsoid = new File("ellipsoids.dat");
		File sphere = new File ("spheres.dat");
		
		ObjectSaver<Cone> c = new ObjectSaver<Cone>(cone);
		ObjectSaver<Ellipsoid> e = new ObjectSaver<Ellipsoid>(ellipsoid);
		ObjectSaver<Sphere> s = new ObjectSaver<Sphere>(sphere);
		
		ArrayList<Cone> listCone = new ArrayList<Cone>();
		ArrayList<Ellipsoid> listElip = new ArrayList<Ellipsoid>();
		ArrayList<Sphere> listSphere = new ArrayList<Sphere>();
		
		listCone.addAll(c.readAllObjects());
		
		for(int i = 0; i < listCone.size(); i++){
			System.out.println(listCone.get(i));
		}
		
		
	}

}
