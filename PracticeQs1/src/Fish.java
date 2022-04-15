
public class Fish extends Animal implements Activity {
	private int numberOfFins;
	Fish(String x, String y ,int z) {
		super(x, y);
		this.numberOfFins=z;
	}
	
	
	public int getNumberOfFins() {
		return numberOfFins;
	}


	public void setNumberOfFins(int numberOfFins) {
		this.numberOfFins = numberOfFins;
	}


	@Override
	public void play() {
		System.out.println("fish is playing");
		
	}
	@Override
	public void survive() {
		System.out.println("fish is surviving");
		
	}
	@Override
	public void move() {
		System.out.println("fish is moving");
		
	}
	@Override
	public void eat() {
		System.out.println("fish is eating");
		
	}
	

}
