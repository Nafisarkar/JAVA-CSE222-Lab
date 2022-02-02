import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of r : ");
		double r = scan.nextDouble();
		
		double area = Math.PI * r*r;
		System.out.printf("Area : %.3f",area);
		scan.close();
	}
}
