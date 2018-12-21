
public class MoesCASC extends Room {
	private String name;
	private Item item;
	public MoesCASC(String name) {
		super(name);
	}
	@Override
	public int handle() {
		System.out.println("You went to Moes and got a Burrito. Right after picking up the meal, you went directly to the Object Oriented Programming Class.");
		return 0;
	}
	@Override
	public Item getItem() {
		// TODO Auto-generated method stub
		return item;
	}
	
}
