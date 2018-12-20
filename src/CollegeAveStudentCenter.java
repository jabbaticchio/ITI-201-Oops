import java.util.Scanner;
public class CollegeAveStudentCenter {
	
Scanner scan = new Scanner(System.in);
	int decision;
	int nextDecision;
	boolean valid = true;
	System.out.@println("You have arrived at the College Ave Student Center.")
	System.out.@println("Did you already get food? (1) Yes || (2) No")
	decision = scan.nextInt(); {//decision on going to the food court in CSC


while(valid){
	if (decision == 1)//go to class
	{
		valid = false;
		System.out.println("You decide to skip the food court and go directly to the OOP classroom.");
	}
	else if(decision == 2)//go get food
	{
		valid = false;
		System.out.println("You decide to get food at the food court");
		System.out.println("As you approach the food court, you wonder what you would like to eat");
		System.out.println("Would you like (1)Gerlanda's? (2) Moe's? (3)Panera? (4)Nah, I'll just go to class");
	}
	else
	{
		System.out.println("Please pick 1 or 2");
		decision = scan.nextInt();
		}
	

	nextDecision= scan.nextInt(); //made for which food to get
	boolean nextValid = true;
	
	while (nextValid) {	
		if (nextDecision == 1) //Gerlanda's
		{
			nextValid = false;
			System.out.println("You have chosen Gerlanda's");
			System.out.println("Please pick up the coffee item and proceed to the OOP classroom");	
		}
		else if (nextDecision == 2) //Moe's
		{
			nextValid = false;
			System.out.println("You have chosen Moe's");
			System.out.println("Please pick up the burrito item and proceed to the OOP classroom");
		}
		else if (nextDecision == 3) //Panera
		{
			nextValid = false;
			System.out.println("You have chosen Panera");
			System.out.println("Please pick up the bagel item and proceed to the OOP classroom");
		}

		else if (nextDecision == 4) //User changes their mind
		{
			nextValid= false;
			System.out.println("You decide you don't want any food");
			System.out.println("You go to the OOP classroom");	
		}
		else
		{
			System.out.println("Please pick a number 1 through 4.");
			nextDecision = scan.nextInt();
		}
			}
}

scan.close();
}
}//end College Student Center class
 

	
	
	


