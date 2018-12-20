import java.util.Random;
import java.util.Scanner;

public class RoomsExample {
	public static void main(String[] args) {
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		Room[] myRooms = new Room[14];
		Room SercFields=new Room(Serc Fields,availableMoves, int randomNumber);
		Room ARC=new Room(Alison Road Classroom Building,availableMoves, int randomNumber);
		Room ChemLabs=new Room(Chemistry Labs,availableMoves, int randomNumber);
		Room BSC=new Room(Busch Student Center,availableMoves, int randomNumber);
		Room HCBS=new Room(Hill Center Bus Stop,availableMoves, int randomNumber);
		Room Woodys=new Room(Woodys Food,availableMoves, int randomNumber);
		Room PaneraBSC=new Room(Panera Bread at the Busch Student Center,availableMoves, int randomNumber);
		Room GerlandasBSC =new Room(Gerlandas Pizza at the Busch Student Center,availableMoves, int randomNumber);
		Room MoesBSC=new Room(Moes at the Busch Student Center ,availableMoves, int randomNumber);
		Room CASC=new Room(College Avenue Student Center,availableMoves, int randomNumber);
		Room PaneraCASC =new Room(Panera Bread at the College Avenue Student Center,availableMoves, int randomNumber);
		Room GerlandasCASC=new Room(Gerlandas Pizza at the College Avenue Student Center,availableMoves, int randomNumber);
		Room MoesCASC=new Room(Moes at the College Avenue Student Center,availableMoves, int randomNumber);
		Room OopsRoom= new Room(Obj Oriented Programming Classroom, availableMoves, int randomNumber);

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
