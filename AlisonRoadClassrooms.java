import java.util.Scanner;
public class AlisonRoadClassrooms extends Room{
	private String name;
	private Item item;
	public AlisonRoadClassrooms(String name) {
		super(name);
		
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
					return 9;
				}
				else
				{
					System.out.println("Please pick 1");
					decision = sca.nextInt();
				}
			}
			if (decision == 1) //what happens next
			{
				return 9;
			}
			
		
		return 9;
	}



	@Override
	public Item getItem() {
		// TODO Auto-generated method stub
		return item;
	}

}
