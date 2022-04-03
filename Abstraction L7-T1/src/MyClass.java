
public class MyClass {

	public static void main(String[] args) {
		FireMonster Fury = new FireMonster("Fury","FIRE");
		WaterMonster Slim = new WaterMonster("Slime","Water");
		StoneMonster Golem = new StoneMonster("Golem","Stone");
		
		System.out.println("--------------------------------------------||");
		Fury.attack();
		Fury.display();
		System.out.println("--------------------------------------------||");
		Slim.attack();
		Slim.display();
		System.out.println("--------------------------------------------||");
		Golem.attack();
		Golem.display();
		System.out.println("--------------------------------------------||");
	}

}
