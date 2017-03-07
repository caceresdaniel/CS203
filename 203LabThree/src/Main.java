import java.io.File;
import java.io.FileNotFoundException;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		Main main = new Main();
		main.run();
	}

	public void run() throws FileNotFoundException {
		File test = new File("test.txt");
		LinkedList<String, String, String> ls = new LinkedList<>(test, 1);
		ls.print();
		System.out.println(ls.size());
		
		System.out.println("size of sublist of first node = " + ls.size(1));
		
		ls.delete(2, 0);
		System.out.println("size of sublist of first node = " + ls.size(1));
		System.out.println("size of mainList after deletion " + ls.size());
		
		ls.print();
		
		
		
		System.out.println(ls.get(2, 1));
	}
}