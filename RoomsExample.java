import java.util.Random;
import java.util.Scanner;

public class RoomsExample {
	public static void main(String[] args) {
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		ArrayList<Room> myRooms=new ArrayList<Room>();
		Room SercFields=new SercFields("Serc Fields",availableMoves);
		myRooms.add(SercFields);
		Room ARC=new ARC("Alison Road Classroom Building",availableMoves);
		myRooms.add(ARC);
		Room ChemLabs=new ChemLabs("Chemistry Labs",availableMoves);
		myRooms.add(ChemLabs);
		Room BSC=new BSC("Busch Student Center",availableMoves);
		myRooms.add(BSC);
		Room HCBS=new HCBS("Hill Center Bus Stop",availableMoves);
		myRooms.add(HCBS);
		Room Woodys=new Woodys("Woodys Food",availableMoves);
		myRooms.add(Woodys);
		Room PaneraBSC=new PaneraBSC("Panera Bread at the Busch Student Center",availableMoves);
		myRooms.add(PaneraBSC);
		Room GerlandasBSC =new GerlandasBSC("Gerlandas Pizza at the Busch Student Center",availableMoves);
		myRooms.add(GerlandasBSC);
		Room MoesBSC=new MoesBSC("Moes at the Busch Student Center" ,availableMoves);
		myRooms.add(MoesBSC);
		Room CASC=new CASC("College Avenue Student Center",availableMoves);
		myRooms.add(CASC);
		Room PaneraCASC =new PaneraCASC("Panera Bread at the College Avenue Student Center",availableMoves);
		myRooms.add(PaneraCASC);
		Room GerlandasCASC=new GerlandasCASC("Gerlandas Pizza at the College Avenue Student Center",availableMoves);
		myRooms.add(GerlandasCASC);
		Room MoesCASC=new MoesCASC("Moes at the College Avenue Student Center",availableMoves);
		myRooms.add(MoesCasc);
		Room OopsRoom= new OopsRoom("Obj Oriented Programming Classroom", availableMoves);
		myRooms.add(OopsRoom);

		for(int i = 0; i < myRooms.size(); i++){
			String name = "Room " + (i+1);
			int back = i-1;
			int forward = i+1;
			if(i==0) back = myRooms.size()-1;
			if(i==myRooms.length-1) forward = 0;
			int[] availableMoves = {back, forward};
			Room tempRoom = new Room(name, availableMoves, rd.nextInt(10));
			myRooms.get(i) = tempRoom;
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
