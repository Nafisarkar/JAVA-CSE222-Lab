
public class WaterMonster extends Monster {
	private String power;
	public WaterMonster(String n,String pow) {
		super(n);
		this.power = pow;
	}

	@Override
	public void attack() {
		System.out.println("Water monster is attaking with water ! wet wet !");
	}
	
	public void display() {
		System.out.println("Monster type : " + super.name);
		System.out.println("Monster power : " +this.power);
	}
		
}
