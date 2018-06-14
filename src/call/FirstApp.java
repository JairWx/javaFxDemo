package call;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * call between by windows
 * @author wenjie
 *
 */
public class FirstApp extends Application {

	@Override
	public void start(Stage primaryStage) {
		Button btn = new Button("调用");
		btn.setOnAction(new EventHandler<ActionEvent>() {
 
            public void handle(ActionEvent event) {
                System.out.println("Hello World");
                //new stage for add new App
                Stage secondStage = new Stage();
                new SecondApp().start(secondStage);
            }
        });
		GridPane grid = new GridPane();
		grid.add(btn, 0, 0);
		Scene scene=new Scene(grid,300,275);  
		primaryStage.setTitle("firstWindow");  
		primaryStage.setScene(scene);  
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
