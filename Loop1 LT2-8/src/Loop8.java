import java.util.Scanner;

public class Loop8 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input a number:");
		int number = scan.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.println(number+" x "+i+" = "+ (number*i));
		}
		scan.close();
	}
}
