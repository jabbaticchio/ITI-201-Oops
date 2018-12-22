import java.util.Scanner;

public class CollegeAveStudentCenter extends Room{
	private String name;
	private Item item;
	
	public CollegeAveStudentCenter(String name) {
		super(name);
	}
	
	@Override
	public int handle() {
	
Scanner scan = new Scanner(System.in);
int decision;
boolean valid = true;


System.out.println("You have arrived at the College Ave Student Center.");
System.out.println("Did you already get food? (1) Yes || (2) No");
decision = scan.nextInt();//decision on going to the food court in CSC


while(valid){
	if (decision == 1)//go to class
	{
		
		System.out.println("You decide to skip the food court and go directly to the OOP classroom.");
		return 13;
	}
	else if(decision == 2)//go get food
	{
		//valid = false;
		System.out.println("You decide to get food at the food court");
		System.out.println("As you approach the food court, you wonder what you would like to eat");
		System.out.println("Would you like (1)Gerlanda's? (2) Moe's? (3)Panera? (4)Nah, I'll just go to class");
	}
	else
	{
		System.out.println("Please pick 1 or 2");
		decision = scan.nextInt();
		}
	
	int nextDecision;
	nextDecision= scan.nextInt(); //made for which food to get
	boolean nextValid = true;
	
	while (nextValid) {	
		if (nextDecision == 1) //Gerlanda's
		{
			
			return 11;
		}
		else if (nextDecision == 2) //Moe's
		{
			
			

			return 13;
		}
		else if (nextDecision == 3) //Panera
		{
			
		

			return 10;
		}

		else if (nextDecision == 4) //User changes their mind
		{
	//		nextValid= false;
			System.out.println("You decide you don't want any food");
			System.out.println("You go to the OOP classroom");	
			return 13;
		}
		else
		{
			System.out.println("Please pick a number 1 through 4.");
			nextDecision = scan.nextInt();
		}
			}
}

scan.close();
return 0;
	}//end main method

	@Override
	public Item getItem() {
		// TODO Auto-generated method stub
		return item;
	}
}//end College Student Center class
 

	
	
	


