package shapeyStuff;

public class ShapeUtilities {
	/*
	 * This method takes an ArrayList of Bounded Generic type and sorts it based
	 * on the volumes of the objects using the following algorithm. The bound
	 * should only allow any Shape object and subclasses. NOTE: You must follow
	 * the algorithm exactly, do not deviate.
	 */
	public static <T> void recursiveSort() {
		/*
		 * if the list size is <= 1 return the list select a middle element from
		 * the list and remove it create two lists leftList and rightList for
		 * each element in the list if element is less than the middle element
		 * then add element to the rightList else add element to leftList return
		 * the combination of recursiveSort(leftList), middle element, and
		 * recursiveSort(rightList)
		 */
	}

	/*
	 * This method takes an ArrayList of Bounded Generic Type which only allows
	 * Shape objects and its subclasses. The method should return the object
	 * with the minimum volume from the list of objects.
	 */
	public static <T> void min() {

	}

	/*
	 * This method takes an ArrayList of Bounded Generic Type which only allows
	 * Shape objects and its subclasses. The method should return the object
	 * with the maximum volume from the list of objects.*/
	public static <T> void max() {

	}
}
