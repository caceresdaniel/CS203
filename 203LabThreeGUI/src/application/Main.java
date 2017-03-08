package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
	Button regroupButt = new Button("Regroup List");
	Button clearButt = new Button("Clear List");
	Button fileButt = new Button("File");
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
	
	public void createGrid(){
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
