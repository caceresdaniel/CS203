package application;

import java.util.List;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

public class GUI extends Application {

	Main main = new Main();
	Pane triangles = new Pane();

	// Attempted to do it simply but could not figure it out in time
	// so I resorted to doing it the easiest and ugliest way.... I feel ashamed

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

			triangles.getStyleClass().add("pane");

			disgustingCode();

			HBox buttons = new HBox();
			buttons.getStyleClass().add("buttons");

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

	public void colorSetter(List<Hexagon> hexagons) {

	}

	public void disgustingCode() {
		/**********************************/
		// Hexagon 1
		Polygon polygon11 = new Polygon();
		Polygon polygon12 = new Polygon();
		Polygon polygon13 = new Polygon();
		Polygon polygon14 = new Polygon();
		Polygon polygon15 = new Polygon();
		Polygon polygon16 = new Polygon();
		polygon11.setStroke(Color.WHITE);
		polygon12.setStroke(Color.WHITE);
		polygon13.setStroke(Color.WHITE);
		polygon14.setStroke(Color.WHITE);
		polygon15.setStroke(Color.WHITE);
		polygon16.setStroke(Color.WHITE);
		ObservableList<Double> list11 = polygon11.getPoints();
		ObservableList<Double> list12 = polygon12.getPoints();
		ObservableList<Double> list13 = polygon13.getPoints();
		ObservableList<Double> list14 = polygon14.getPoints();
		ObservableList<Double> list15 = polygon15.getPoints();
		ObservableList<Double> list16 = polygon16.getPoints();
		triangles.getChildren().addAll(polygon11, polygon12, polygon13, polygon14, polygon15, polygon16);

		/**********************************/
		// Hexagon 2
		Polygon polygon21 = new Polygon();
		Polygon polygon22 = new Polygon();
		Polygon polygon23 = new Polygon();
		Polygon polygon24 = new Polygon();
		Polygon polygon25 = new Polygon();
		Polygon polygon26 = new Polygon();
		polygon21.setStroke(Color.WHITE);
		polygon22.setStroke(Color.WHITE);
		polygon23.setStroke(Color.WHITE);
		polygon24.setStroke(Color.WHITE);
		polygon25.setStroke(Color.WHITE);
		polygon26.setStroke(Color.WHITE);
		ObservableList<Double> list21 = polygon21.getPoints();
		ObservableList<Double> list22 = polygon22.getPoints();
		ObservableList<Double> list23 = polygon23.getPoints();
		ObservableList<Double> list24 = polygon24.getPoints();
		ObservableList<Double> list25 = polygon25.getPoints();
		ObservableList<Double> list26 = polygon26.getPoints();
		triangles.getChildren().addAll(polygon21, polygon22, polygon23, polygon24, polygon25, polygon26);

		/**********************************/
		// Hexagon 3
		Polygon polygon31 = new Polygon();
		Polygon polygon32 = new Polygon();
		Polygon polygon33 = new Polygon();
		Polygon polygon34 = new Polygon();
		Polygon polygon35 = new Polygon();
		Polygon polygon36 = new Polygon();
		polygon31.setStroke(Color.WHITE);
		polygon32.setStroke(Color.WHITE);
		polygon33.setStroke(Color.WHITE);
		polygon34.setStroke(Color.WHITE);
		polygon35.setStroke(Color.WHITE);
		polygon36.setStroke(Color.WHITE);
		ObservableList<Double> list31 = polygon31.getPoints();
		ObservableList<Double> list32 = polygon32.getPoints();
		ObservableList<Double> list33 = polygon33.getPoints();
		ObservableList<Double> list34 = polygon34.getPoints();
		ObservableList<Double> list35 = polygon35.getPoints();
		ObservableList<Double> list36 = polygon36.getPoints();
		triangles.getChildren().addAll(polygon31, polygon32, polygon33, polygon34, polygon35, polygon36);

		/**********************************/
		// Hexagon 4
		Polygon polygon41 = new Polygon();
		Polygon polygon42 = new Polygon();
		Polygon polygon43 = new Polygon();
		Polygon polygon44 = new Polygon();
		Polygon polygon45 = new Polygon();
		Polygon polygon46 = new Polygon();
		polygon41.setStroke(Color.WHITE);
		polygon42.setStroke(Color.WHITE);
		polygon43.setStroke(Color.WHITE);
		polygon44.setStroke(Color.WHITE);
		polygon45.setStroke(Color.WHITE);
		polygon46.setStroke(Color.WHITE);
		ObservableList<Double> list41 = polygon41.getPoints();
		ObservableList<Double> list42 = polygon42.getPoints();
		ObservableList<Double> list43 = polygon43.getPoints();
		ObservableList<Double> list44 = polygon44.getPoints();
		ObservableList<Double> list45 = polygon45.getPoints();
		ObservableList<Double> list46 = polygon46.getPoints();
		triangles.getChildren().addAll(polygon41, polygon42, polygon43, polygon44, polygon45, polygon46);

		/**********************************/
		// Hexagon 5
		Polygon polygon51 = new Polygon();
		Polygon polygon52 = new Polygon();
		Polygon polygon53 = new Polygon();
		Polygon polygon54 = new Polygon();
		Polygon polygon55 = new Polygon();
		Polygon polygon56 = new Polygon();
		polygon51.setStroke(Color.WHITE);
		polygon52.setStroke(Color.WHITE);
		polygon53.setStroke(Color.WHITE);
		polygon54.setStroke(Color.WHITE);
		polygon55.setStroke(Color.WHITE);
		polygon56.setStroke(Color.WHITE);
		ObservableList<Double> list51 = polygon51.getPoints();
		ObservableList<Double> list52 = polygon52.getPoints();
		ObservableList<Double> list53 = polygon53.getPoints();
		ObservableList<Double> list54 = polygon54.getPoints();
		ObservableList<Double> list55 = polygon55.getPoints();
		ObservableList<Double> list56 = polygon56.getPoints();
		triangles.getChildren().addAll(polygon51, polygon52, polygon53, polygon54, polygon55, polygon56);

		/**********************************/
		// Hexagon 6
		Polygon polygon61 = new Polygon();
		Polygon polygon62 = new Polygon();
		Polygon polygon63 = new Polygon();
		Polygon polygon64 = new Polygon();
		Polygon polygon65 = new Polygon();
		Polygon polygon66 = new Polygon();
		polygon61.setStroke(Color.WHITE);
		polygon62.setStroke(Color.WHITE);
		polygon63.setStroke(Color.WHITE);
		polygon64.setStroke(Color.WHITE);
		polygon65.setStroke(Color.WHITE);
		polygon66.setStroke(Color.WHITE);
		ObservableList<Double> list61 = polygon61.getPoints();
		ObservableList<Double> list62 = polygon62.getPoints();
		ObservableList<Double> list63 = polygon63.getPoints();
		ObservableList<Double> list64 = polygon64.getPoints();
		ObservableList<Double> list65 = polygon65.getPoints();
		ObservableList<Double> list66 = polygon66.getPoints();
		triangles.getChildren().addAll(polygon61, polygon62, polygon63, polygon64, polygon65, polygon66);

		/**********************************/
		// Hexagon 7
		Polygon polygon71 = new Polygon();
		Polygon polygon72 = new Polygon();
		Polygon polygon73 = new Polygon();
		Polygon polygon74 = new Polygon();
		Polygon polygon75 = new Polygon();
		Polygon polygon76 = new Polygon();
		polygon71.setStroke(Color.WHITE);
		polygon72.setStroke(Color.WHITE);
		polygon73.setStroke(Color.WHITE);
		polygon74.setStroke(Color.WHITE);
		polygon75.setStroke(Color.WHITE);
		polygon76.setStroke(Color.WHITE);
		ObservableList<Double> list71 = polygon71.getPoints();
		ObservableList<Double> list72 = polygon72.getPoints();
		ObservableList<Double> list73 = polygon73.getPoints();
		ObservableList<Double> list74 = polygon74.getPoints();
		ObservableList<Double> list75 = polygon75.getPoints();
		ObservableList<Double> list76 = polygon76.getPoints();
		triangles.getChildren().addAll(polygon71, polygon72, polygon73, polygon74, polygon75, polygon76);

		double centerX = 411.0, centerY = 450.0;
		double x = 440.0, y = 500.0;

		/****************************************************************************************************************/
		// Hexagon 1
		double xModifier = -30.0, yModifier = -170.0;
		list11.addAll(x + xModifier, y + yModifier);
		for (int i = 0; i < 2; i++) {
			list11.add(
					((centerX - x) * Math.cos(2 * i * Math.PI / 6) - (centerY - y) * Math.sin(2 * i * Math.PI / 6) + x)
							+ xModifier);
			list11.add(
					((centerX - x) * Math.sin(2 * i * Math.PI / 6) + (centerY - y) * Math.cos(2 * i * Math.PI / 6) + y)
							+ yModifier);
		}
		list12.addAll(x + xModifier, y + yModifier);
		for (int i = 1; i < 3; i++) {
			list12.add(
					((centerX - x) * Math.cos(2 * i * Math.PI / 6) - (centerY - y) * Math.sin(2 * i * Math.PI / 6) + x)
							+ xModifier);
			list12.add(
					((centerX - x) * Math.sin(2 * i * Math.PI / 6) + (centerY - y) * Math.cos(2 * i * Math.PI / 6) + y)
							+ yModifier);
		}
		list13.addAll(x + xModifier, y + yModifier);
		for (int i = 2; i < 4; i++) {
			list13.add(
					((centerX - x) * Math.cos(2 * i * Math.PI / 6) - (centerY - y) * Math.sin(2 * i * Math.PI / 6) + x)
							+ xModifier);
			list13.add(
					((centerX - x) * Math.sin(2 * i * Math.PI / 6) + (centerY - y) * Math.cos(2 * i * Math.PI / 6) + y)
							+ yModifier);
		}
		list14.addAll(x + xModifier, y + yModifier);
		for (int i = 3; i < 5; i++) {
			list14.add(
					((centerX - x) * Math.cos(2 * i * Math.PI / 6) - (centerY - y) * Math.sin(2 * i * Math.PI / 6) + x)
							+ xModifier);
			list14.add(
					((centerX - x) * Math.sin(2 * i * Math.PI / 6) + (centerY - y) * Math.cos(2 * i * Math.PI / 6) + y)
							+ yModifier);
		}
		list15.addAll(x + xModifier, y + yModifier);
		for (int i = 4; i < 6; i++) {
			list15.add(
					((centerX - x) * Math.cos(2 * i * Math.PI / 6) - (centerY - y) * Math.sin(2 * i * Math.PI / 6) + x)
							+ xModifier);
			list15.add(
					((centerX - x) * Math.sin(2 * i * Math.PI / 6) + (centerY - y) * Math.cos(2 * i * Math.PI / 6) + y)
							+ yModifier);
		}
		list16.addAll(x + xModifier, y + yModifier);
		for (int i = 5; i < 7; i++) {
			list16.add(
					((centerX - x) * Math.cos(2 * i * Math.PI / 6) - (centerY - y) * Math.sin(2 * i * Math.PI / 6) + x)
							+ xModifier);
			list16.add(
					((centerX - x) * Math.sin(2 * i * Math.PI / 6) + (centerY - y) * Math.cos(2 * i * Math.PI / 6) + y)
							+ yModifier);
		}

		/****************************************************************************************************************/
		// Hexagon 2
		xModifier = -30;
		yModifier = -270;
		list21.addAll(x + xModifier, y + yModifier);
		for (int i = 0; i < 2; i++) {
			list21.add(
					((centerX - x) * Math.cos(2 * i * Math.PI / 6) - (centerY - y) * Math.sin(2 * i * Math.PI / 6) + x)
							+ xModifier);
			list21.add(
					((centerX - x) * Math.sin(2 * i * Math.PI / 6) + (centerY - y) * Math.cos(2 * i * Math.PI / 6) + y)
							+ yModifier);
		}
		list22.addAll(x + xModifier, y + yModifier);
		for (int i = 1; i < 3; i++) {
			list22.add(
					((centerX - x) * Math.cos(2 * i * Math.PI / 6) - (centerY - y) * Math.sin(2 * i * Math.PI / 6) + x)
							+ xModifier);
			list22.add(
					((centerX - x) * Math.sin(2 * i * Math.PI / 6) + (centerY - y) * Math.cos(2 * i * Math.PI / 6) + y)
							+ yModifier);
		}
		list23.addAll(x + xModifier, y + yModifier);
		for (int i = 2; i < 4; i++) {
			list23.add(
					((centerX - x) * Math.cos(2 * i * Math.PI / 6) - (centerY - y) * Math.sin(2 * i * Math.PI / 6) + x)
							+ xModifier);
			list23.add(
					((centerX - x) * Math.sin(2 * i * Math.PI / 6) + (centerY - y) * Math.cos(2 * i * Math.PI / 6) + y)
							+ yModifier);
		}
		list24.addAll(x + xModifier, y + yModifier);
		for (int i = 3; i < 5; i++) {
			list24.add(
					((centerX - x) * Math.cos(2 * i * Math.PI / 6) - (centerY - y) * Math.sin(2 * i * Math.PI / 6) + x)
							+ xModifier);
			list24.add(
					((centerX - x) * Math.sin(2 * i * Math.PI / 6) + (centerY - y) * Math.cos(2 * i * Math.PI / 6) + y)
							+ yModifier);
		}
		list25.addAll(x + xModifier, y + yModifier);
		for (int i = 4; i < 6; i++) {
			list25.add(
					((centerX - x) * Math.cos(2 * i * Math.PI / 6) - (centerY - y) * Math.sin(2 * i * Math.PI / 6) + x)
							+ xModifier);
			list25.add(
					((centerX - x) * Math.sin(2 * i * Math.PI / 6) + (centerY - y) * Math.cos(2 * i * Math.PI / 6) + y)
							+ yModifier);
		}
		list26.addAll(x + xModifier, y + yModifier);
		for (int i = 5; i < 7; i++) {
			list26.add(
					((centerX - x) * Math.cos(2 * i * Math.PI / 6) - (centerY - y) * Math.sin(2 * i * Math.PI / 6) + x)
							+ xModifier);
			list26.add(
					((centerX - x) * Math.sin(2 * i * Math.PI / 6) + (centerY - y) * Math.cos(2 * i * Math.PI / 6) + y)
							+ yModifier);
		}

		/****************************************************************************************************************/
		// Hexagon 3
		xModifier = 60;
		yModifier = -220;
		list31.addAll(x + xModifier, y + yModifier);
		for (int i = 0; i < 2; i++) {
			list31.add(
					((centerX - x) * Math.cos(2 * i * Math.PI / 6) - (centerY - y) * Math.sin(2 * i * Math.PI / 6) + x)
							+ xModifier);
			list31.add(
					((centerX - x) * Math.sin(2 * i * Math.PI / 6) + (centerY - y) * Math.cos(2 * i * Math.PI / 6) + y)
							+ yModifier);
		}
		list32.addAll(x + xModifier, y + yModifier);
		for (int i = 1; i < 3; i++) {
			list32.add(
					((centerX - x) * Math.cos(2 * i * Math.PI / 6) - (centerY - y) * Math.sin(2 * i * Math.PI / 6) + x)
							+ xModifier);
			list32.add(
					((centerX - x) * Math.sin(2 * i * Math.PI / 6) + (centerY - y) * Math.cos(2 * i * Math.PI / 6) + y)
							+ yModifier);
		}
		list33.addAll(x + xModifier, y + yModifier);
		for (int i = 2; i < 4; i++) {
			list33.add(
					((centerX - x) * Math.cos(2 * i * Math.PI / 6) - (centerY - y) * Math.sin(2 * i * Math.PI / 6) + x)
							+ xModifier);
			list33.add(
					((centerX - x) * Math.sin(2 * i * Math.PI / 6) + (centerY - y) * Math.cos(2 * i * Math.PI / 6) + y)
							+ yModifier);
		}
		list34.addAll(x + xModifier, y + yModifier);
		for (int i = 3; i < 5; i++) {
			list34.add(
					((centerX - x) * Math.cos(2 * i * Math.PI / 6) - (centerY - y) * Math.sin(2 * i * Math.PI / 6) + x)
							+ xModifier);
			list34.add(
					((centerX - x) * Math.sin(2 * i * Math.PI / 6) + (centerY - y) * Math.cos(2 * i * Math.PI / 6) + y)
							+ yModifier);
		}
		list35.addAll(x + xModifier, y + yModifier);
		for (int i = 4; i < 6; i++) {
			list35.add(
					((centerX - x) * Math.cos(2 * i * Math.PI / 6) - (centerY - y) * Math.sin(2 * i * Math.PI / 6) + x)
							+ xModifier);
			list35.add(
					((centerX - x) * Math.sin(2 * i * Math.PI / 6) + (centerY - y) * Math.cos(2 * i * Math.PI / 6) + y)
							+ yModifier);
		}
		list36.addAll(x + xModifier, y + yModifier);
		for (int i = 5; i < 7; i++) {
			list36.add(
					((centerX - x) * Math.cos(2 * i * Math.PI / 6) - (centerY - y) * Math.sin(2 * i * Math.PI / 6) + x)
							+ xModifier);
			list36.add(
					((centerX - x) * Math.sin(2 * i * Math.PI / 6) + (centerY - y) * Math.cos(2 * i * Math.PI / 6) + y)
							+ yModifier);
		}

		/****************************************************************************************************************/
		// Hexagon 4
		xModifier = 60;
		yModifier = -120;
		list41.addAll(x + xModifier, y + yModifier);
		for (int i = 0; i < 2; i++) {
			list41.add(
					((centerX - x) * Math.cos(2 * i * Math.PI / 6) - (centerY - y) * Math.sin(2 * i * Math.PI / 6) + x)
							+ xModifier);
			list41.add(
					((centerX - x) * Math.sin(2 * i * Math.PI / 6) + (centerY - y) * Math.cos(2 * i * Math.PI / 6) + y)
							+ yModifier);
		}
		list42.addAll(x + xModifier, y + yModifier);
		for (int i = 1; i < 3; i++) {
			list42.add(
					((centerX - x) * Math.cos(2 * i * Math.PI / 6) - (centerY - y) * Math.sin(2 * i * Math.PI / 6) + x)
							+ xModifier);
			list42.add(
					((centerX - x) * Math.sin(2 * i * Math.PI / 6) + (centerY - y) * Math.cos(2 * i * Math.PI / 6) + y)
							+ yModifier);
		}
		list43.addAll(x + xModifier, y + yModifier);
		for (int i = 2; i < 4; i++) {
			list43.add(
					((centerX - x) * Math.cos(2 * i * Math.PI / 6) - (centerY - y) * Math.sin(2 * i * Math.PI / 6) + x)
							+ xModifier);
			list43.add(
					((centerX - x) * Math.sin(2 * i * Math.PI / 6) + (centerY - y) * Math.cos(2 * i * Math.PI / 6) + y)
							+ yModifier);
		}
		list44.addAll(x + xModifier, y + yModifier);
		for (int i = 3; i < 5; i++) {
			list44.add(
					((centerX - x) * Math.cos(2 * i * Math.PI / 6) - (centerY - y) * Math.sin(2 * i * Math.PI / 6) + x)
							+ xModifier);
			list44.add(
					((centerX - x) * Math.sin(2 * i * Math.PI / 6) + (centerY - y) * Math.cos(2 * i * Math.PI / 6) + y)
							+ yModifier);
		}
		list45.addAll(x + xModifier, y + yModifier);
		for (int i = 4; i < 6; i++) {
			list45.add(
					((centerX - x) * Math.cos(2 * i * Math.PI / 6) - (centerY - y) * Math.sin(2 * i * Math.PI / 6) + x)
							+ xModifier);
			list45.add(
					((centerX - x) * Math.sin(2 * i * Math.PI / 6) + (centerY - y) * Math.cos(2 * i * Math.PI / 6) + y)
							+ yModifier);
		}
		list46.addAll(x + xModifier, y + yModifier);
		for (int i = 5; i < 7; i++) {
			list46.add(
					((centerX - x) * Math.cos(2 * i * Math.PI / 6) - (centerY - y) * Math.sin(2 * i * Math.PI / 6) + x)
							+ xModifier);
			list46.add(
					((centerX - x) * Math.sin(2 * i * Math.PI / 6) + (centerY - y) * Math.cos(2 * i * Math.PI / 6) + y)
							+ yModifier);
		}

		/****************************************************************************************************************/
		// Hexagon 5
		xModifier = -30;
		yModifier = -70;
		list51.addAll(x + xModifier, y + yModifier);
		for (int i = 0; i < 2; i++) {
			list51.add(
					((centerX - x) * Math.cos(2 * i * Math.PI / 6) - (centerY - y) * Math.sin(2 * i * Math.PI / 6) + x)
							+ xModifier);
			list51.add(
					((centerX - x) * Math.sin(2 * i * Math.PI / 6) + (centerY - y) * Math.cos(2 * i * Math.PI / 6) + y)
							+ yModifier);
		}
		list52.addAll(x + xModifier, y + yModifier);
		for (int i = 1; i < 3; i++) {
			list52.add(
					((centerX - x) * Math.cos(2 * i * Math.PI / 6) - (centerY - y) * Math.sin(2 * i * Math.PI / 6) + x)
							+ xModifier);
			list52.add(
					((centerX - x) * Math.sin(2 * i * Math.PI / 6) + (centerY - y) * Math.cos(2 * i * Math.PI / 6) + y)
							+ yModifier);
		}
		list53.addAll(x + xModifier, y + yModifier);
		for (int i = 2; i < 4; i++) {
			list53.add(
					((centerX - x) * Math.cos(2 * i * Math.PI / 6) - (centerY - y) * Math.sin(2 * i * Math.PI / 6) + x)
							+ xModifier);
			list53.add(
					((centerX - x) * Math.sin(2 * i * Math.PI / 6) + (centerY - y) * Math.cos(2 * i * Math.PI / 6) + y)
							+ yModifier);
		}
		list54.addAll(x + xModifier, y + yModifier);
		for (int i = 3; i < 5; i++) {
			list54.add(
					((centerX - x) * Math.cos(2 * i * Math.PI / 6) - (centerY - y) * Math.sin(2 * i * Math.PI / 6) + x)
							+ xModifier);
			list54.add(
					((centerX - x) * Math.sin(2 * i * Math.PI / 6) + (centerY - y) * Math.cos(2 * i * Math.PI / 6) + y)
							+ yModifier);
		}
		list55.addAll(x + xModifier, y + yModifier);
		for (int i = 4; i < 6; i++) {
			list55.add(
					((centerX - x) * Math.cos(2 * i * Math.PI / 6) - (centerY - y) * Math.sin(2 * i * Math.PI / 6) + x)
							+ xModifier);
			list55.add(
					((centerX - x) * Math.sin(2 * i * Math.PI / 6) + (centerY - y) * Math.cos(2 * i * Math.PI / 6) + y)
							+ yModifier);
		}
		list56.addAll(x + xModifier, y + yModifier);
		for (int i = 5; i < 7; i++) {
			list56.add(
					((centerX - x) * Math.cos(2 * i * Math.PI / 6) - (centerY - y) * Math.sin(2 * i * Math.PI / 6) + x)
							+ xModifier);
			list56.add(
					((centerX - x) * Math.sin(2 * i * Math.PI / 6) + (centerY - y) * Math.cos(2 * i * Math.PI / 6) + y)
							+ yModifier);
		}

		/****************************************************************************************************************/
		// Hexagon 6
		xModifier = -120;
		yModifier = -120;
		list61.addAll(x + xModifier, y + yModifier);
		for (int i = 0; i < 2; i++) {
			list61.add(
					((centerX - x) * Math.cos(2 * i * Math.PI / 6) - (centerY - y) * Math.sin(2 * i * Math.PI / 6) + x)
							+ xModifier);
			list61.add(
					((centerX - x) * Math.sin(2 * i * Math.PI / 6) + (centerY - y) * Math.cos(2 * i * Math.PI / 6) + y)
							+ yModifier);
		}
		list62.addAll(x + xModifier, y + yModifier);
		for (int i = 1; i < 3; i++) {
			list62.add(
					((centerX - x) * Math.cos(2 * i * Math.PI / 6) - (centerY - y) * Math.sin(2 * i * Math.PI / 6) + x)
							+ xModifier);
			list62.add(
					((centerX - x) * Math.sin(2 * i * Math.PI / 6) + (centerY - y) * Math.cos(2 * i * Math.PI / 6) + y)
							+ yModifier);
		}
		list63.addAll(x + xModifier, y + yModifier);
		for (int i = 2; i < 4; i++) {
			list63.add(
					((centerX - x) * Math.cos(2 * i * Math.PI / 6) - (centerY - y) * Math.sin(2 * i * Math.PI / 6) + x)
							+ xModifier);
			list63.add(
					((centerX - x) * Math.sin(2 * i * Math.PI / 6) + (centerY - y) * Math.cos(2 * i * Math.PI / 6) + y)
							+ yModifier);
		}
		list64.addAll(x + xModifier, y + yModifier);
		for (int i = 3; i < 5; i++) {
			list64.add(
					((centerX - x) * Math.cos(2 * i * Math.PI / 6) - (centerY - y) * Math.sin(2 * i * Math.PI / 6) + x)
							+ xModifier);
			list64.add(
					((centerX - x) * Math.sin(2 * i * Math.PI / 6) + (centerY - y) * Math.cos(2 * i * Math.PI / 6) + y)
							+ yModifier);
		}
		list65.addAll(x + xModifier, y + yModifier);
		for (int i = 4; i < 6; i++) {
			list65.add(
					((centerX - x) * Math.cos(2 * i * Math.PI / 6) - (centerY - y) * Math.sin(2 * i * Math.PI / 6) + x)
							+ xModifier);
			list65.add(
					((centerX - x) * Math.sin(2 * i * Math.PI / 6) + (centerY - y) * Math.cos(2 * i * Math.PI / 6) + y)
							+ yModifier);
		}
		list66.addAll(x + xModifier, y + yModifier);
		for (int i = 5; i < 7; i++) {
			list66.add(
					((centerX - x) * Math.cos(2 * i * Math.PI / 6) - (centerY - y) * Math.sin(2 * i * Math.PI / 6) + x)
							+ xModifier);
			list66.add(
					((centerX - x) * Math.sin(2 * i * Math.PI / 6) + (centerY - y) * Math.cos(2 * i * Math.PI / 6) + y)
							+ yModifier);
		}

		/****************************************************************************************************************/
		// Hexagon 7
		xModifier = -120;
		yModifier = -220;
		list71.addAll(x + xModifier, y + yModifier);
		for (int i = 0; i < 2; i++) {
			list71.add(
					((centerX - x) * Math.cos(2 * i * Math.PI / 6) - (centerY - y) * Math.sin(2 * i * Math.PI / 6) + x)
							+ xModifier);
			list71.add(
					((centerX - x) * Math.sin(2 * i * Math.PI / 6) + (centerY - y) * Math.cos(2 * i * Math.PI / 6) + y)
							+ yModifier);
		}
		list72.addAll(x + xModifier, y + yModifier);
		for (int i = 1; i < 3; i++) {
			list72.add(
					((centerX - x) * Math.cos(2 * i * Math.PI / 6) - (centerY - y) * Math.sin(2 * i * Math.PI / 6) + x)
							+ xModifier);
			list72.add(
					((centerX - x) * Math.sin(2 * i * Math.PI / 6) + (centerY - y) * Math.cos(2 * i * Math.PI / 6) + y)
							+ yModifier);
		}
		list73.addAll(x + xModifier, y + yModifier);
		for (int i = 2; i < 4; i++) {
			list73.add(
					((centerX - x) * Math.cos(2 * i * Math.PI / 6) - (centerY - y) * Math.sin(2 * i * Math.PI / 6) + x)
							+ xModifier);
			list73.add(
					((centerX - x) * Math.sin(2 * i * Math.PI / 6) + (centerY - y) * Math.cos(2 * i * Math.PI / 6) + y)
							+ yModifier);
		}
		list74.addAll(x + xModifier, y + yModifier);
		for (int i = 3; i < 5; i++) {
			list74.add(
					((centerX - x) * Math.cos(2 * i * Math.PI / 6) - (centerY - y) * Math.sin(2 * i * Math.PI / 6) + x)
							+ xModifier);
			list74.add(
					((centerX - x) * Math.sin(2 * i * Math.PI / 6) + (centerY - y) * Math.cos(2 * i * Math.PI / 6) + y)
							+ yModifier);
		}
		list75.addAll(x + xModifier, y + yModifier);
		for (int i = 4; i < 6; i++) {
			list75.add(
					((centerX - x) * Math.cos(2 * i * Math.PI / 6) - (centerY - y) * Math.sin(2 * i * Math.PI / 6) + x)
							+ xModifier);
			list75.add(
					((centerX - x) * Math.sin(2 * i * Math.PI / 6) + (centerY - y) * Math.cos(2 * i * Math.PI / 6) + y)
							+ yModifier);
		}
		list76.addAll(x + xModifier, y + yModifier);
		for (int i = 5; i < 7; i++) {
			list76.add(
					((centerX - x) * Math.cos(2 * i * Math.PI / 6) - (centerY - y) * Math.sin(2 * i * Math.PI / 6) + x)
							+ xModifier);
			list76.add(
					((centerX - x) * Math.sin(2 * i * Math.PI / 6) + (centerY - y) * Math.cos(2 * i * Math.PI / 6) + y)
							+ yModifier);
		}

	}

	public static void main(String[] args) {
		launch(args);
	}

}