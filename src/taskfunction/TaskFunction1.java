package taskfunction;

import javafx.application.Application;
import javafx.concurrent.Service;
import javafx.concurrent.Task;
import javafx.stage.Stage;

public class TaskFunction1 extends Application {

	@Override
	public void start(Stage primaryStage) {
		Service s = new Service() {

			@Override
			protected Task createTask() {
				// TODO Auto-generated method stub
				return new Task() {

					@Override
					protected Object call() throws Exception {
						// TODO Auto-generated method stub
						for(int i=0 ; i< 20 ;i++) {
						  Thread.sleep(1000);
							if (isCancelled()) {
				                break;
				            }
							if(i == 18) {
								int t = 1/0;
							}
				            System.out.println("Iteration " + i);
				            
				            //updateMessage
				            updateMessage("Message:Iteration"+i);
						}
						return null;
					}

					@Override
					protected void succeeded() {
						// TODO Auto-generated method stub
						System.out.println("Done!!");
						super.succeeded();
					}

					@Override
					protected void cancelled() {
						// TODO Auto-generated method stub
						System.out.println("Canclled!!");
						super.cancelled();
					}

					@Override
					protected void failed() {
						// TODO Auto-generated method stub
						System.out.println("Failed");
						super.failed();
					}
					
					
					
				};
			}
			
		};
		s.start();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		s.cancel();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		s.restart();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(s.getMessage());
	}

	public static void main(String[] args) {
		launch(args);
	}
}
