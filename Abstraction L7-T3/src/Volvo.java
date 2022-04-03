
public class Volvo extends Vehical implements Drive {
	
	private double price;
	
	@Override
	public void startEngine() {
		System.out.println("Engine started!");
		
	}

	@Override
	public void stopEngine() {
		System.out.println("Engine stoped!");
		
	}

	@Override
	public void move() {
		System.out.println("moveing!");
		
	}
	
	public Volvo(String m,double p) {
		super(m);
		this.price =p;
	}

	public static void main(String[] args) {
		Volvo newcar = new Volvo("Audi R8",20000.0);
		
		newcar.startEngine();
		newcar.move();
		newcar.controlSpeed();
		newcar.stopEngine();
		
	}

	

}
