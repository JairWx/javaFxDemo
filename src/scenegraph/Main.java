package scenegraph;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

//Main类是application.Application的一个扩展。重写了start方法，传入了一个Stage对象（一个最高级的GUI容器）作为参数。
public class Main extends Application {

	@Override
	public void start(Stage primaryStage) {
		  Group root = new Group();
	       Scene scene = new Scene(root, 500, 500, Color.BLACK);
	       primaryStage.setTitle("JavaFX Scene Graph Demo");
	       primaryStage.setScene(scene);
	       primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
