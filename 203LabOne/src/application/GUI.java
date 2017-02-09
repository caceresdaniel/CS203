package application;

import java.util.List;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

public class GUI extends Application {

	Pane triangles = new Pane();
	Polygon polygon11 = new Polygon();
	Polygon polygon12 = new Polygon();
	Polygon polygon13 = new Polygon();
	Polygon polygon14 = new Polygon();
	Polygon polygon15 = new Polygon();
	Polygon polygon16 = new Polygon();
	Polygon polygon21 = new Polygon();
	Polygon polygon22 = new Polygon();
	Polygon polygon23 = new Polygon();
	Polygon polygon24 = new Polygon();
	Polygon polygon25 = new Polygon();
	Polygon polygon26 = new Polygon();
	Polygon polygon31 = new Polygon();
	Polygon polygon32 = new Polygon();
	Polygon polygon33 = new Polygon();
	Polygon polygon34 = new Polygon();
	Polygon polygon35 = new Polygon();
	Polygon polygon36 = new Polygon();
	Polygon polygon41 = new Polygon();
	Polygon polygon42 = new Polygon();
	Polygon polygon43 = new Polygon();
	Polygon polygon44 = new Polygon();
	Polygon polygon45 = new Polygon();
	Polygon polygon46 = new Polygon();
	Polygon polygon51 = new Polygon();
	Polygon polygon52 = new Polygon();
	Polygon polygon53 = new Polygon();
	Polygon polygon54 = new Polygon();
	Polygon polygon55 = new Polygon();
	Polygon polygon56 = new Polygon();
	Polygon polygon61 = new Polygon();
	Polygon polygon62 = new Polygon();
	Polygon polygon63 = new Polygon();
	Polygon polygon64 = new Polygon();
	Polygon polygon65 = new Polygon();
	Polygon polygon66 = new Polygon();
	Polygon polygon71 = new Polygon();
	Polygon polygon72 = new Polygon();
	Polygon polygon73 = new Polygon();
	Polygon polygon74 = new Polygon();
	Polygon polygon75 = new Polygon();
	Polygon polygon76 = new Polygon();

	/**********************************************************************/
	// Attempted to do it simply and efficiently but could not figure it out in
	// time
	// so I resorted to doing it the easiest and ugliest way.... I feel ashamed

