import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int run ;
		Scanner scan = new Scanner(System.in);
		System.out.println("Total Case :");
		run = scan.nextInt();
		System.out.println("How many number you want to insert:");
		int insnumber = scan.nextInt();
		
		int[] array = new int[insnumber];
		for(int i =0;i<insnumber;i++) {
			array[i]= scan.nextInt();
		}
		
		for(int i =0;i<run;i++) {
			System.out.println("Enter the element you want to search:");
			int sec = scan.nextInt();
			boolean found = false;
			for(int j=0;j<insnumber;j++) {
				if(array[j]==sec){
					found = true;
					System.out.println(sec+" found in index "+j);
					break;
				}
			}
			if(found==false) {
				System.out.println(sec+" not found in the array");
			}
		}
		scan.close();
	}

}
