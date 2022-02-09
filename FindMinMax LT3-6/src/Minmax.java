import java.util.Scanner;

public class Minmax {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		System.out.println(Math.max(Math.max(a,b),c));
		System.out.println(Math.min(Math.min(a,b),c));
		scan.close();
	}

}
