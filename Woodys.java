
public class Woodys extends Room{
	private String name;
	private Item item;
	public Woodys(String name, Item item) {
		super(name);
		this.item = item;
		
	}
	@Override
	public int handle() {
		System.out.println("As you enter Woody's, you wonder what you would like to get");
		System.out.println("Too bad, you got a bagel.");
		
		Player.backpack.add(new Item ("bagel"));
		return 9;
	}
	@Override
	public Item getItem() {
		// TODO Auto-generated method stub
		return item;
	}
	
}
