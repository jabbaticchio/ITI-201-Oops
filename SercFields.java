import java.util.*;
public class SercFields extends Room {
	private String name;
	private Item item;
	public SercFields(String name) {
		super(name);
	}
	
	
	@Override
	public int handle() {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		System.out.println("Your three friends each have a seperate item to help you on your way. \n Ryan has a half eaten burrito. Dean has a textbook for the class, and Mike has a laptop he's willing to lend out.");
		System.out.println("Type 1 for the half eaten burrito, 2 for the textbook and 3 for the laptop.");
		int playerchoice=reader.nextInt();
		
		if (playerchoice==1) {
			System.out.println("Got a half eaten burrito.");
			Player.backpack.add(new Item ("half eaten burrito"));
			
		}
		else if (playerchoice ==2) {
			System.out.println("Got a textbook!");
			Player.backpack.add(new Item("textbook"));
			
		}
		else if(playerchoice ==3) {
			System.out.println("Got a laptop. (Dont forget to give it back :)");
			Player.backpack.add(new Item("laptop"));
			
		}
		else {
			System.out.println("Please type in an acceptable number.");
			return 0;
		}
		System.out.println("Where do you wish to go? Press 1 to visit the Alison Road Classrooms, 2 for the Chem Labs, 3 for the Busch Student, 4 for the Hill Center Bus Stop." +"\n" +"Press -1 to quit.");
		int num = reader.nextInt();
		
		if(num == -1) {
			System.exit(0);
		}
		
		
		if(num == 1) {
			System.out.println("You went to Alison Road Classrooms. ");
			return 1;
		}
		
		else if(num == 2) {
			System.out.println("You went to Chemistry Labs. ");
			return 2;
		}
		
		else if(num == 3) {
			System.out.println("You went to Busch Student Center");
			return 3;
		}
		
		else if(num ==4) {
			System.out.println("You went to Hill Center");
			return 4;
		}
		
		
		
		else {
			System.out.println("You cannot do that");
			return 0;
		}
		
		
		
		
	
	}
	@Override
	public Item getItem() {
		// TODO Auto-generated method stub
		return item;
	}
	
}
