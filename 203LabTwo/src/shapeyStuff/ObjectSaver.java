package shapeyStuff;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ObjectSaver<T> {

	private File file;

	public ObjectSaver(File fileIn) {
		this.file = fileIn;
	}

	/*************************************************************************/										
	/*
	 * takes an integer as a parameter, this integer is the specific object in
	 * the file that you want to read. the first object in the file is 1, the
	 * second is 2 and so on. reads / loads the requested object and returns
	 * this object. this method should also throw an IOException if the
	 * parameter is outside the range of possible object positions in the file.
	 */
	public T readOneObject(int specific) throws IOException {
		ArrayList<T> specificObject = readAllObjects();

		if (specific > specificObject.size()) {
			throw new IOException("Parameter is outside the range of possible object positions");
		}

		return specificObject.get(specific);

	}

	/************************************************************************/
	/*
	 * returns an ArrayList of Generic Type which holds all the objects read
	 * from the file.
	 */
	
	public ArrayList<T> readAllObjects() {
		ObjectInputStream in = null;
		FileInputStream fin;
		ArrayList<T> allObjects = new ArrayList<T>();

		try {
			fin = new FileInputStream(file);
			in = new ObjectInputStream(fin);
			allObjects.add((T) in.readObject());
			

		} catch (Exception e) {
			e.printStackTrace();
		}
		finally{
			try{
				in.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		return allObjects;
	}

	/*************************************************************************/
	/*
	 * takes a generic class type as a parameter.takes a boolean value as a
	 * parameter. if the value is true append to the end of the file, if false,
	 * overwrite the old contents of the file. writes the object to the
	 * File.this method should also throw a NotSerializableException.
	 */
	public void writeOneObject(T singleObject, boolean value) throws NotSerializableException {
		ObjectOutputStream out = null;
		try {
			if (value) {
				out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
				out.writeObject(singleObject);
				out.close();
			} else if (!value) {
				new FileOutputStream(file).close();
				out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
				out.writeObject(singleObject);
				out.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/****************************************************************************/
	/*
	 * takes an ArrayList of any type as a parameter. takes a boolean value as a
	 * parameter. if the value is true append to the end of the file, if false,
	 * overwrite the old contents of the file. writes all the objects in the
	 * ArrayList to the File specified in the constructor. this method should
	 * also throw a NotSerializableException.
	 */
	public void writeAllObjects(ArrayList<T> allObjects, boolean value) throws NotSerializableException {
		ObjectOutputStream out = null;
		try {
			if (value) {
				out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
				out.writeObject(allObjects);
				out.close();
			} else if (!value) {
				new FileOutputStream(file).close();
				out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
				out.writeObject(allObjects);
				out.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}