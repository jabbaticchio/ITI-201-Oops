import java.util.*;
public class Player extends Person_Base {
	String name = "default";
	int score = 100;
	ArrayList backpack = new ArrayList();

	public Player(String na)
	{
		name = na;
	}
	public Player()
	{
		name = name;
	}
	public int getScore()
	{
		return score;
	}
	public void setScore(int x)
	{
		score+=x;
	}
	
}
