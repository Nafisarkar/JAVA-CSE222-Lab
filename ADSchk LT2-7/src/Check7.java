import java.util.Scanner;

public class Check7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Test Case = ");
		int test_run = scan.nextInt();

		while (test_run > 0) {
			char caracter = scan.next().charAt(0);
			if (Character.isDigit(caracter)) {
				System.out.println(caracter + " is a Digit");
			} 
			else if (Character.isAlphabetic(caracter)) {
				char chk = Character.toLowerCase(caracter);
				
				if (chk == 'a' || chk == 'e' || chk == 'i' || chk == 'o' || chk == 'u') {
					System.out.println(caracter + " is an Vowel");
				} 
				else {
					System.out.println(caracter + " is an Consonant");
				}
			} 
			else {
				System.out.println(caracter + " is a special character");
			}
			test_run--;
		}
		scan.close();
	}

}
