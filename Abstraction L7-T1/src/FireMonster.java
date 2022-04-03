
public class FireMonster extends Monster {

	private String power ;
	public FireMonster(String n,String pow) {
		super(n);
		this.power = pow;
		
	}

	@Override
	public void attack() {
		System.out.println("Fire monster is attaking with fire ! burn burn !");
	}
	
	public void display() {
		System.out.println("Monster type : " + super.name);
		System.out.println("Monster power : " +this.power);
	}
	
}
