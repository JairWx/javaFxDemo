package call;

import java.awt.event.MouseAdapter;

import com.sun.glass.events.MouseEvent;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Demo2 extends Application {

	@Override
	public void start(Stage primaryStage) {
		Button btn = new Button("调用");
		btn.setOnAction(new EventHandler<ActionEvent>() {
 
            public void handle(ActionEvent event) {
                System.out.println("Hello World");
                //创建一个新的,可以新建一个窗口
                Stage secondStage = new Stage();
                new Demo1().start(secondStage);
            }
        });
		GridPane grid = new GridPane();
		grid.add(btn, 0, 0);
		Scene scene=new Scene(grid,300,275);  
		primaryStage.setTitle("first demo");  
		primaryStage.setScene(scene);  
		primaryStage.show();
		//
	}

	public static void main(String[] args) {
		launch(args);
	}
}
