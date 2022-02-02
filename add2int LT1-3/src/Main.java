import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the value 1 :");
		int a = scan.nextInt();
		System.out.print("Enter the value 2 :");
		int b = scan.nextInt();
		

		System.out.print("Output :"+(a+b));
		scan.close();
	}

}
