
public class GerlandasBSC extends Room {
	private Item item;
	private String name;
	public GerlandasBSC(String name) {
		super(name);
	}
	@Override
	public int handle() {
System.out.println("You got some tasty pizza from the Gerlanda's Pizzeria at the Busch Student Center. You then got on the bus towards College ave student center.");
		return 9;
	}
	@Override
	public Item getItem() {
		// TODO Auto-generated method stub
		return item;
	}
	
}
