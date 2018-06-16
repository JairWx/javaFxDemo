package worker;

import javafx.application.Application;
import javafx.concurrent.Task;
import javafx.stage.Stage;

/**
 * use Thread to start Task
 * Class Task demo
 * @author HP
 *
 */
public class WorkDemo extends Application {

	@Override
	public void start(Stage primaryStage) {
		
		Task task = new Task() {
			int integer;
			@Override
			protected Object call() throws Exception {
				// TODO Auto-generated method stub
				for(integer = 0 ;integer< 10000;integer++) {
					if(isCancelled()) {
						return integer;
					}
					System.out.println("Integer:"+integer);
				}
				return integer;
			}
			
		};
		Thread th = new Thread(task);
		th.setDaemon(true);
		th.start();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
