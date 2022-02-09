import java.util.Scanner;

public class Carea {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("ENTER THE VALUE OF R:");
		int r = scan.nextInt();
		
		double area = (Math.PI*Math.pow(r, 2));
		System.out.printf("Area : %.2f",area);
		scan.close();
	}

}
