
public class PaneraBSC extends Room {
	private String name;
	private Item item;
	
	public PaneraBSC(String name, Item item) {
		// TODO Auto-generated constructor stub
		super(name);
		this.item = item;
	}
	@Override
	public int handle() {
		System.out.println("You went and obtained a sandwich from panera and took the Bus to the College Avenue Student Center.");

		return 0;
	}
	
	
	public Item getItem() {
		return item;
	}
}
