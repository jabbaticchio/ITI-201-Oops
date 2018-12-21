public class Item{
 private String name;
 private String description;
 private Item item;
 
 
 public Item(String name) {
	 this.name = name;
 }
 
 public void setName(String name){
	 this.name = name;
 }
 
 public void setDescription(String description){
 this.description=description;
 }
 
 public String getDescription(){
 return this.description;
 }
 }
