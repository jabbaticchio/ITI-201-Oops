
public class PaneraCASC extends Room {
	private String name;
	private Item item;
	public PaneraCASC(String name) {
		super(name);
	}
	
	@Override
	public int handle() {
		return 0;
	}

	@Override
	public Item getItem() {
		// TODO Auto-generated method stub
		return item;
	}
}
