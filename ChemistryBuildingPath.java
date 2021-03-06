import java.util.Random;
import java.util.Scanner;

public class ChemistryBuildingPath extends Room{
	
	private String name;
	private Item item;
	public ChemistryBuildingPath(String name) {
		super(name);
	}
	

	public int handle() {
		Scanner sca = new Scanner(System.in);
		Random randgen=new Random();
		int decision = 0;
		boolean valid = true;

		System.out.println("Walking along the path to the Chemistry Building, you hear a loud screech overhead.");

		if (randgen.nextInt(100) >= 80) {

			System.out.println("You see a massive silhouette pass above you, flying into the horizon. You wonder what kind of monster could cast such a daunting shadow as you continue on your way.");

		}
		else {
			System.out.println("Mere seconds later, the biggest Canadian Goose you have ever seen lands a mere five feet ahead of you. The goose spreads its wings wide so that you cannot pass and lets out a hellish screech.");
			System.out.println("What is your next move? Press 1,2, or 3");


			while(valid){
				if (decision == 1)// do nothing, get attacked by the goose.
				{
					valid = false;
					System.out.println("The goose chases you back across the field! You run for your life, forgetting all about your exam as you struggle to find shelter from the apocalyptic avian. You run inside the nearest building and wait for the goose to lose interest. This attempt on your life has left you scarred and deforemd, and you continue on your way - painfully aware of the time you've lost combating the goose.");
				}
				else if(decision == 2)// use food to distract the goose
				{
					valid = false;
					System.out.println("You quickly take the food from your backpack, waving it in front of you. The goose is interested in your peace offering and leans in to smell the food. Without warning, the goose snaps the food out of your hand and flies off into the horizon. Your quick thinking allowed you to proceed unharmed, albeit without your food.");
					Player.backpack.remove("half eaten burrito");
					break;
				}

				else if (decision == 3)// use laptop or textbook to fight the goose
				{
					valid = false;
					System.out.println("You fumble with your backpack, removing the heaviest item you have from it. Without checking if it's a laptop or a textbook, you throw the object at the goose."
							+ " You strike it square in the beak and it squeals in pain as it takes off, flying off into the horizon. ");
					if ((randgen.nextInt(2))==1) {
						
					
					System.out.println("You trashed your laptop in the process.");
					Player.backpack.remove("laptop");
					}
					else {
						System.out.println("You trashed your textbook in the process.");
						Player.backpack.remove("textbook");

					}
				}
					
				else
				{
					System.out.println("Please pick a valid option.");
					decision = sca.nextInt();
					
				}
			}

		}
		
	
		System.out.println("You finally arrive at the Busch Suites. You can now either wait for a bus to get on or head back the way you came. What would you like to do?" + "\n" + "Press 1 to go to College Ave Student Center, or press 2 to go to the previous room.");
		int num = sca.nextInt();
		while(valid){
			if (num == 1)// Take the bus to the College Ave Student Center
			{
				valid = false;
				System.out.println("");
				return 9;
			}

			else // go back to the previous room
			{
				//System.out.println("asdf");
				//num = sca.nextInt();
				return 0;
			}
		}
		return num;


	}
	
	
	public Item getItem() {
		return item;
	}

}
