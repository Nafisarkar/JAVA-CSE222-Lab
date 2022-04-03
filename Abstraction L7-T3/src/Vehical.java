
public abstract class Vehical {
	protected String model;
	
	public Vehical(String m) {
		this.model=m;
	}
	
	public abstract void move();
	
	public void controlSpeed() {
		System.out.println("Controling speed!");
	}
}
