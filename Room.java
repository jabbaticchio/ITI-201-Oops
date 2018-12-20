public abstract class Room {
	private String name;
	private int[] availableMoves;
	private int randomNumber;
	private int roomID
	
	
	public Room(String name, int[] availableMoves, int randomNumber){
		this.name = name;
		this.availableMoves = availableMoves;
		this.randomNumber = randomNumber;
	}//end of constructor
	
	public abstract void handle();
	
	public String getName() {
		return name;
	}//end getName();

	
	public void setName(String name) {
		this.name = name;
	}//end of setName(String name)
	
	public int[] getAvailableMoves() {
		return availableMoves;
	}//end ofgetAvailableMoves()
	
	public void setAvailableMoves(int[] availableMoves) {
		this.availableMoves = availableMoves;
	}//end ofsetAvailableMoves(int[] availableMoves)
	public int getroomID(){
		return roomID
	}
	public int getRandomNumber() {
		return randomNumber;
	}//end of getRandomNumber()

	public void setRandomNumber(int randomNumber) {
		this.randomNumber = randomNumber;
	}//end of setRandomNumber(int randomNumber) 
	
	public String toString(){
		return this.name + " " + "Available Moves: " + availableMoves[0] + " or " + availableMoves[1] + " Random Number: " + randomNumber;
	}//end of toString()
}//end of Room class
