import java.util.*;
public class Player{
	String name = "default";
	int score = 100;
	public static ArrayList<Item> backpack = new ArrayList<Item>();

	public Player(String name)
	{
		this.name = name;
	}
	
	/*public ArrayList<Item> getInventory(){
		return this.backpack;
	}
	*/
	public int getScore()
	{
		return score;
	}
	public void setScore(int x)
	{
		score+=x;
	}
	
}
