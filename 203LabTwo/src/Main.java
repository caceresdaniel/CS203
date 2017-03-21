import java.io.File;
import java.io.IOException;
import java.util.ArrayList;


/*********************************************/
/*Write methods seem to over ride the current files but not append*/
public class Main {
	public static void main(String[] args) throws IOException {
		File cone = new File("cones.dat");
		File ellipsoid = new File("ellipsoids.dat");
		File sphere = new File("spheres.dat");

		ObjectSaver<Cone> c = new ObjectSaver<>(cone);
		ObjectSaver<Ellipsoid> e = new ObjectSaver<>(ellipsoid);
		ObjectSaver<Sphere> s = new ObjectSaver<>(sphere);

		ArrayList<Cone> listCone = new ArrayList<>();
		ArrayList<Ellipsoid> listElip = new ArrayList<>();
		ArrayList<Sphere> listSphere = new ArrayList<>();

		listCone.addAll(c.readAllObjects());
		listElip.addAll(e.readAllObjects());
		listSphere.addAll(s.readAllObjects());

		System.out.println("Testing readAllObjects():");
		System.out.println("Cones: ");
		printer(listCone);

		System.out.println("Ellipsoids: ");
		printer(listElip);

		System.out.println("Spheres: ");
		printer(listSphere);

		System.out.println("Testing readOneObject():");
		System.out.println("Getting Object number 2 from Cones list");
		System.out.println(c.readOneObject(1));

		System.out.println("\nGetting Object number 8 from Ellipsoids list");
		System.out.println(e.readOneObject(7));

		System.out.println("\nGetting Object number 16 from Spheres list");
		System.out.println(s.readOneObject(15));

		System.out.println("\nTesting max() & min():");
		System.out.println("Max Sized Cone: " + ShapeUtilities.max(listCone));
		System.out.println("Min Sized Cone: " + ShapeUtilities.min(listCone));

		System.out.println("\nMax Sized Ellipsoid: " + ShapeUtilities.max(listElip));
		System.out.println("Min Sized Ellipsoid: " + ShapeUtilities.min(listElip));

		System.out.println("\nMax Sized Sphere: " + ShapeUtilities.max(listSphere));
		System.out.println("Min Sized Sphere: " + ShapeUtilities.min(listSphere));

		System.out.println("\nTesting recursiveSort(): ");
		listCone = ShapeUtilities.recursiveSort(listCone);
		printer(listCone);
		
		listElip = ShapeUtilities.recursiveSort(listElip);
		printer(listElip);
		
		listSphere = ShapeUtilities.recursiveSort(listSphere);
		printer(listSphere);

		/*True = append, False = write over*/
		System.out.println("\nTesting writeAllObjects() with value = true: ");
		c.writeAllObjects(listCone, true);
		listCone = c.readAllObjects();
		printer(listCone);
		
		System.out.println("\nTesting writeOneObjects() with value = true: ");
		e.writeOneObject(listElip.get(7), true);
		listElip = e.readAllObjects();
		printer(listElip);
		
		
		System.out.println("\nTesting writeAllObjects() with value = false: ");
		ArrayList<Cone> listCone2 = new ArrayList<>();
		c.writeAllObjects(listCone, false);
		listCone2 = c.readAllObjects();
		printer(listCone2);
		
		System.out.println("\nTesting writeOneObjects() with value = false: ");
		s.writeOneObject(listSphere.get(7), false);
		listSphere = s.readAllObjects();
		printer(listSphere);
		
	}

	public static <T extends Shape> void printer(ArrayList<T> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println();
	}

}