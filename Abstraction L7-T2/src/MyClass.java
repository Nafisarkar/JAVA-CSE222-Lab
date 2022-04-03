
public class MyClass {

	public static void main(String[] args) {
		CDPlayer cd = new CDPlayer();
		cd.audio();
		cd.play();
		cd.pause();
		cd.stop();
		cd.reverse();
		
		
		System.out.println("\n\n\n");
		DVDPlayer dvd = new DVDPlayer();
		
		dvd.video();
		dvd.play();
		dvd.pause();
		dvd.stop();
		dvd.reverse();

	}

}
