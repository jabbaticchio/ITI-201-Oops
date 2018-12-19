import java.util.Random;
import java.util.Scanner;

public class RoomsExample {
	public static void main(String[] args) {
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		Room[] myRooms = new Room[5];
		for(int i = 0; i < myRooms.length; i++){
			String name = "Room " + (i+1);
			int back = i-1;
			int forward = i+1;
			if(i==0) back = myRooms.length-1;
			if(i==myRooms.length-1) forward = 0;
			int[] availableMoves = {back, forward};
			Room tempRoom = new Room(name, availableMoves, rd.nextInt(10));
			myRooms[i] = tempRoom;
		}//end of for loop
		//for(int i = 0; i < myRooms.length; i++) System.out.println(myRooms[i]);
		
		int i = 0;
		while(true){
			System.out.println("You are in " + myRooms[i].getName());
			String goTo = (myRooms[i].getAvailableMoves()[0]+1) + " & " + (myRooms[i].getAvailableMoves()[1]+1);
			System.out.println("What room would you like to go to? Rooms " + goTo + " are available or press q to quit.");
			String userInput = sc.nextLine();
			if(userInput.equalsIgnoreCase("q")) break;
			else if(userInput.equals(goTo.substring(0,1)) || userInput.equals(goTo.substring(4,5))) i = Integer.parseInt(userInput)-1;
			else System.out.println("Invalid entry, please try again\r\r");
		}//end of while loop
		sc.close();
	}//end of main method	
}//end of RoomsExample