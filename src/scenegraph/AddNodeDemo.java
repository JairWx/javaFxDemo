package scenegraph;


import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class AddNodeDemo extends Application {

	@Override
	public void start(Stage primaryStage) {
		Group root = new Group();
		Scene scene = new Scene(root, 500, 500, Color.BLACK);//第一个参数是父节点
		
		Rectangle r = new Rectangle(0, 0, 250, 250);
		r.setFill(Color.BLUE);
		root.getChildren().add(r);
		primaryStage.setTitle("JavaFx");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
