import java.io.File;
import java.util.ArrayList;

public class LinkedList<T, K, O> {
	private Node<T, K, O> head;
	private int size = 0;
	private T category1Label;
	private K category2Label;
	private O category3Label;
	private int groupingCategory;

	public LinkedList() {
		this.head = null;
	}

	public LinkedList(int currentCategory) {
		this.head = null;
		this.groupingCategory = currentCategory;
	}

	/*
	 * This class shall have one constructor which takes a File object parameter
	 * and an integer parameter. This File is the input file from which a list
	 * can be generated and populated. The integer parameter is the current
	 * grouping property. See below for the required format of the input file.
	 * This constructor should take the File and create a list based on the
	 * values in the File.
	 */
	public LinkedList(File file, int currentCategory) {
		this.groupingCategory = currentCategory;

	}

	/*
	 * This method shall have three parameters. These parameters are the values
	 * of the categories in a Node. Use the parameters to create a new Node and
	 * add it to the list. The Node must be added in such a way that it
	 * maintains the current grouping category of the list.
	 */
	public void add(T value1, K value2, O value3) {

	}

	/* This method shall clear the list. */
	public void clear() {
		this.head = null;
		this.size = 0;
	}

	/*
	 * This method shall delete the first Node in the main list. This method
	 * shall NOT delete any nodes in the first Node's sublist. The remaining
	 * Nodes in the sublist should be "reattached" to the beginning of the main
	 * list.
	 */
	public void deleteFirst() {
		if (this.size == 0) {
			System.out.println("Empty List");
		} else {
			if (this.head.down != null) {
				this.head.right.left = this.head.down;
				this.head.right.right = this.head.right;
				this.head = this.head.down;
			} else {
				this.head = this.head.right;
			}
			this.size--;
		}
	}

	/*
	 * This method shall delete the last Node in the main list. This method
	 * shall NOT delete any nodes in the last Node's sublist. The remaining
	 * Nodes in the sublist should be "reattached" to the end of the main list.
	 */
	public void deleteLast() {
		if (this.size == 0) {
			System.out.println("Empty List");
		} else {
			Node<T, K, O> currentNode = this.head;
			Node<T, K, O> previousNode = this.head;
			do {
				previousNode = currentNode;
				currentNode = currentNode.right;
			} while (currentNode.right != null);

			if (currentNode.down != null) {
				currentNode.down.left = previousNode;
				previousNode.right = currentNode.down;
			} else {
				previousNode.right = null;
			}
			size--;
		}
	}

	/*
	 * This method shall delete a specific node from anywhere in the list, given
	 * the mainIndex and subIndex. This method should ONLY delete the requested
	 * Node and should "reconnect" any Nodes that may be attached to the deleted
	 * Node.
	 */
	public void delete(int maindIndex, int subIndex) {

	}

	/*
	 * This method shall have an integer parameter, mainIndex, which is an index
	 * (starting from 0) which indicates the Node from the main branch you want
	 * to retrieve. This method shall have another integer parameter, category,
	 * which is a category number (1 - 3) that will indicate which category's
	 * value you want to retrieve. This method shall return the chosen category
	 * value, from the chosen Node in the main list. The category value should
	 * be returned as a String. If the index is out of bounds, this method
	 * should throw an IndexOutOfBoundsException with an appropriate error
	 * message indicating whether it was the main index or category value that
	 * was out of bounds.
	 */
	public void get(int mainIndex, int category) {

	}

	/*
	 * This method shall have an integer parameter, mainIndex, which is an index
	 * (starting from 0) which indicates the Node from the main branch you want
	 * to retrieve. This method shall have an integer parameter, subIndex, which
	 * is an index (starting from 0) which indicates the Node from the sub-list
	 * of the chosen main branch Node. This method shall have another integer
	 * parameter, category, which is a category number (1 - 3) that will
	 * indicate which category's value you want to retrieve. This method shall
	 * return the value from the chosen category, in the indicated sub-list. The
	 * category value should be returned as a String. If any of the parameters
	 * are out of bounds, this method should throw an IndexOutOfBoundsException
	 * with an appropriate error message indicating whether it was the main
	 * index, sub index or category value that was out of bounds.
	 */
	public void get(int mainIndex, int subIndex, int category) {

	}

	/*
	 * This method shall be responsible for regrouping your LinkedList based on
	 * the given regrouping category number. Example: I could take the above
	 * list from the diagram, which was initially grouped based on the Age
	 * category (category 1), and I could regroup the list based on the
	 * Profession category (category 3). If the groupingCategoryNumber is out of
	 * bounds, display an IndexOutOfBoundsException with an appropriate error
	 * message.
	 */
	public void regroup(int groupingCategoryNumber) {

	}

	/*
	 * This method shall return the size of the main list. The size is the
	 * number of nodes in the main list.
	 */
	public int size() {
		return size;
	}

	/*
	 * This method shall return the size of the sub-list at the given index. If
	 * the given index is out of bounds, this method should throw an
	 * IndexOutOfBoundsException with an appropriate error message.
	 */
	public int size(int index) {
		return size;
	}

}
