import java.util.*;
public class Player{
	String name = "default";
	static int score = 100;
	public static ArrayList<Item> backpack = new ArrayList<Item>();

	public Player(String name)
	{
		this.name = name;
	}
	
	/*public ArrayList<Item> getInventory(){
		return this.backpack;
	}
	*/
	private int getScore()
	{
		return score;
	}
	private static void setScore(int x)
	{
		score+=x;
	}
	
}
