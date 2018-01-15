package playershandbook.ui;

public class Menus{
	
	
	private Menu currentMenu=null;
	
	
	public Menus(Menu currentMenu){
		this.currentMenu=currentMenu;
		
	}
	
	public Menus(){
		
		
		
		currentMenu	=new Menu(){
					
			public void displayMenu(){
				
				System.out.printf("\nThis is default test menu.\nType 'exit' to quit.\n");
				
			}
			
			
			public void processCommand(String command){
				switch(command){
					
					case "exit":
						System.out.println("Quiting");
						currentMenu=null;
						break;
						
					default:
						System.out.println("invalid command");
						break;
						
					
					
				}	
			}	
	};	
	
		
	}
	
	
	public boolean hasCurrentMenu(){
		return currentMenu!=null;
	}
	
	public void displayCurrentMenu(){
		currentMenu.displayMenu();
	}
	
	public void processCommand(String command){
		currentMenu.processCommand(command);
	}
	
	
	
}
