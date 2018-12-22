
public class MoesBSC extends Room{
	private String name;
	private Item item;
	public MoesBSC(String name, Item item) {
		super(name);
	}
	@Override
	public int handle() {
System.out.println("You went and got a taco from the Moe's at Busch Student Center. You then got on the bus to college avenue.");
	Player.backpack.add(new Item("Taco"));
	
		return 9;
	}
	@Override
	public Item getItem() {
		// TODO Auto-generated method stub
		return item;
	}
	
}
