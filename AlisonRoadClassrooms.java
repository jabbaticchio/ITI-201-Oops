import java.util.Scanner;
public class AlisonRoadClassrooms extends Room{
	private String name;
	private Item item;
	public AlisonRoadClassrooms(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}


	
	public int handle() {
			Scanner sca = new Scanner(System.in);
			int decision;
			boolean valid = true;
			System.out.println("Welcome to the ARC (Alison Road Classrooms)");
			System.out.println("You can grab some food at Woody's or catch the bus from here");
			System.out.println("Would you like to get food? (1) Yes || (2) No");
			decision = sca.nextInt();//decision on going to Woody's

			while(valid){
				if (decision == 1)//yes = get food at Woody's
				{
					valid = false;
					System.out.println("You decided to get food at Woody's");
				}
				else if(decision == 2)//no = catch the bus
				{
					valid = false;
					System.out.println("You decided to skip getting food and are instead catching the bus to CASC");
				}
				else
				{
					System.out.println("Please pick 1 or 2");
					decision = sca.nextInt();
				}
			}
			if (decision == 1) //what happens next
			{
				System.out.println("As you enter Woody's, you wonder what you would like to get");
				System.out.println("Would you like (1)A Burrito? (2) Coffee? (3) Bagel? (4)Nothing, I'll just wait for the bus");
			}
			else
			{
				System.out.println("You finally get off the bus at the College Avenue Student Center, but you have 15 minutes");
				System.out.println("to burn. Do you want to get food?(1) Yes (2) No)");
			}
		
		return 0;
	}



	@Override
	public Item getItem() {
		// TODO Auto-generated method stub
		return item;
	}

}
