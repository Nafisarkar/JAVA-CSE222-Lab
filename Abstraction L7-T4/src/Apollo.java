
public class Apollo extends SpaceCraft implements Drive , Shuttle  {
	private int nowheel;
	public Apollo(int n) {
		super("M7");
		this.nowheel =n;
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Apollo apo = new Apollo(232);
		apo.display();
		apo.startShuttle();
		apo.drive();
		apo.turn();
		apo.stopShuttle();
	}

	@Override
	public void display() {
		System.out.println("Model :" +super.model);
	}

	@Override
	public void startShuttle() {
		System.out.println("Shuttle is starting !");
		
	}

	@Override
	public void stopShuttle() {
		System.out.println("Shuttle is stoping !");
		
	}

	@Override
	public void drive() {
		System.out.println("Spacecraft is flying");
		
	}

	@Override
	public void stop() {
		System.out.println("Stop!");
		
	}

	@Override
	public void turn() {
		System.out.println("Turning!");
	}

}
