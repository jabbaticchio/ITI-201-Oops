import java.util.Scanner;
public class BuschStudentCenter {
		Scanner scan = new Scanner(System.in);
		int decision;
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
			System.out.println("Would you like (1)Gerlanda's? (2) Moe's? (3) (4)Nah, I'll just wait for the bus");
		}
		else
		{
			System.out.println("You finally get off the bus at the College Avenue Student Center, but you have 15 minutes");
			System.out.println("to burn. Do you want to get food?(1) Yes (2) No)");
		}
	}

