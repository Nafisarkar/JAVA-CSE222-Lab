import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("A = ");
		int a = scan.nextInt();
		System.out.print("B = ");
		int b = scan.nextInt();
		System.out.print("C = ");
		int c = scan.nextInt();
		
		if(a>b && a>c) System.out.println("Maximum Value: "+a);
		else if(b>a && b>c) System.out.println("Maximum Value: "+b);
		else System.out.println("Maximum Value: "+c);
		
		scan.close();
	}

}
