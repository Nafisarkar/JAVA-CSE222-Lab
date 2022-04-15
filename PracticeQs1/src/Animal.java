
public abstract class Animal {
	private String name;
	private String kingdom;
	
	Animal(String x,String y){
		this.name=x;
		this.kingdom=y;
	}
	public abstract void move();
	public abstract void eat();
}
