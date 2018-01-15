package playershandbook;


import playershandbook.ui.*;
import java.util.Scanner;

public class Run


{
    public static void main( String[] args )
    {
        Run run =new Run();
    }
	
	Menus menus = new Menus();
	
	public Run(){
		gameloop();
	}
	
	
	public void gameloop(){
		Scanner scan = new Scanner(System.in);
		String command="";
		
		while(menus.hasCurrentMenu()){
			menus.displayCurrentMenu();
			menus.processCommand(scan.nextLine());
			
			
		}
		
	
		

		
	}
}
