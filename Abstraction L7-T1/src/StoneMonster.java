
public class StoneMonster extends Monster {
	private String power;
	public StoneMonster(String n,String pow) {
		super(n);
		this.power = pow;
	}

	@Override
	public void attack() {
		System.out.println("Stone monster is attaking with Stone ! shot shot !");
	}
	
	public void display() {
		System.out.println("Monster type : " + super.name);
		System.out.println("Monster power : " +this.power);
	}
 
}
