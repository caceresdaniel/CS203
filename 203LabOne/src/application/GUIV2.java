package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class GUIV2 extends Application {
	Pane triangles = new Pane();
	
	@Override 
	public void start(Stage primaryStage){
		primaryStage.setTitle("Lab 1");
		Pane pane = new Pane();
		
		pane.getStyleClass().add("mainPane");
		
		Scene sc = new Scene(pane);
		sc.getStylesheets().add("styles/style.css");
		
		Label title = new Label("Hexagon Puzzle Solution");
		title.getStyleClass().add("title");
		
		VBox vb =new VBox();
		vb.getStyleClass().add("vbox");
		
		triangles.getStyleClass().add("pane");		
		
		vb.getChildren().addAll(title, triangles);
		
		pane.getChildren().add(vb);
		
		primaryStage.setScene(sc);
		primaryStage.show();
	}
}
