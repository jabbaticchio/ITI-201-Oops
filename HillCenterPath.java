import java.util.*;
public class HillCenterPath{
	public static void main (String[]args) {
		Scanner scan=new Scanner (System.in);
		Random randgen=new Random();
		System.out.println("You walked to the Hill Center Bus Stop knowing that this stop was the best /n method to get back to College Ave for the exam!");
		System.out.println("The stop isn't very crowded but, you may need to wait.");
		while (true) {
		if (randgen.nextInt(10)==0) {
			System.out.println("Awesome! You got the bus immediately! Now Taking the bus to college avenue student center...");
		}else {
				System.out.println("You thought the bus would come in a minute, but it was completely full and no one got on on. Wait another 15 minutes for the next bus?");
				System.out.println("Or, will you cut your losses and go back to the SERC Fields? (Type 1 to stay or 2 to go back.");
				int decision=scan.nextInt();
				
				
				
				
				
			}
			
		}
		}
		
	}

