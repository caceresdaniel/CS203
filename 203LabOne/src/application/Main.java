package application;

import javax.swing.JOptionPane;
import javax.swing.JFileChooser;
import java.util.List;
import java.util.Scanner;
import java.io.*;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

	private String lineOfData;
	private String[] field;
	public List<Hexagon> hexagons = new ArrayList<Hexagon>();

	public void monitor() {
		String[] options = { "Quit", "Solve", "Grab Colors From File", "Print hexagon colors" };

		int selection;
		RecursiveSolver rs = new RecursiveSolver();

		do {

			selection = JOptionPane.showOptionDialog(null, "What would you like to do?", "Main Menu",
					JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, null);

			switch (selection) {
			case 1:
				rs.solver(hexagons);
//				JOptionPane.showMessageDialog(null, "Not Yet Implemented");
				break;
			case 2:
				try {
					grabFromFile();
				} catch (IOException e) {
					System.err.println(e);
					System.exit(1);
				}
				break;
			case 3:
				JOptionPane.showMessageDialog(null, hexagons.toArray());
				break;
			}
		} while (selection != 0);
	}

	private void grabFromFile() throws IOException {

		JFileChooser fc = new JFileChooser();
		int val = fc.showOpenDialog(null);

		if (val == JFileChooser.APPROVE_OPTION) {
			File file = fc.getSelectedFile();
			Scanner fReader = new Scanner(file);

			while (fReader.hasNextLine()) {

				String noSpaces;

				lineOfData = fReader.nextLine();
				noSpaces = spaceRemover(lineOfData);
				field = noSpaces.split("");

				hexagons.add(new Hexagon(Integer.parseInt(field[0]), field[1], field[2], field[3], field[4], field[5],
						field[6]));

			}
			fReader.close();
		}
	}

	private String spaceRemover(String lineOfData) {

		String noSpaces = "";

		for (int i = 0; i < lineOfData.length(); i++) {
			if (lineOfData.charAt(i) != ' ')
				noSpaces += lineOfData.charAt(i);
		}

		return noSpaces;
	}
}