
public class Spider extends Animal implements Activity {
	private int legs;
	
	Spider(int x,String y,String z){
		super(y,z);
		this.legs=x;
	}
	
	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}
	
	public void wallCrawling() {
		System.out.println("Wall crawling");
	}
	
	@Override
	public void move() {
		System.out.println("Spider moveing");
	}

	@Override
	public void eat() {
		System.out.println("spider eating");
	}

	@Override
	public void play() {
		System.out.println("Playing ");
		
	}

	@Override
	public void survive() {
		System.out.println("Survive");
		
	}
}