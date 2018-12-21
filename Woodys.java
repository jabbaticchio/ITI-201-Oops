
public class Woodys extends Room{
	private String name;
	private Item item;
	public Woodys(String name, Item item) {
		super(name);
		this.item = item;
		
	}
	@Override
	public int handle() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public Item getItem() {
		// TODO Auto-generated method stub
		return item;
	}
	
}
