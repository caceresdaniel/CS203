import java.io.File;
import java.io.FileNotFoundException;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		Main main = new Main();
		main.run();
	}

	public void run() throws FileNotFoundException {
		File test = new File("test.txt");
		LinkedList<String, String, String> ls = new LinkedList<>(test, 2);
		//ls.print();
		System.out.println(ls.size());
		
		System.out.println("size of sublist of first node = " + ls.size(0));
	}
}
