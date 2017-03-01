import java.io.File;

public class Main {

	public static void main(String[] args){
		Main main = new Main();
		main.run();
	}
	
	public void run(){
		File test = new File("test.txt");
		LinkedList<String, String, String> ls = new LinkedList<>(test,2);
		
		//ls.print();
	}
}
