import java.util.Scanner;

public class Arraysort {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("How many Number you want to insert? ");
		int run = scan.nextInt();
		
		int[] array= new int[run];
		
		System.out.printf("Enter %d array elements\n",run);
		for(int i=0;i<run;i++) {
			array[i]=scan.nextInt();
		}
		
		for(int i=0;i<run;i++) {
			for(int j=i;j<run;j++) {
				if(array[i]>array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		
		for(int i=0;i<run;i++) {
			System.out.print(array[i]+" ");
		}
		
		scan.close();
	}
}
