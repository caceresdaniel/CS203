package application;

import java.io.File;
import java.io.FileNotFoundException;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
	Label[][] lbl;
	int count = 0;
	int maxSubSize = 0;
	Button regroupButt = new Button("Regroup List");
	Button clearButt = new Button("Clear List");
	Button fileButt = new Button("Create List From File");
	Button sizeButt = new Button("Size of List");
	Button quitButt = new Button("Quit");
	Button addButt = new Button("Add Node to List");
	Button delButt = new Button("Delete a Node");
	Button getButt = new Button("Get Node information");
	GridPane gp = new GridPane();
	HBox hb = new HBox();
	VBox vb = new VBox();
	// File file = new File();

	@Override
	public void start(Stage primaryStage) {
		try {
			primaryStage.setTitle("LinkedList");

			hb.getStyleClass().add("hBox");
			gp.getStyleClass().add("gridPane");

			regroupButt.getStyleClass().add("button");
			clearButt.getStyleClass().add("button");
			fileButt.getStyleClass().add("button");
			sizeButt.getStyleClass().add("button");
			quitButt.getStyleClass().add("button");
			addButt.getStyleClass().add("button");
			delButt.getStyleClass().add("button");
			getButt.getStyleClass().add("button");

			File file = new File("test.txt");
			LinkedList<String, String, String> ls = new LinkedList<>(file, 1);
			fileChooser();

			sizeButton(ls);
			findSubSizes(ls);
			createGrid(ls);

			Scene sc = new Scene(vb, 1000, 1000);
			sc.getStylesheets().add("styles/style.css");

			hb.getChildren().addAll(fileButt, addButt, delButt, clearButt, getButt, regroupButt, sizeButt, quitButt);

			vb.getChildren().addAll(hb, gp);

			primaryStage.setScene(sc);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public <T, K, O> void createGrid(LinkedList<T, K, O> ls) {
		int size = ls.size() * 2 - 1;
		lbl = new Label[size][maxSubSize * 2 -1];
		for (int col = 0; col < size; col++) {
			for (int row = 0; row < maxSubSize * 2 - 1; row++) {
				Label l = new Label();
				setGrid(ls, l, row, col);
				lbl[col][row] = l;
				gp.add(l, col, row);
			}
		}
	}

	public <T, K, O> void setGrid(LinkedList<T, K, O> ls, Label l, int row, int col) {

		if (col >= 2 && col % 2 == 0 && row == 0) {
			count++;
		}
		

		if (col == 0 && row == 0) {
			l.setText(ls.toString(0, 0));
			l.getStyleClass().add("node");
		} else if (col >= 2 && row == 0 && col % 2 == 0) {
			l.setText(ls.toString(col - count, 0));
			l.getStyleClass().add("node");
		} else if (row == 0) {
			l.getStyleClass().add("doubleArrow");
		} else if (col % 2 == 0){
			l.getStyleClass().add("singleArrow");
		} else if( col == 0 && ){
			l.getStyleClass().add("blankSpace");
		}

	}

	public <T,K,O> void findSubSizes(LinkedList<T,K,O> ls){
		int mainListSize = ls.size();
		Integer[] subListSizes = new Integer[mainListSize];
		
		for(int i = 0; i < mainListSize; i++){
			subListSizes[i] = ls.size(i);
		}
		
		maxSubSize = 0;
		
		for(int l = 0; l < subListSizes.length; l++){
			if(subListSizes[l] > maxSubSize){
				maxSubSize = subListSizes[l];
			}
		}
		
		
	}
	
	
	public void fileChooser() {
		fileButt.setOnMouseClicked(e -> {
			int category = Integer.valueOf(JOptionPane.showInputDialog(null,
					"Enter the number correspoding to the category in which you would like to order the list by."));
			JFileChooser fc = new JFileChooser();
			int val = fc.showOpenDialog(null);
			if (val == JFileChooser.APPROVE_OPTION) {
				File file = fc.getSelectedFile();
				try {
					LinkedList<Integer, String, String> ls = new LinkedList<>(file, category);
				} catch (FileNotFoundException f) {
					f.printStackTrace();
				}
			}
		});

	}

	public void addButton() {
		addButt.setOnMouseClicked(e -> {

		});
	}

	public void delButton() {

	}

	public <T, K, O> void sizeButton(LinkedList<T, K, O> ls) {
		sizeButt.setOnMouseClicked(e -> {
			createGrid(ls);
			// System.out.println(ls.size());
		});
	}

	public static void main(String[] args) {
		launch(args);
	}
}
