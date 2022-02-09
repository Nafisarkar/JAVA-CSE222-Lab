import java.util.Scanner;
public class Power {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		for(int i=0;i<n;i++) {
			System.out.println(2+"^"+i+" = "+Math.pow(2, i));
		}
		scan.close();
	}

}
