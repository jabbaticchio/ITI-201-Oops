import java.util.*;
public class HillCenterPath extends Room{
	int[] possibleoutputindices = {0,9} ;
	@Override
	public void handle() {
		Scanner scan=new Scanner (System.in);
		Random randgen=new Random();
		boolean valid=true;
		System.out.println("You walked to the Hill Center Bus Stop knowing that this stop was the best /n method to get back to College Ave for the exam!");
		System.out.println("The stop isn't very crowded but, you may need to wait.");
		
		

		
		if (randgen.nextInt(10)==0) {
			System.out.println("Awesome! You got the bus immediately! Now Taking the bus to college avenue student center...");// You got lucky and took the bus to college ave
			
		}else {
				System.out.println("You thought the bus would come in a minute, but it was completely full and no one got on on. Wait another 15 minutes for the next bus?");
				System.out.println("Or, will you cut your losses and go back to the SERC Fields? (Type 1 to stay or 2 to go back.");
				int decision=scan.nextInt();
				while(valid){
					if (decision == 1)//wait for bus
					{
						
						System.out.println("You decided to stay and wait for the next bus.");
						valid = false;
					}
					else if(decision == 2)//go back to serc fields
					{
						
						System.out.println("You decided to go back to the SERC Fields");
						valid = false;
					}
					else
					{
						System.out.println("Please pick 1 or 2");
						decision = scan.nextInt();
					}
				}
				
				
				
				
				
			
			
		}
		}
		
	}


