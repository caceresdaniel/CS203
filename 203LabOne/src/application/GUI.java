package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class GUI extends Application {
	
	Main main = new Main();
	
	@Override
	public void start(Stage primaryStage) {
		try {

			primaryStage.setTitle("Lab 1");
			BorderPane bp = new BorderPane();

			bp.getStyleClass().add("mainPane");

			Scene sc = new Scene(bp);
			sc.getStylesheets().add("styles/style.css");

			Label title = new Label("Hexagon Solution");
			title.getStyleClass().add("title");

			Button butt = new Button("Launch");
			butt.getStyleClass().add("button");
			
			VBox  vb = new VBox();
			vb.getStyleClass().add("vbox");
			
			HBox hb  = new  HBox();
			hb.getStyleClass().add("hbox");
			
			vb.getChildren().addAll(title, hb, butt);
			
			launchButton(butt, bp);
			
			bp.setTop(vb);
	
			primaryStage.setScene(sc);
			primaryStage.show();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void launchButton(Button butt, BorderPane bp){
		butt.setOnMouseClicked(e ->{
			main.monitor();
			
		});
	}
	
	public static void main(String[] args){
		launch(args);
	}
	
	

}
