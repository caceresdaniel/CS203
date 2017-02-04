package application;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Main {

	public List<Hexagon> hexagons = new ArrayList<Hexagon>();

	/****************************************************************/
	// Main where the GUI is called for user to do what he/she wants
	public void monitor() {
		String[] options = { "Quit", "Solve", "Grab Colors From File", "Print hexagon colors" };

		int selection;
		RecursiveSolver rs = new RecursiveSolver();

		do {
			selection = JOptionPane.showOptionDialog(null, "What would you like to do?", "Main Menu",
					JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, null);

			switch (selection) {
			case 1:
				insertZero();
				rs.solver(hexagons);
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

	/**************************************************/
	// reads from selected file and send the information
	// to the spaceRemover method where the spaces get
	// removed and then saves information to the
	// hexagon object
	private void grabFromFile() throws IOException {
		String[] field;

		JFileChooser fc = new JFileChooser();
		int val = fc.showOpenDialog(null);

		if (val == JFileChooser.APPROVE_OPTION) {
			File file = fc.getSelectedFile();
			Scanner fReader = new Scanner(file);

			while (fReader.hasNextLine()) {

				String noSpaces;
				String lineOfData;

				lineOfData = fReader.nextLine();
				noSpaces = spaceRemover(lineOfData);
				field = noSpaces.split("");

				hexagons.add(new Hexagon(Integer.parseInt(field[0]), field[1], field[2], field[3], field[4], field[5],
						field[6]));

			}
			fReader.close();
		}
	}

	/*********************************************************/
	// removes spaces then sends back the string of information
	// to be saved in the hexagon object
	private String spaceRemover(String lineOfData) {
		String noSpaces = "";

		for (int i = 0; i < lineOfData.length(); i++) {
			if (lineOfData.charAt(i) != ' ')
				noSpaces += lineOfData.charAt(i);
		}

		return noSpaces;
	}

	/******************************************************************/
	// inserting a zero to all objects to avoid crashes due to indicies
	public void insertZero() {
		for (int i = 0; i < hexagons.size(); i++) {
			hexagons.get(i).getUsedIn().add(0);
		}
	}
}