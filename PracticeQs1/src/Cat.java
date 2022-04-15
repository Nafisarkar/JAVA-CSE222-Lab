
public class Cat extends Animal implements Activity {
	private int legs;
	Cat(String x, String y,int  z) {
		super(x, y);
		this.legs=z;
	}
	
	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}

	@Override
	public void play() {
		System.out.println("Cat playing meaw!");
		
	}
	@Override
	public void survive() {
		System.out.println("Cat survives!");
		
	}
	@Override
	public void move() {
		System.out.println("Cat running");
		
	}
	@Override
	public void eat() {
		System.out.println("Cat eating");
		
	}

}
