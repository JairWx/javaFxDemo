package service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.concurrent.Service;
import javafx.concurrent.Task;

public class FirstLineService extends Service{
	
	private StringProperty url = new SimpleStringProperty();
	
	
	
	public StringProperty getUrl() {
		return url;
	}



	public void setUrl(String url) {
		this.url.set(url);
	}



	@Override
	protected Task createTask() {
		// TODO Auto-generated method stub
		return new Task() {

			@Override
			protected Object call() throws Exception {
				// TODO Auto-generated method stub
				BufferedReader in = new BufferedReader(new InputStreamReader(new URL(url.get()).openStream()));
				return in.readLine();
			}
			
		};
	}

}
