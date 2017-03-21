
import java.util.ArrayList;

public class ShapeUtilities {
	/*****************************************************************************/
	/*
	 * This method takes an ArrayList of Bounded Generic type and sorts it based
	 * on the volumes of the objects using the following algorithm. The bound
	 * should only allow any Shape object and subclasses. NOTE: You must follow
	 * the algorithm exactly, do not deviate.
	 */
	public static <T extends Shape> ArrayList<T> recursiveSort(ArrayList<T> list) {
		if(list.size() <= 1){
			return list;
		}
		
		T tempMid = list.get(list.size()/2);
		list.remove(list.size()/2);
		
		ArrayList<T> leftList = new ArrayList<>();
		ArrayList<T> rightList = new ArrayList<>();
		
		for(T obj: list){
			if(obj.getVolume() <= tempMid.getVolume()){
				rightList.add(obj);
			}else {
				leftList.add(obj);
			}
		}
		ArrayList<T> sortedList = new ArrayList<>();
		sortedList.addAll(recursiveSort(leftList));
		sortedList.add(tempMid);
		sortedList.addAll(recursiveSort(rightList));
		
		return sortedList;
	}

	/***************************************************************************/
	/*
	 * This method takes an ArrayList of Bounded Generic Type which only allows
	 * Shape objects and its subclasses. The method should return the object
	 * with the minimum volume from the list of objects.
	 */
	public static <T extends Shape> T min(ArrayList<T> list) {
		int temp = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(temp).getVolume() > list.get(i).getVolume()) {
				temp = i;
			}
		}
		return list.get(temp);
	}

	/**************************************************************************/
	/*
	 * This method takes an ArrayList of Bounded Generic Type which only allows
	 * Shape objects and its subclasses. The method should return the object
	 * with the maximum volume from the list of objects.
	 */
	public static <T extends Shape> T max(ArrayList<T> list) {
		int temp = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(temp).getVolume() < list.get(i).getVolume()) {
				temp = i;
			}
		}
		return list.get(temp);

	}
}