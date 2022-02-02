import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();
		
		scan.close();
		
		System.out.println("Solution for Equation - 1 = "+((a*b)+(c*d)));
		System.out.println("Solution for Equation - 2 = "+((2*a)-b+(d*d*d)));
		System.out.println("Solution for Equation - 3 = "+((a*a)+(b*b)-(c*c)+(d*d)));
		System.out.println("Solution for Equation - 4 = "+((a*a*a)+b-(c*c)));
	}

}
