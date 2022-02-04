import java.util.Scanner;

public class Sum1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("1st element:");
		int a = scan.nextInt();
		System.out.println("2nd element:");
		int b = scan.nextInt();
		
		System.out.println("SUM:"+(a+b));
		
		scan.close();
	}
}
