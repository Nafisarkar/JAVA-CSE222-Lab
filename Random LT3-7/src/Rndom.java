import java.util.Random;
public class Rndom {

	public static void main(String[] args) {
		Random random = new Random();
		
		for(int i =0;i<5;i++) {
			int x = random.nextInt(200);
			System.out.println(x);
		
		}
	}

}
