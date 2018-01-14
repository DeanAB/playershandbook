package playershandbook.ui;

public class Menus{
	
	
	private Menu currentMenu=null;
	
	
	public Menus(Menu currentMenu){
		this.currentMenu=currentMenu;
		
	}
	
	public Menus(){
		
		super(
		
				new Menu(){
					
						public void displayMenu(){
							
							System.out.printf("\nThis is default test menu.\nType 'exit' to quit.\n");
							
						}
						
						/**processes input from command line. 
							@return false if command not valid;
						**/
						public boolean processCommand(String command){
							switch(command){
								
								case exit:
									System.out.println("Quiting");
									return true;
									break;
									
								default:
									System.out.println("invalid command");
									return false;
									break;
									
								
								
							}	
						}	
				}	
		);
		
	}
	
	
	
}
