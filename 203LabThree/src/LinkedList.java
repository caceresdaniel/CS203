import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

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
	@SuppressWarnings("unchecked")
	public LinkedList(File file, int currentCategory) throws FileNotFoundException {
		this.groupingCategory = currentCategory;
		String lineOfData = "";
		String[] field = { "" };
		String values = "";
		String[] singleValues = { "" };

		Scanner fReader = new Scanner(file);

		while (fReader.hasNextLine()) {
			lineOfData += fReader.nextLine();
			lineOfData += "  ";
			field = lineOfData.split("  ");
		}
		fReader.close();

		this.category1Label = (T) field[0];
		this.category2Label = (K) field[1];
		this.category3Label = (O) field[2];

		for (int HA = 4; HA < field.length; HA++) {
			values += field[HA];
			values += ", ";
			singleValues = values.split(", ");
		}

		for (int LOL = 0; LOL < singleValues.length; LOL += 3) {
			add((T) singleValues[LOL], (K) singleValues[LOL + 1], (O) singleValues[LOL + 2]);
		}
	}

	/*
	 * This method shall have three parameters. These parameters are the values
	 * of the categories in a Node. Use the parameters to create a new Node and
	 * add it to the list. The Node must be added in such a way that it
	 * maintains the current grouping category of the list.
	 */
	public void add(T value1, K value2, O value3) {
		Node<T, K, O> newNode = new Node<T, K, O>(value1, value2, value3);
		Node<T, K, O> currentNode = this.head;
		boolean done = false;
		if (groupingCategory == 1) {
			if (this.head == null) {
				this.head = newNode;
				System.out.println("made first head");
			} else {
				if (currentNode.category1.equals(value1)) {
					if (currentNode.down == null) {
						currentNode.down = newNode;
						System.out.println("added to first node downlist");
					} else {
						Node<T, K, O> tempCur = currentNode;
						while (tempCur.down != null) {
							tempCur = tempCur.down;
						}
						tempCur.down = newNode;
						System.out.println("added to first node down list p2");
					}
				} else {
					while (currentNode.right != null) {
						currentNode = currentNode.right;
						if (currentNode.category1.equals(value1)) {
							if (currentNode.down == null) {
								currentNode.down = newNode;
								System.out.println("added to middle node downlist");
								done = true;
							} else {
								Node<T, K, O> tempCur = currentNode;
								while (tempCur.down != null) {
									tempCur = tempCur.down;
								}
								tempCur.down = newNode;
								System.out.println("added to middle node down list p2");
								done = true;
							}
						}
					}
					if (!done) {
						currentNode.right = newNode;
						newNode.left = currentNode;
						System.out.println("created a new node in main list");
					}
				}
			}
		} else if (groupingCategory == 2) {
			if (this.head == null) {
				this.head = newNode;
				System.out.println("made first head");
			} else {
				if (currentNode.category2.equals(value2)) {
					if (currentNode.down == null) {
						currentNode.down = newNode;
						System.out.println("added to first node downlist");
					} else {
						Node<T, K, O> tempCur = currentNode;
						while (tempCur.down != null) {
							tempCur = tempCur.down;
						}
						tempCur.down = newNode;
						System.out.println("added to first node down list p2");
					}
				} else {
					while (currentNode.right != null) {
						currentNode = currentNode.right;
						if (currentNode.category2.equals(value2)) {
							if (currentNode.down == null) {
								currentNode.down = newNode;
								System.out.println("added to middle node downlist");
								done = true;
							} else {
								Node<T, K, O> tempCur = currentNode;
								while (tempCur.down != null) {
									tempCur = tempCur.down;
								}
								tempCur.down = newNode;
								System.out.println("added to middle node down list p2");
								done = true;
							}
						}
					}
					if (!done) {
						currentNode.right = newNode;
						newNode.left = currentNode;
						System.out.println("created a new node in main list");
					}
				}
			}
		} else if (groupingCategory == 3) {
			if (this.head == null) {
				this.head = newNode;
				System.out.println("made first head");
			} else {
				if (currentNode.category3.equals(value3)) {
					if (currentNode.down == null) {
						currentNode.down = newNode;
						System.out.println("added to first node downlist");
					} else {
						Node<T, K, O> tempCur = currentNode;
						while (tempCur.down != null) {
							tempCur = tempCur.down;
						}
						tempCur.down = newNode;
						System.out.println("added to first node down list p2");
					}
				} else {
					while (currentNode.right != null) {
						currentNode = currentNode.right;

						if (currentNode.category3.equals(value3)) {
							if (currentNode.down == null) {
								currentNode.down = newNode;
								System.out.println("added to middle node downlist");
								done = true;
							} else {
								Node<T, K, O> tempCur = currentNode;
								while (tempCur.down != null) {
									tempCur = tempCur.down;
								}
								tempCur.down = newNode;
								System.out.println("added to middle node down list p2");
								done = true;
							}
						}
					}
					if (!done) {
						currentNode.right = newNode;
						newNode.left = currentNode;
						System.out.println("created a new node in main list");
					}
				}
			}
		}
		size++;
		System.out.println(size);
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
	public void delete(int mainIndex, int subIndex) {
		int countMain = 0, countSub = 0;
		if (mainIndex > size() - 1 || mainIndex < 0) {
			throw new IndexOutOfBoundsException("main index out of bounds");
		} else if (subIndex > size(mainIndex) || subIndex < 0) {
			throw new IndexOutOfBoundsException("sub index out of bounds");
		}

		if (mainIndex == 0 && subIndex == 0) {
			deleteFirst();
		} else if (mainIndex == size() - 1 && subIndex == 0) {
			deleteLast();
		}

		Node<T, K, O> currentNode = this.head;
		Node<T, K, O> previousNode = this.head;
		while (currentNode.right != null && countMain < mainIndex) {
			previousNode = currentNode;
			currentNode = currentNode.right;
			countMain++;
		}

		while (currentNode.down != null && countSub < subIndex) {
			previousNode = currentNode;
			currentNode = currentNode.down;
			countSub++;
		}

		Node<T, K, O> rightReference = currentNode.right;
		Node<T, K, O> leftReference = currentNode.left;

		if (subIndex == 0) {
			if (currentNode.down != null) {
				rightReference.left = currentNode.down;
				leftReference.right = currentNode.down;
				currentNode.down.right = rightReference;
				currentNode.down.left = leftReference;
			} else {
				rightReference.left = leftReference;
				leftReference.right = rightReference;
			}
			size--;
		} else if (subIndex > 0) {
			if (currentNode.down != null) {
				previousNode.down = currentNode.down;
			} else {
				previousNode.down = null;
			}

		}
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
	public String get(int mainIndex, int category) {
		if (mainIndex > size() - 1 || mainIndex < 0) {
			throw new IndexOutOfBoundsException("mainIndex out of bounds");
		} else if (category < 0 || category > 3) {
			throw new IndexOutOfBoundsException("category index out of bounds");
		}

		int count = 0;
		Node<T, K, O> currentNode = this.head;
		if (category == 1) {
			while (currentNode.right != null && count < mainIndex ) {
				currentNode = currentNode.right;
				count++;
			}
			return (String) currentNode.getCategory1();
		} else 	if (category == 2) {
			while (currentNode.right != null && count < mainIndex) {
				currentNode = currentNode.right;
				count++;
			}
			return (String) currentNode.getCategory2();
		}else 	if (category == 3) {
			while (currentNode.right != null && count < mainIndex) {
				currentNode = currentNode.right;
				count++;
			}
			return (String) currentNode.getCategory3();
		}

		return null;
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
	public String get(int mainIndex, int subIndex, int category) {
		if (mainIndex > size() - 1 || mainIndex < 0) {
			throw new IndexOutOfBoundsException("main index out of bounds");
		} else if (category < 0 || category > 3) {
			throw new IndexOutOfBoundsException("category index out of bounds");
		} else if (subIndex < 0 | subIndex > size(mainIndex)) {
			throw new IndexOutOfBoundsException("sub index out of bounds");
		}

		return null;
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
	public void regroup(int groupingCategoryNumber) throws FileNotFoundException {
		if (groupingCategoryNumber < 1 || groupingCategoryNumber > 3) {
			throw new IndexOutOfBoundsException("grouping category number out of bounds, bounds = [0,3]");
		} else {
			clear();

		}
	}

	/*
	 * This method shall return the size of the main list. The size is the
	 * number of nodes in the main list.
	 */
	public int size() {
		Node<T, K, O> currentNode = this.head;
		int mainListSize = 1;
		while (currentNode.right != null) {
			currentNode = currentNode.right;
			mainListSize++;
		}
		return mainListSize;
	}

	/*
	 * This method shall return the size of the sub-list at the given index. If
	 * the given index is out of bounds, this method should throw an
	 * IndexOutOfBoundsException with an appropriate error message.
	 */
	public int size(int index) {
		int count = 0;
		int subListSize = 0;
		if (index > size() - 1 || index < 0) {
			throw new IndexOutOfBoundsException("Index out of bounds, index bounds: [0," + size() + "]");
		} else {
			if (index == 0) {
				Node<T, K, O> thisNode = this.head;
				while (thisNode.down != null) {
					thisNode = thisNode.down;
					subListSize++;
				}
			} else {
				Node<T, K, O> currentNode = this.head;
				while (currentNode.right != null && count < index) {
					currentNode = currentNode.right;
					count++;
				}
				while (currentNode.down != null) {
					currentNode = currentNode.down;
					subListSize++;
				}
			}
		}
		return subListSize;
	}

	public void print() {
		// System.out.println(this.head.right.getCategory1());
		// System.out.println(this.head.down.getCategory1());
		// System.out.println(this.head.down.down.getCategory1());
		//
		// System.out.println(this.head.right.right.left.down.getCategory2());

		System.out.println(this.head.right.right.getCategory3());
	}

	public void print2() {
		System.out.println(this.head.getCategory1());
		System.out.println(this.head.down.getCategory1());
		System.out.println(this.head.down.down.getCategory1());
	}
}