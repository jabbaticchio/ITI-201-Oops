
public class PaneraCASC extends Room {
	private String name;
	private Item item;
	public PaneraCASC(String name) {
		super(name);
	}
	
	@Override
	public int handle() {
		System.out.println("You have chosen Panera");
		System.out.println("Please pick up the sandwhich item and proceed to the OOP classroom");
		Player.backpack.add(new Item ("Sandwich"));
		return 13;
	}

	@Override
	public Item getItem() {
		// TODO Auto-generated method stub
		return item;
	}
}
