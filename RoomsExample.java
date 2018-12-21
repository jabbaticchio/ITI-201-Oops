import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.util.*;

public class RoomsExample {
	public static void main(String[] args) {
		int width = 100;
        int height = 30;
        
        Player adventurer = new Player("Adventurer");

        //BufferedImage image = ImageIO.read(new File("/Users/mkyong/Desktop/logo.jpg"));
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Graphics g = image.getGraphics();
        g.setFont(new Font("SansSerif", Font.BOLD, 24));

        Graphics2D graphics = (Graphics2D) g;
        graphics.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,
                RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        graphics.drawString("OOPS", 10, 20);

        //save this image
        //ImageIO.write(image, "png", new File("/users/mkyong/ascii-art.png"));

        for (int y = 0; y < height; y++) {
            StringBuilder sb = new StringBuilder();
            for (int x = 0; x < width; x++) {

                sb.append(image.getRGB(x, y) == -16777216 ? " " : "$");

            }

            if (sb.toString().trim().isEmpty()) {
                continue;
            }

            System.out.println(sb);
        }

	
        System.out.println("Beep Beep Beep, goes your alarm telling you to leave for the Object Oriented Programming Exam. What! Its been 30 minutes since its rung. You see the alarm late due to playing frisbee.");
        System.out.println("What? Your on Object Oriented Programming exam begins in a little while. And What!? Its all the way on college avenue too!");
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		ArrayList<Room> myRooms=new ArrayList<Room>();
		Room SercFields=new SercFields("Serc Fields");
		myRooms.add(SercFields);
		Room ARC=new AlisonRoadClassrooms("Alison Road Classroom Building");
		myRooms.add(ARC);
		Room ChemLabs=new ChemistryBuildingPath("Chemistry Labs");
		myRooms.add(ChemLabs);
		Room BSC=new BuschStudentCenter("Busch Student Center");
		myRooms.add(BSC);
		Room HCBS=new HillCenterPath("Hill Center Bus Stop");
		myRooms.add(HCBS);
		Room Woodys=new Woodys("Woodys Food", new Item("Fries"));
		myRooms.add(Woodys);
		Room PaneraBSC=new PaneraBSC("Panera Bread at the Busch Student Center", new Item("Sandwich"));
		myRooms.add(PaneraBSC);
		Room gerlandas=new GerlandasBSC("Gerlandas Pizza at the Busch Student Center");
		myRooms.add(gerlandas);
		
		Room moesbuschstudentcenter=new MoesBSC("Moes at the Busch Student Center", new Item("Burrito"));
		
		myRooms.add(moesbuschstudentcenter);
		Room collegeavestudentcenter=new CollegeAveStudentCenter("College Avenue Student Center");
		myRooms.add(collegeavestudentcenter);
		Room panera=new PaneraCASC("Panera Bread at the College Avenue Student Center");
		myRooms.add(panera);
		Room GerlandasCASC=new GerlandasCASC("Gerlandas Pizza at the College Avenue Student Center");
		myRooms.add(GerlandasCASC);
		Room MoesCASC=new MoesCASC("Moes at the College Avenue Student Center");
		myRooms.add(MoesCASC);
		Room OopsRoom= new OOPClass("Obj Oriented Programming Classroom");
		myRooms.add(OopsRoom);

		/*for(int i = 0; i < myRooms.size(); i++){
			String name = "Room " + (i+1);
			int back = i-1;
			int forward = i+1;
			if(i==0) back = myRooms.size()-1;
			if(i==myRooms.length-1) forward = 0;
			int[] availableMoves = {back, forward};
			Room tempRoom = new Room(name, availableMoves, rd.nextInt(10));
			myRooms.get(i) = tempRoom;
		}
		*/
		//end of for loop
		//for(int i = 0; i < myRooms.length; i++) System.out.println(myRooms[i]);
		
		/* Designated room*/
		int num = 0;
		
		
		while(true){
			
			System.out.println("You are in " + myRooms.get(num).getName());
			
			// ensures you don't add null objects
			if(myRooms.get(num).getItem() != null)
			Player.backpack.add(myRooms.get(num).getItem());
			//String goTo = (myRooms.get(i).getAvailableMoves()[0]+1) + " & " + (myRooms.get(i).getAvailableMoves()[1]+1);
			//System.out.println("What room would you like to go to? Rooms " + goTo + " are available or press q to quit.");
			
			try {
				
				num = myRooms.get(num).handle();
				
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			
			
			/*QUIT*/
		//	if(userInput.equalsIgnoreCase("q")) break;
			//else if(userInput.equals(goTo.substring(0,1)) || userInput.equals(goTo.substring(4,5))) i = Integer.parseInt(userInput)-1;
			//else System.out.println("Invalid entry, please try again\r\r");
		}//end of while loop
	//	sc.close();
	}//end of main method	
}//end of RoomsExample
