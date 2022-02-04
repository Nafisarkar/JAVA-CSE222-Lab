import java.util.Scanner;

public class Prime10 {
	static boolean isPrime(int n) {
		if (n <= 1)
			return false;
		for (int i = 2; i < n; i++)
			if (n % i == 0)
				return false;

		return true;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Test case=");
		int test_case = scan.nextInt();

		for (int i = 0; i < test_case; i++) {
			int value = scan.nextInt();
			if (isPrime(value)) {
				System.out.println(value + " is a prime number");
			} else {
				System.out.println(value + " is not a prime number");
			}
		}
		scan.close();
	}

}
