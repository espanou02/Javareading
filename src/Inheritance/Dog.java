package Inheritance;

 public class Dog extends Animal {
	
	public boolean longFur;
	boolean bigSize;
	
	public Dog(){
	}
	
	public Dog(boolean longFur, boolean bigSize){
		this.longFur = longFur;
		this.bigSize = bigSize;
	}
	
	public void bark(){
		System.out.println("Woof!");
	}
	
}
