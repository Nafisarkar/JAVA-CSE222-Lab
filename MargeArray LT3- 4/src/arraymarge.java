import java.util.Scanner;
import java.util.Arrays;

public class arraymarge {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("N1=");
		int n1 = scan.nextInt();
			System.out.println("Enter "+n1+" array elements");
			int[] array1 = new int[n1];
			for(int i=0;i<n1;i++) {
				array1[i]=scan.nextInt();
			}
			
		System.out.println("N2=");
		int n2 = scan.nextInt();
			System.out.println("Enter "+n2+" array elements");
			int[] array2 = new int[n2];
			for(int i=0;i<n2;i++) {
				array2[i]=scan.nextInt();
			}
			
		int[] array_res = new int[n1+n2];
		System.arraycopy(array1, 0, array_res, 0, n1);
		System.arraycopy(array2, 0, array_res, n1, n2);
		
		
		System.out.println(Arrays.toString(array_res));
		scan.close();
	}

}
