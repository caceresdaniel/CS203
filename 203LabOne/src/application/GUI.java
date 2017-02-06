package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

public class GUI extends Application {
	
	Main main = new Main();
	
	@Override
	public void start(Stage primaryStage) {
		try {

			primaryStage.setTitle("Lab 1");
			Pane pane = new Pane();

			pane.getStyleClass().add("mainPane");

			Scene sc = new Scene(pane);
			sc.getStylesheets().add("styles/style.css");

			Label title = new Label("Hexagon Solution");
			title.getStyleClass().add("title");

			Button butt = new Button("Launch");
			butt.getStyleClass().add("button");
			
			VBox  vb = new VBox();
			vb.getStyleClass().add("vbox");
			
			HBox triangles  = new  HBox();
			triangles.getStyleClass().add("hbox");
			
			HBox buttons = new HBox();
			buttons.getStyleClass().add("buttons");
			
			Polygon tri1 = new Polygon();
			
			tri1.getPoints().addAll(new Double[]{
					0.0, 0.0,
					20.0, 10.0,
					10.0, 20.0
			});
			
			tri1.setFill(Color.BLUE);
			tri1.setStroke(Color.WHITE);
			tri1.setLayoutX(500.0);
			tri1.setLayoutY(400.0);
			
			Polygon tri2 = new Polygon();
			
			tri2.getPoints().addAll(new Double[]{
					10.0,   9.0,
					50.0, 50.0,
					50.0, 60.0
			});
			
			
			
			tri2.setFill(Color.RED);
			tri2.setStroke(Color.WHITE);
			tri2.setLayoutX(40.0);
			tri2.setLayoutY(20.0);
			
			tri2.setRotate(90);
			
			triangles.getChildren().addAll(tri1, tri2);
			
			buttons.getChildren().addAll(butt);
			
			vb.getChildren().addAll(buttons, title, triangles);
			
			launchButton(butt, pane);
			
			pane.getChildren().add(vb);
	
			primaryStage.setScene(sc);
			primaryStage.show();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void launchButton(Button butt, Pane pane){
		butt.setOnMouseClicked(e ->{
			main.monitor();
			
		});
	}
	
	public static void main(String[] args){
		launch(args);
	}
	
	

}