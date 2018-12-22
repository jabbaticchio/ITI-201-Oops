import java.util.Scanner;
public class BuschStudentCenter extends Room{
	private Item item;
	private String name;
	
	public BuschStudentCenter(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int handle() {
		Scanner scan = new Scanner(System.in);
		int decision;
		int decision2; 
		boolean valid = true;
		System.out.println("You have arrived at the Busch Student Center.");
		System.out.println("You have a couple of minutes before the bus arrives.");
		System.out.println("Would you like to get food? (1) Yes || (2) No");
		decision = scan.nextInt();//decision on going to the food court in bsc

		while(valid){
			if (decision == 1)//yes go get food
			{
				valid = false;
				System.out.println("You decided to get food at the food court");
			}
			else if(decision == 2)//no go to college ave
			{
				valid = false;
				System.out.println("You decided to skip the food court and go directly take the bus.");
			}
			else
			{
				System.out.println("Please pick 1 or 2");
				decision = scan.nextInt();
			}
		}
		if (decision == 1) //what happens next
		{
			System.out.println("As you approach the food court, you wonder what you would like to eat");
			System.out.println("Would you like (1)Gerlanda's? (2) Moe's? (3)Panera (4)Nah, I'll just wait for the bus");
			decision2 = scan.nextInt();
			valid=true;
			while(valid)
			{
				if(decision2 < 1 || decision2 > 4)
				{
					break;
				}
				else
				{
					if(decision2 == 1) {
						return 7;
					}
					
					else if(decision2 == 2) {
						return 8;
					}
					else if(decision2 == 3) {
						return 6;
					}
					else
						continue;
					
				}

			}
			//add object of food choice

		}
		else
		{
			System.out.println();
		}
/*
		int decision3;
		System.out.println("You finally get off the bus at the College Avenue Student Center, but you have 15 minutes");
		System.out.println("to burn. Do you want to get food?(1) Yes (2) No");
		decision3 = scan.nextInt();
		valid=true;
		while(valid)
		{
			if(decision3>0 && decision3<3)
			{
				System.out.println("Where do you want to get food? (1)Gerlanda's? (2) Moe's? (3)Panera (4)On second thought, I'll just go to class with what I have");
				valid=false;
			}
			else
			{
				System.out.println("Please pick either 1 or 2");
				decision3=scan.nextInt();
			}
		}*/
	scan.close();
	return 0;
	}

	@Override
	public Item getItem() {
		// TODO Auto-generated method stub
		return item;
	}
	}

