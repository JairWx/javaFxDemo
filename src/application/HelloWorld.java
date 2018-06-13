package application;

import javax.swing.ActionMap;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * 新建项目 JavaFxMain可以自动继承Application
 * @author wenjie
 *
 */
public class HelloWorld extends Application {

	@Override
	public void start(Stage primaryStage) {
		 Button btn = new Button();
	       btn.setText("Say 'Hello World'");
	       btn.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				 System.out.println("Hello World!");
			}
	       });

	       StackPane root = new StackPane();
	       root.getChildren().add(btn);
	       Scene scene = new Scene(root, 300, 250);

	       primaryStage.setTitle("Hello World!");
	       primaryStage.setScene(scene);
	       primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
