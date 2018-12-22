
public class GerlandasCASC extends Room {
	private Item item;
	private String name;
	public GerlandasCASC(String name) {
		super(name);
	}
	@Override
	public int handle() {
System.out.println("You got some tasty pepperoni pizza from the student Center and went to the Object Oriented Programming Classroom");
Player.backpack.add(new Item("Pepperoni Pizza"));
		return 13;
	}
	@Override
	public Item getItem() {
		// TODO Auto-generated method stub
		return item;
	}
	
}
