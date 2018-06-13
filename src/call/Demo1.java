package call;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Demo1 extends Application {

	@Override
	public void start(Stage primaryStage) {
		GridPane grid = new GridPane();
		Scene scene=new Scene(grid,300,275);  
		primaryStage.setTitle("secondWindow");  
		primaryStage.setScene(scene);  
		primaryStage.show();  
	}

	public static void main(String[] args) {
		launch(args);
	}
}
