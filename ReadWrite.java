import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadWrite {
	public static void main(String[] args) {
		String output = "";
		Scanner userInput = new Scanner(System.in);
		System.out.print("Please enter a file name: ");
		String fileName = userInput.nextLine();
		File inputFile = new File(fileName);
		try {
			Scanner sc = new Scanner(inputFile);
			while(sc.hasNextLine()){
				output+= sc.nextLine() + " ";
			}//end of while loop
			sc.close();
		}//end of try
		catch (FileNotFoundException e) {
			//e.printStackTrace();
			System.err.println("File not found, please try again");
		}//end of catch
		finally{
			userInput.close();
		}//finally
		System.out.println(output);
	}//end of main method
}//end of ReadWrite