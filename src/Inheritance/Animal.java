package Inheritance;

public class Animal {
	
	private int numberOfLegs;
	
	public void setNumberOfLegs(int numberOfLegs) throws Exception {
		if(numberOfLegs!=4 || numberOfLegs!=2 )
			throw new Exception("Wrong number of legs!");
		else
		this.numberOfLegs = numberOfLegs;
	}

	public int getNumberOfLegs() {
		return numberOfLegs;
	}

	boolean flies;
	static boolean isGood;
	
	public Animal(){
		System.out.println("An instance of animal has been created!");
	}
	
	public void makeSound(){
		System.out.println("I am an animal and I am making a sound!");
	}
	
}
