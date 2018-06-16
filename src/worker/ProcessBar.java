package worker;

import javafx.application.Application;
import javafx.concurrent.Task;
import javafx.scene.Scene;
import javafx.scene.control.ProgressBar;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * 
 * @author HP
 *
 */
public class ProcessBar extends Application {

	@Override
	public void start(Stage primaryStage) {
		
		Task task = new Task() {
			int integer;
			@Override
			protected Void call() throws Exception {
				// TODO Auto-generated method stub
				int max = 100000;
				for(integer = 0 ;integer< max;integer++) {
					if(isCancelled()) {
						break;
					}
					System.out.println("Integer:"+integer);
					updateProgress(integer, max);
				}
				return null;
			}
			
		};
		ProgressBar bar = new ProgressBar();
		StackPane root = new StackPane();
		root.getChildren().add(bar);
		Scene sc = new Scene(root);
		primaryStage.setScene(sc);
		primaryStage.show();
		bar.progressProperty().bind(task.progressProperty());
		new Thread(task).start();
		
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
