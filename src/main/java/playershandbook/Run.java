package playershandbook;



//Project imports
import playershandbook.ui.*;


//Java imports

import java.util.Scanner;
import javafx.application.Application;
import javafx.stage.Stage;

public class Run extends Application{
	
	 
	GameMenu currentMenu = new GameMenu();
	Window window = new Window(currentMenu,500,500);
   
	
	
	public void start(Stage stage){
		
		stage.setScene(window);
		stage.show();
	}
	
	 public static void main( String[] args )
    {
		
		
        launch(args);
    }
	

	
	
	
		
	
		

		
	
}
