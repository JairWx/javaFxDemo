package service;

import javafx.application.Application;
import javafx.concurrent.WorkerStateEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.stage.Stage;

public class App extends Application {

	@Override
	public void start(Stage primaryStage) {
		FirstLineService s = new FirstLineService();
		s.setUrl("http://www.baidu.com");
		s.setOnSucceeded(new EventHandler<WorkerStateEvent>() {

			@Override
			public void handle(WorkerStateEvent event) {
				// TODO Auto-generated method stub
				System.out.println("done"+event.getSource().getValue());
			}
		});
		s.start();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
