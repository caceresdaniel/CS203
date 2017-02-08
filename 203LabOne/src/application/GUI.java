package application;

import java.util.ArrayList;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

public class GUI extends Application {

	Main main = new Main();
	double xModifier = 0.0, yModifier = 0.0;
	double newX = 0.0, newY = 0.0;
	public double[] points;
	Polygon[][] hexs;
	ArrayList<Double> nums = new ArrayList<Double>();

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

			VBox vb = new VBox();
			vb.getStyleClass().add("vbox");

			Pane triangles = new Pane();
			triangles.getStyleClass().add("pane");

			HBox buttons = new HBox();
			buttons.getStyleClass().add("buttons");

			pointCreator();

			System.out.println(nums.toString());

			triangles.getChildren().addAll();

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

	public void launchButton(Button butt, Pane pane) {
		butt.setOnMouseClicked(e -> {
			main.monitor();

		});
	}

	public void hexCreator() {
		hexs = new Polygon[6][5];

		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 5; j++) {
				hexs[i][j].getPoints().addAll(new Double[] {
						
				});
			}
		}
		hexs[0][0].getPoints().addAll(new Double[] {

		});

	}

	public void pointCreator() {
		double centerX = 411.0, centerY = 450.0;
		double x = 440.0, y = 500.0;
		points = new double[35];
		int val = 0;
		for (int j = 0; j < 6; j++) {
			nums.add(x);
			nums.add(y);
			for (int i = val; i < val + 2; i++) {

				nums.add(((centerX - x) * Math.cos(2 * i * Math.PI / 6) - (centerY - y) * Math.sin(2 * i * Math.PI / 6)
						+ x) + xModifier);
				nums.add(((centerX - x) * Math.sin(2 * i * Math.PI / 6) + (centerY - y) * Math.cos(2 * i * Math.PI / 6)
						+ y) + yModifier);
			}
			val++;
		}
	}
	
	public void pointSeperator(){
		double point1X, point1Y;
		
		
		
		
	}

	public static void main(String[] args) {
		launch(args);
	}

}