	// creates the main scene and calls the methods to create/color/and add the
	// triangles
	@Override
	public void start(Stage primaryStage) {
		try {
			primaryStage.setTitle("Lab 1");
			Pane pane = new Pane();

			pane.getStyleClass().add("mainPane");

			Scene sc = new Scene(pane);
			sc.getStylesheets().add("styles/style.css");

			Label title = new Label("Hexagon Puzzle Solution");
			title.getStyleClass().add("title");

			VBox vb = new VBox();
			vb.getStyleClass().add("vbox");

			triangles.getStyleClass().add("pane");

			disgustingCode();
			colorSetter(RecursiveSolver.hexagons, RecursiveSolver.p);
			addShapes();

			vb.getChildren().addAll(title, triangles);

			pane.getChildren().add(vb);

			primaryStage.setScene(sc);
			primaryStage.show();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**********************************************/
	// Method that creates a list for each triangle
	// sets the color of the border to white and then
	// populates the list with 3 different (x,y) pairs
	// to form a triangle around a set center
	public void disgustingCode() {
		/**********************************/
		// Hexagon 1
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

		/**********************************/
		// Hexagon 2
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

		/**********************************/
		// Hexagon 3
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

		/**********************************/
		// Hexagon 4
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

		/**********************************/
		// Hexagon 5
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

		/**********************************/
		// Hexagon 6
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

		/**********************************/
		// Hexagon 7
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

	/*********************************************************/
	// This method finds the position that a certain hexagon
	// corresponds too and then colors the triangles in accordance
	// to how the hexagon is colord
	public void colorSetter(List<Hexagon> hexagons, PositionTracker p) {
		String color1 = "P", color2 = "Y", color3 = "O", color4 = "R", color5 = "B", color6 = "G";
		Color yellow = Color.YELLOW, blue = Color.BLUE, green = Color.GREEN, orange = Color.ORANGE,
				purple = Color.PURPLE, red = Color.RED;

		for (int i = 0; i < RecursiveSolver.hexagons.size(); i++) {
			/******************************************************************************************/
			// Position 1
			if ((RecursiveSolver.hexagons.get(i).getHexagonLabel()) - 1 == RecursiveSolver.p.getInPosOne()) {
				if (RecursiveSolver.hexagons.get(i).getSideOne().equals(color1)) {
					polygon21.setFill(purple);
				} else if (RecursiveSolver.hexagons.get(i).getSideOne().equals(color2)) {
					polygon21.setFill(yellow);
				} else if (RecursiveSolver.hexagons.get(i).getSideOne().equals(color3)) {
					polygon21.setFill(orange);
				} else if (RecursiveSolver.hexagons.get(i).getSideOne().equals(color4)) {
					polygon21.setFill(red);
				} else if (RecursiveSolver.hexagons.get(i).getSideOne().equals(color5)) {
					polygon21.setFill(blue);
				} else if (RecursiveSolver.hexagons.get(i).getSideOne().equals(color6)) {
					polygon21.setFill(green);
				}
				if (RecursiveSolver.hexagons.get(i).getSideTwo().equals(color1)) {
					polygon22.setFill(purple);
				} else if (RecursiveSolver.hexagons.get(i).getSideTwo().equals(color2)) {
					polygon22.setFill(yellow);
				} else if (RecursiveSolver.hexagons.get(i).getSideTwo().equals(color3)) {
					polygon22.setFill(orange);
				} else if (RecursiveSolver.hexagons.get(i).getSideTwo().equals(color4)) {
					polygon22.setFill(red);
				} else if (RecursiveSolver.hexagons.get(i).getSideTwo().equals(color5)) {
					polygon22.setFill(blue);
				} else if (RecursiveSolver.hexagons.get(i).getSideTwo().equals(color6)) {
					polygon22.setFill(green);
				}
				if (RecursiveSolver.hexagons.get(i).getSideThree().equals(color1)) {
					polygon23.setFill(purple);
				} else if (RecursiveSolver.hexagons.get(i).getSideThree().equals(color2)) {
					polygon23.setFill(yellow);
				} else if (RecursiveSolver.hexagons.get(i).getSideThree().equals(color3)) {
					polygon23.setFill(orange);
				} else if (RecursiveSolver.hexagons.get(i).getSideThree().equals(color4)) {
					polygon23.setFill(red);
				} else if (RecursiveSolver.hexagons.get(i).getSideThree().equals(color5)) {
					polygon23.setFill(blue);
				} else if (RecursiveSolver.hexagons.get(i).getSideThree().equals(color6)) {
					polygon23.setFill(green);
				}
				if (RecursiveSolver.hexagons.get(i).getSideFour().equals(color1)) {
					polygon24.setFill(purple);
				} else if (RecursiveSolver.hexagons.get(i).getSideFour().equals(color2)) {
					polygon24.setFill(yellow);
				} else if (RecursiveSolver.hexagons.get(i).getSideFour().equals(color3)) {
					polygon24.setFill(orange);
				} else if (RecursiveSolver.hexagons.get(i).getSideFour().equals(color4)) {
					polygon24.setFill(red);
				} else if (RecursiveSolver.hexagons.get(i).getSideFour().equals(color5)) {
					polygon24.setFill(blue);
				} else if (RecursiveSolver.hexagons.get(i).getSideFour().equals(color6)) {
					polygon24.setFill(green);
				}
				if (RecursiveSolver.hexagons.get(i).getSideFive().equals(color1)) {
					polygon25.setFill(purple);
				} else if (RecursiveSolver.hexagons.get(i).getSideFive().equals(color2)) {
					polygon25.setFill(yellow);
				} else if (RecursiveSolver.hexagons.get(i).getSideFive().equals(color3)) {
					polygon25.setFill(orange);
				} else if (RecursiveSolver.hexagons.get(i).getSideFive().equals(color4)) {
					polygon25.setFill(red);
				} else if (RecursiveSolver.hexagons.get(i).getSideFive().equals(color5)) {
					polygon25.setFill(blue);
				} else if (RecursiveSolver.hexagons.get(i).getSideFive().equals(color6)) {
					polygon25.setFill(green);
				}
				if (RecursiveSolver.hexagons.get(i).getSideSix().equals(color1)) {
					polygon26.setFill(purple);
				} else if (RecursiveSolver.hexagons.get(i).getSideSix().equals(color2)) {
					polygon26.setFill(yellow);
				} else if (RecursiveSolver.hexagons.get(i).getSideSix().equals(color3)) {
					polygon26.setFill(orange);
				} else if (RecursiveSolver.hexagons.get(i).getSideSix().equals(color4)) {
					polygon26.setFill(red);
				} else if (RecursiveSolver.hexagons.get(i).getSideSix().equals(color5)) {
					polygon26.setFill(blue);
				} else if (RecursiveSolver.hexagons.get(i).getSideSix().equals(color6)) {
					polygon26.setFill(green);
				}
			}
			/******************************************************************************************/
			// Position 2
			if ((RecursiveSolver.hexagons.get(i).getHexagonLabel()) - 1 == RecursiveSolver.p.getInPosTwo()) {
				if (RecursiveSolver.hexagons.get(i).getSideOne().equals(color1)) {
					polygon31.setFill(purple);
				} else if (RecursiveSolver.hexagons.get(i).getSideOne().equals(color2)) {
					polygon31.setFill(yellow);
				} else if (RecursiveSolver.hexagons.get(i).getSideOne().equals(color3)) {
					polygon31.setFill(orange);
				} else if (RecursiveSolver.hexagons.get(i).getSideOne().equals(color4)) {
					polygon31.setFill(red);
				} else if (RecursiveSolver.hexagons.get(i).getSideOne().equals(color5)) {
					polygon31.setFill(blue);
				} else if (RecursiveSolver.hexagons.get(i).getSideOne().equals(color6)) {
					polygon31.setFill(green);
				}
				if (RecursiveSolver.hexagons.get(i).getSideTwo().equals(color1)) {
					polygon32.setFill(purple);
				} else if (RecursiveSolver.hexagons.get(i).getSideTwo().equals(color2)) {
					polygon32.setFill(yellow);
				} else if (RecursiveSolver.hexagons.get(i).getSideTwo().equals(color3)) {
					polygon32.setFill(orange);
				} else if (RecursiveSolver.hexagons.get(i).getSideTwo().equals(color4)) {
					polygon32.setFill(red);
				} else if (RecursiveSolver.hexagons.get(i).getSideTwo().equals(color5)) {
					polygon32.setFill(blue);
				} else if (RecursiveSolver.hexagons.get(i).getSideTwo().equals(color6)) {
					polygon32.setFill(green);
				}
				if (RecursiveSolver.hexagons.get(i).getSideThree().equals(color1)) {
					polygon33.setFill(purple);
				} else if (RecursiveSolver.hexagons.get(i).getSideThree().equals(color2)) {
					polygon33.setFill(yellow);
				} else if (RecursiveSolver.hexagons.get(i).getSideThree().equals(color3)) {
					polygon33.setFill(orange);
				} else if (RecursiveSolver.hexagons.get(i).getSideThree().equals(color4)) {
					polygon33.setFill(red);
				} else if (RecursiveSolver.hexagons.get(i).getSideThree().equals(color5)) {
					polygon33.setFill(blue);
				} else if (RecursiveSolver.hexagons.get(i).getSideThree().equals(color6)) {
					polygon33.setFill(green);
				}
				if (RecursiveSolver.hexagons.get(i).getSideFour().equals(color1)) {
					polygon34.setFill(purple);
				} else if (RecursiveSolver.hexagons.get(i).getSideFour().equals(color2)) {
					polygon34.setFill(yellow);
				} else if (RecursiveSolver.hexagons.get(i).getSideFour().equals(color3)) {
					polygon34.setFill(orange);
				} else if (RecursiveSolver.hexagons.get(i).getSideFour().equals(color4)) {
					polygon34.setFill(red);
				} else if (RecursiveSolver.hexagons.get(i).getSideFour().equals(color5)) {
					polygon34.setFill(blue);
				} else if (RecursiveSolver.hexagons.get(i).getSideFour().equals(color6)) {
					polygon34.setFill(green);
				}
				if (RecursiveSolver.hexagons.get(i).getSideFive().equals(color1)) {
					polygon35.setFill(purple);
				} else if (RecursiveSolver.hexagons.get(i).getSideFive().equals(color2)) {
					polygon35.setFill(yellow);
				} else if (RecursiveSolver.hexagons.get(i).getSideFive().equals(color3)) {
					polygon35.setFill(orange);
				} else if (RecursiveSolver.hexagons.get(i).getSideFive().equals(color4)) {
					polygon35.setFill(red);
				} else if (RecursiveSolver.hexagons.get(i).getSideFive().equals(color5)) {
					polygon35.setFill(blue);
				} else if (RecursiveSolver.hexagons.get(i).getSideFive().equals(color6)) {
					polygon35.setFill(green);
				}
				if (RecursiveSolver.hexagons.get(i).getSideSix().equals(color1)) {
					polygon36.setFill(purple);
				} else if (RecursiveSolver.hexagons.get(i).getSideSix().equals(color2)) {
					polygon36.setFill(yellow);
				} else if (RecursiveSolver.hexagons.get(i).getSideSix().equals(color3)) {
					polygon36.setFill(orange);
				} else if (RecursiveSolver.hexagons.get(i).getSideSix().equals(color4)) {
					polygon36.setFill(red);
				} else if (RecursiveSolver.hexagons.get(i).getSideSix().equals(color5)) {
					polygon36.setFill(blue);
				} else if (RecursiveSolver.hexagons.get(i).getSideSix().equals(color6)) {
					polygon36.setFill(green);
				}
			}
			/******************************************************************************************/
			// Position 3
			if ((RecursiveSolver.hexagons.get(i).getHexagonLabel()) - 1 == RecursiveSolver.p.getInPosThree()) {
				if (RecursiveSolver.hexagons.get(i).getSideOne().equals(color1)) {
					polygon41.setFill(purple);
				} else if (RecursiveSolver.hexagons.get(i).getSideOne().equals(color2)) {
					polygon41.setFill(yellow);
				} else if (RecursiveSolver.hexagons.get(i).getSideOne().equals(color3)) {
					polygon41.setFill(orange);
				} else if (RecursiveSolver.hexagons.get(i).getSideOne().equals(color4)) {
					polygon41.setFill(red);
				} else if (RecursiveSolver.hexagons.get(i).getSideOne().equals(color5)) {
					polygon41.setFill(blue);
				} else if (RecursiveSolver.hexagons.get(i).getSideOne().equals(color6)) {
					polygon41.setFill(green);
				}
				if (RecursiveSolver.hexagons.get(i).getSideTwo().equals(color1)) {
					polygon42.setFill(purple);
				} else if (RecursiveSolver.hexagons.get(i).getSideTwo().equals(color2)) {
					polygon42.setFill(yellow);
				} else if (RecursiveSolver.hexagons.get(i).getSideTwo().equals(color3)) {
					polygon42.setFill(orange);
				} else if (RecursiveSolver.hexagons.get(i).getSideTwo().equals(color4)) {
					polygon42.setFill(red);
				} else if (RecursiveSolver.hexagons.get(i).getSideTwo().equals(color5)) {
					polygon42.setFill(blue);
				} else if (RecursiveSolver.hexagons.get(i).getSideTwo().equals(color6)) {
					polygon42.setFill(green);
				}
				if (RecursiveSolver.hexagons.get(i).getSideThree().equals(color1)) {
					polygon43.setFill(purple);
				} else if (RecursiveSolver.hexagons.get(i).getSideThree().equals(color2)) {
					polygon43.setFill(yellow);
				} else if (RecursiveSolver.hexagons.get(i).getSideThree().equals(color3)) {
					polygon43.setFill(orange);
				} else if (RecursiveSolver.hexagons.get(i).getSideThree().equals(color4)) {
					polygon43.setFill(red);
				} else if (RecursiveSolver.hexagons.get(i).getSideThree().equals(color5)) {
					polygon43.setFill(blue);
				} else if (RecursiveSolver.hexagons.get(i).getSideThree().equals(color6)) {
					polygon43.setFill(green);
				}
				if (RecursiveSolver.hexagons.get(i).getSideFour().equals(color1)) {
					polygon44.setFill(purple);
				} else if (RecursiveSolver.hexagons.get(i).getSideFour().equals(color2)) {
					polygon44.setFill(yellow);
				} else if (RecursiveSolver.hexagons.get(i).getSideFour().equals(color3)) {
					polygon44.setFill(orange);
				} else if (RecursiveSolver.hexagons.get(i).getSideFour().equals(color4)) {
					polygon44.setFill(red);
				} else if (RecursiveSolver.hexagons.get(i).getSideFour().equals(color5)) {
					polygon44.setFill(blue);
				} else if (RecursiveSolver.hexagons.get(i).getSideFour().equals(color6)) {
					polygon44.setFill(green);
				}
				if (RecursiveSolver.hexagons.get(i).getSideFive().equals(color1)) {
					polygon45.setFill(purple);
				} else if (RecursiveSolver.hexagons.get(i).getSideFive().equals(color2)) {
					polygon45.setFill(yellow);
				} else if (RecursiveSolver.hexagons.get(i).getSideFive().equals(color3)) {
					polygon45.setFill(orange);
				} else if (hexagons.get(i).getSideFive().equals(color4)) {
					polygon45.setFill(red);
				} else if (RecursiveSolver.hexagons.get(i).getSideFive().equals(color5)) {
					polygon45.setFill(blue);
				} else if (RecursiveSolver.hexagons.get(i).getSideFive().equals(color6)) {
					polygon45.setFill(green);
				}
				if (RecursiveSolver.hexagons.get(i).getSideSix().equals(color1)) {
					polygon46.setFill(purple);
				} else if (RecursiveSolver.hexagons.get(i).getSideSix().equals(color2)) {
					polygon46.setFill(yellow);
				} else if (RecursiveSolver.hexagons.get(i).getSideSix().equals(color3)) {
					polygon46.setFill(orange);
				} else if (RecursiveSolver.hexagons.get(i).getSideSix().equals(color4)) {
					polygon46.setFill(red);
				} else if (RecursiveSolver.hexagons.get(i).getSideSix().equals(color5)) {
					polygon46.setFill(blue);
				} else if (RecursiveSolver.hexagons.get(i).getSideSix().equals(color6)) {
					polygon46.setFill(green);
				}
			}
			/******************************************************************************************/
			// Position 4
			if ((RecursiveSolver.hexagons.get(i).getHexagonLabel()) - 1 == RecursiveSolver.p.getInPosFour()) {
				if (RecursiveSolver.hexagons.get(i).getSideOne().equals(color1)) {
					polygon51.setFill(purple);
				} else if (RecursiveSolver.hexagons.get(i).getSideOne().equals(color2)) {
					polygon51.setFill(yellow);
				} else if (RecursiveSolver.hexagons.get(i).getSideOne().equals(color3)) {
					polygon51.setFill(orange);
				} else if (RecursiveSolver.hexagons.get(i).getSideOne().equals(color4)) {
					polygon51.setFill(red);
				} else if (RecursiveSolver.hexagons.get(i).getSideOne().equals(color5)) {
					polygon51.setFill(blue);
				} else if (RecursiveSolver.hexagons.get(i).getSideOne().equals(color6)) {
					polygon51.setFill(green);
				}
				if (RecursiveSolver.hexagons.get(i).getSideTwo().equals(color1)) {
					polygon52.setFill(purple);
				} else if (RecursiveSolver.hexagons.get(i).getSideTwo().equals(color2)) {
					polygon52.setFill(yellow);
				} else if (RecursiveSolver.hexagons.get(i).getSideTwo().equals(color3)) {
					polygon52.setFill(orange);
				} else if (RecursiveSolver.hexagons.get(i).getSideTwo().equals(color4)) {
					polygon52.setFill(red);
				} else if (RecursiveSolver.hexagons.get(i).getSideTwo().equals(color5)) {
					polygon52.setFill(blue);
				} else if (RecursiveSolver.hexagons.get(i).getSideTwo().equals(color6)) {
					polygon52.setFill(green);
				}
				if (RecursiveSolver.hexagons.get(i).getSideThree().equals(color1)) {
					polygon53.setFill(purple);
				} else if (RecursiveSolver.hexagons.get(i).getSideThree().equals(color2)) {
					polygon53.setFill(yellow);
				} else if (RecursiveSolver.hexagons.get(i).getSideThree().equals(color3)) {
					polygon53.setFill(orange);
				} else if (RecursiveSolver.hexagons.get(i).getSideThree().equals(color4)) {
					polygon53.setFill(red);
				} else if (RecursiveSolver.hexagons.get(i).getSideThree().equals(color5)) {
					polygon53.setFill(blue);
				} else if (RecursiveSolver.hexagons.get(i).getSideThree().equals(color6)) {
					polygon53.setFill(green);
				}
				if (RecursiveSolver.hexagons.get(i).getSideFour().equals(color1)) {
					polygon54.setFill(purple);
				} else if (RecursiveSolver.hexagons.get(i).getSideFour().equals(color2)) {
					polygon54.setFill(yellow);
				} else if (RecursiveSolver.hexagons.get(i).getSideFour().equals(color3)) {
					polygon54.setFill(orange);
				} else if (RecursiveSolver.hexagons.get(i).getSideFour().equals(color4)) {
					polygon54.setFill(red);
				} else if (RecursiveSolver.hexagons.get(i).getSideFour().equals(color5)) {
					polygon54.setFill(blue);
				} else if (RecursiveSolver.hexagons.get(i).getSideFour().equals(color6)) {
					polygon54.setFill(green);
				}
				if (RecursiveSolver.hexagons.get(i).getSideFive().equals(color1)) {
					polygon55.setFill(purple);
				} else if (RecursiveSolver.hexagons.get(i).getSideFive().equals(color2)) {
					polygon55.setFill(yellow);
				} else if (RecursiveSolver.hexagons.get(i).getSideFive().equals(color3)) {
					polygon55.setFill(orange);
				} else if (RecursiveSolver.hexagons.get(i).getSideFive().equals(color4)) {
					polygon55.setFill(red);
				} else if (RecursiveSolver.hexagons.get(i).getSideFive().equals(color5)) {
					polygon55.setFill(blue);
				} else if (RecursiveSolver.hexagons.get(i).getSideFive().equals(color6)) {
					polygon55.setFill(green);
				}
				if (RecursiveSolver.hexagons.get(i).getSideSix().equals(color1)) {
					polygon56.setFill(purple);
				} else if (RecursiveSolver.hexagons.get(i).getSideSix().equals(color2)) {
					polygon56.setFill(yellow);
				} else if (RecursiveSolver.hexagons.get(i).getSideSix().equals(color3)) {
					polygon56.setFill(orange);
				} else if (RecursiveSolver.hexagons.get(i).getSideSix().equals(color4)) {
					polygon56.setFill(red);
				} else if (RecursiveSolver.hexagons.get(i).getSideSix().equals(color5)) {
					polygon56.setFill(blue);
				} else if (RecursiveSolver.hexagons.get(i).getSideSix().equals(color6)) {
					polygon56.setFill(green);
				}
			}
			/******************************************************************************************/
			// Position 5
			if ((RecursiveSolver.hexagons.get(i).getHexagonLabel()) - 1 == RecursiveSolver.p.getInPosFive()) {
				if (RecursiveSolver.hexagons.get(i).getSideOne().equals(color1)) {
					polygon61.setFill(purple);
				} else if (RecursiveSolver.hexagons.get(i).getSideOne().equals(color2)) {
					polygon61.setFill(yellow);
				} else if (RecursiveSolver.hexagons.get(i).getSideOne().equals(color3)) {
					polygon61.setFill(orange);
				} else if (RecursiveSolver.hexagons.get(i).getSideOne().equals(color4)) {
					polygon61.setFill(red);
				} else if (RecursiveSolver.hexagons.get(i).getSideOne().equals(color5)) {
					polygon61.setFill(blue);
				} else if (RecursiveSolver.hexagons.get(i).getSideOne().equals(color6)) {
					polygon61.setFill(green);
				}
				if (RecursiveSolver.hexagons.get(i).getSideTwo().equals(color1)) {
					polygon62.setFill(purple);
				} else if (RecursiveSolver.hexagons.get(i).getSideTwo().equals(color2)) {
					polygon62.setFill(yellow);
				} else if (RecursiveSolver.hexagons.get(i).getSideTwo().equals(color3)) {
					polygon62.setFill(orange);
				} else if (RecursiveSolver.hexagons.get(i).getSideTwo().equals(color4)) {
					polygon62.setFill(red);
				} else if (RecursiveSolver.hexagons.get(i).getSideTwo().equals(color5)) {
					polygon62.setFill(blue);
				} else if (RecursiveSolver.hexagons.get(i).getSideTwo().equals(color6)) {
					polygon62.setFill(green);
				}
				if (RecursiveSolver.hexagons.get(i).getSideThree().equals(color1)) {
					polygon63.setFill(purple);
				} else if (RecursiveSolver.hexagons.get(i).getSideThree().equals(color2)) {
					polygon63.setFill(yellow);
				} else if (RecursiveSolver.hexagons.get(i).getSideThree().equals(color3)) {
					polygon63.setFill(orange);
				} else if (RecursiveSolver.hexagons.get(i).getSideThree().equals(color4)) {
					polygon63.setFill(red);
				} else if (RecursiveSolver.hexagons.get(i).getSideThree().equals(color5)) {
					polygon63.setFill(blue);
				} else if (RecursiveSolver.hexagons.get(i).getSideThree().equals(color6)) {
					polygon63.setFill(green);
				}
				if (RecursiveSolver.hexagons.get(i).getSideFour().equals(color1)) {
					polygon64.setFill(purple);
				} else if (RecursiveSolver.hexagons.get(i).getSideFour().equals(color2)) {
					polygon64.setFill(yellow);
				} else if (RecursiveSolver.hexagons.get(i).getSideFour().equals(color3)) {
					polygon64.setFill(orange);
				} else if (RecursiveSolver.hexagons.get(i).getSideFour().equals(color4)) {
					polygon64.setFill(red);
				} else if (RecursiveSolver.hexagons.get(i).getSideFour().equals(color5)) {
					polygon64.setFill(blue);
				} else if (RecursiveSolver.hexagons.get(i).getSideFour().equals(color6)) {
					polygon64.setFill(green);
				}
				if (RecursiveSolver.hexagons.get(i).getSideFive().equals(color1)) {
					polygon65.setFill(purple);
				} else if (RecursiveSolver.hexagons.get(i).getSideFive().equals(color2)) {
					polygon65.setFill(yellow);
				} else if (RecursiveSolver.hexagons.get(i).getSideFive().equals(color3)) {
					polygon65.setFill(orange);
				} else if (RecursiveSolver.hexagons.get(i).getSideFive().equals(color4)) {
					polygon65.setFill(red);
				} else if (RecursiveSolver.hexagons.get(i).getSideFive().equals(color5)) {
					polygon65.setFill(blue);
				} else if (RecursiveSolver.hexagons.get(i).getSideFive().equals(color6)) {
					polygon65.setFill(green);
				}
				if (RecursiveSolver.hexagons.get(i).getSideSix().equals(color1)) {
					polygon66.setFill(purple);
				} else if (RecursiveSolver.hexagons.get(i).getSideSix().equals(color2)) {
					polygon66.setFill(yellow);
				} else if (RecursiveSolver.hexagons.get(i).getSideSix().equals(color3)) {
					polygon66.setFill(orange);
				} else if (RecursiveSolver.hexagons.get(i).getSideSix().equals(color4)) {
					polygon66.setFill(red);
				} else if (RecursiveSolver.hexagons.get(i).getSideSix().equals(color5)) {
					polygon66.setFill(blue);
				} else if (RecursiveSolver.hexagons.get(i).getSideSix().equals(color6)) {
					polygon66.setFill(green);
				}
			}
			/******************************************************************************************/
			// Position 6
			if ((RecursiveSolver.hexagons.get(i).getHexagonLabel()) - 1 == RecursiveSolver.p.getInPosSix()) {
				if (RecursiveSolver.hexagons.get(i).getSideOne().equals(color1)) {
					polygon71.setFill(purple);
				} else if (RecursiveSolver.hexagons.get(i).getSideOne().equals(color2)) {
					polygon71.setFill(yellow);
				} else if (RecursiveSolver.hexagons.get(i).getSideOne().equals(color3)) {
					polygon71.setFill(orange);
				} else if (RecursiveSolver.hexagons.get(i).getSideOne().equals(color4)) {
					polygon71.setFill(red);
				} else if (RecursiveSolver.hexagons.get(i).getSideOne().equals(color5)) {
					polygon71.setFill(blue);
				} else if (RecursiveSolver.hexagons.get(i).getSideOne().equals(color6)) {
					polygon71.setFill(green);
				}
				if (RecursiveSolver.hexagons.get(i).getSideTwo().equals(color1)) {
					polygon72.setFill(purple);
				} else if (RecursiveSolver.hexagons.get(i).getSideTwo().equals(color2)) {
					polygon72.setFill(yellow);
				} else if (RecursiveSolver.hexagons.get(i).getSideTwo().equals(color3)) {
					polygon72.setFill(orange);
				} else if (hexagons.get(i).getSideTwo().equals(color4)) {
					polygon72.setFill(red);
				} else if (RecursiveSolver.hexagons.get(i).getSideTwo().equals(color5)) {
					polygon72.setFill(blue);
				} else if (RecursiveSolver.hexagons.get(i).getSideTwo().equals(color6)) {
					polygon72.setFill(green);
				}
				if (RecursiveSolver.hexagons.get(i).getSideThree().equals(color1)) {
					polygon73.setFill(purple);
				} else if (RecursiveSolver.hexagons.get(i).getSideThree().equals(color2)) {
					polygon73.setFill(yellow);
				} else if (RecursiveSolver.hexagons.get(i).getSideThree().equals(color3)) {
					polygon73.setFill(orange);
				} else if (RecursiveSolver.hexagons.get(i).getSideThree().equals(color4)) {
					polygon73.setFill(red);
				} else if (RecursiveSolver.hexagons.get(i).getSideThree().equals(color5)) {
					polygon73.setFill(blue);
				} else if (RecursiveSolver.hexagons.get(i).getSideThree().equals(color6)) {
					polygon73.setFill(green);
				}
				if (RecursiveSolver.hexagons.get(i).getSideFour().equals(color1)) {
					polygon74.setFill(purple);
				} else if (RecursiveSolver.hexagons.get(i).getSideFour().equals(color2)) {
					polygon74.setFill(yellow);
				} else if (RecursiveSolver.hexagons.get(i).getSideFour().equals(color3)) {
					polygon74.setFill(orange);
				} else if (RecursiveSolver.hexagons.get(i).getSideFour().equals(color4)) {
					polygon74.setFill(red);
				} else if (RecursiveSolver.hexagons.get(i).getSideFour().equals(color5)) {
					polygon74.setFill(blue);
				} else if (RecursiveSolver.hexagons.get(i).getSideFour().equals(color6)) {
					polygon74.setFill(green);
				}
				if (RecursiveSolver.hexagons.get(i).getSideFive().equals(color1)) {
					polygon75.setFill(purple);
				} else if (RecursiveSolver.hexagons.get(i).getSideFive().equals(color2)) {
					polygon75.setFill(yellow);
				} else if (RecursiveSolver.hexagons.get(i).getSideFive().equals(color3)) {
					polygon75.setFill(orange);
				} else if (RecursiveSolver.hexagons.get(i).getSideFive().equals(color4)) {
					polygon75.setFill(red);
				} else if (RecursiveSolver.hexagons.get(i).getSideFive().equals(color5)) {
					polygon75.setFill(blue);
				} else if (RecursiveSolver.hexagons.get(i).getSideFive().equals(color6)) {
					polygon75.setFill(green);
				}
				if (RecursiveSolver.hexagons.get(i).getSideSix().equals(color1)) {
					polygon76.setFill(purple);
				} else if (RecursiveSolver.hexagons.get(i).getSideSix().equals(color2)) {
					polygon76.setFill(yellow);
				} else if (RecursiveSolver.hexagons.get(i).getSideSix().equals(color3)) {
					polygon76.setFill(orange);
				} else if (RecursiveSolver.hexagons.get(i).getSideSix().equals(color4)) {
					polygon76.setFill(red);
				} else if (RecursiveSolver.hexagons.get(i).getSideSix().equals(color5)) {
					polygon76.setFill(blue);
				} else if (RecursiveSolver.hexagons.get(i).getSideSix().equals(color6)) {
					polygon76.setFill(green);
				}
			}
			/******************************************************************************************/
			// Position 0
			if ((RecursiveSolver.hexagons.get(i).getHexagonLabel()) == RecursiveSolver.p.getInPosZero()) {
				if (RecursiveSolver.hexagons.get(i).getSideOne().equals(color1)) {
					polygon11.setFill(purple);
				} else if (RecursiveSolver.hexagons.get(0).getSideOne().equals(color2)) {
					polygon11.setFill(yellow);
				} else if (RecursiveSolver.hexagons.get(0).getSideOne().equals(color3)) {
					polygon11.setFill(orange);
				} else if (RecursiveSolver.hexagons.get(0).getSideOne().equals(color4)) {
					polygon11.setFill(red);
				} else if (RecursiveSolver.hexagons.get(0).getSideOne().equals(color5)) {
					polygon11.setFill(blue);
				} else if (RecursiveSolver.hexagons.get(0).getSideOne().equals(color6)) {
					polygon11.setFill(green);
				}
				if (RecursiveSolver.hexagons.get(i).getSideTwo().equals(color1)) {
					polygon12.setFill(purple);
				} else if (RecursiveSolver.hexagons.get(0).getSideTwo().equals(color2)) {
					polygon12.setFill(yellow);
				} else if (RecursiveSolver.hexagons.get(0).getSideTwo().equals(color3)) {
					polygon12.setFill(orange);
				} else if (RecursiveSolver.hexagons.get(0).getSideTwo().equals(color4)) {
					polygon12.setFill(red);
				} else if (RecursiveSolver.hexagons.get(0).getSideTwo().equals(color5)) {
					polygon12.setFill(blue);
				} else if (RecursiveSolver.hexagons.get(0).getSideTwo().equals(color6)) {
					polygon12.setFill(green);
				}
				if (RecursiveSolver.hexagons.get(0).getSideThree().equals(color1)) {
					polygon13.setFill(purple);
				} else if (RecursiveSolver.hexagons.get(0).getSideThree().equals(color2)) {
					polygon13.setFill(yellow);
				} else if (RecursiveSolver.hexagons.get(0).getSideThree().equals(color3)) {
					polygon13.setFill(orange);
				} else if (RecursiveSolver.hexagons.get(0).getSideThree().equals(color4)) {
					polygon13.setFill(red);
				} else if (RecursiveSolver.hexagons.get(0).getSideThree().equals(color5)) {
					polygon13.setFill(blue);
				} else if (RecursiveSolver.hexagons.get(0).getSideThree().equals(color6)) {
					polygon13.setFill(green);
				}
				if (RecursiveSolver.hexagons.get(0).getSideFour().equals(color1)) {
					polygon14.setFill(purple);
				} else if (RecursiveSolver.hexagons.get(0).getSideFour().equals(color2)) {
					polygon14.setFill(yellow);
				} else if (RecursiveSolver.hexagons.get(0).getSideFour().equals(color3)) {
					polygon14.setFill(orange);
				} else if (RecursiveSolver.hexagons.get(0).getSideFour().equals(color4)) {
					polygon14.setFill(red);
				} else if (RecursiveSolver.hexagons.get(0).getSideFour().equals(color5)) {
					polygon14.setFill(blue);
				} else if (RecursiveSolver.hexagons.get(0).getSideFour().equals(color6)) {
					polygon14.setFill(green);
				}
				if (RecursiveSolver.hexagons.get(0).getSideFive().equals(color1)) {
					polygon15.setFill(purple);
				} else if (RecursiveSolver.hexagons.get(0).getSideFive().equals(color2)) {
					polygon15.setFill(yellow);
				} else if (RecursiveSolver.hexagons.get(0).getSideFive().equals(color3)) {
					polygon15.setFill(orange);
				} else if (RecursiveSolver.hexagons.get(0).getSideFive().equals(color4)) {
					polygon15.setFill(red);
				} else if (RecursiveSolver.hexagons.get(0).getSideFive().equals(color5)) {
					polygon15.setFill(blue);
				} else if (RecursiveSolver.hexagons.get(0).getSideFive().equals(color6)) {
					polygon15.setFill(green);
				}
				if (RecursiveSolver.hexagons.get(0).getSideSix().equals(color1)) {
					polygon16.setFill(purple);
				} else if (RecursiveSolver.hexagons.get(0).getSideSix().equals(color2)) {
					polygon16.setFill(yellow);
				} else if (RecursiveSolver.hexagons.get(0).getSideSix().equals(color3)) {
					polygon16.setFill(orange);
				} else if (RecursiveSolver.hexagons.get(0).getSideSix().equals(color4)) {
					polygon16.setFill(red);
				} else if (RecursiveSolver.hexagons.get(0).getSideSix().equals(color5)) {
					polygon16.setFill(blue);
				} else if (RecursiveSolver.hexagons.get(0).getSideSix().equals(color6)) {
					polygon16.setFill(green);
				}
			}
		}
	}

	/***********************************************/
	// Adds the triangles to the scene triangle pane
	public void addShapes() {
		triangles.getChildren().addAll(polygon11, polygon12, polygon13, polygon14, polygon15, polygon16);
		triangles.getChildren().addAll(polygon21, polygon22, polygon23, polygon24, polygon25, polygon26);
		triangles.getChildren().addAll(polygon31, polygon32, polygon33, polygon34, polygon35, polygon36);
		triangles.getChildren().addAll(polygon41, polygon42, polygon43, polygon44, polygon45, polygon46);
		triangles.getChildren().addAll(polygon51, polygon52, polygon53, polygon54, polygon55, polygon56);
		triangles.getChildren().addAll(polygon61, polygon62, polygon63, polygon64, polygon65, polygon66);
		triangles.getChildren().addAll(polygon71, polygon72, polygon73, polygon74, polygon75, polygon76);
	}

	public static void main(String[] args) {
		launch(args);
	}
}