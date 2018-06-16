package taskfunction;

import javafx.concurrent.Service;
import javafx.concurrent.Task;

/**
 * not extends Application throw IllegalStateException
 * Toolkit not initialized
 * @author HP
 *
 */
public class TaskFunction {

	public static void main(String[] args) {
		Service s = new Service() {

			@Override
			protected Task createTask() {
				// TODO Auto-generated method stub
				return new Task() {

					@Override
					protected Object call() throws Exception {
						// TODO Auto-generated method stub
						for(int i=0 ; i< 10000 ;i++) {
						  if (isCancelled()) {
				                break;
				            }
				            System.out.println("Iteration " + i);
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
	}
}
