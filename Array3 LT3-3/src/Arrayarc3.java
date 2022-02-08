import java.util.Scanner;

public class Arrayarc3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int std_number = scan.nextInt();
		
		double[] array = new double[std_number];
		System.out.println("Enter "+std_number+" array elements");
		
		for(int i=0;i<std_number;i++) {
			array[i]=scan.nextDouble();
		}
		
		for(int i=0;i<std_number;i++) {
			for(int j =i;j<std_number;j++) {
				if(array[i]>array[j]) {
					double temp = array[i];
					array[i]= array[j];
					array[j]= temp;
				}
			}
		}
		
		
		System.out.println("Largest CGPA  ="+array[std_number-1]);
		System.out.println("Smallest CGPA ="+array[0]);
		
		
		scan.close();
	}

}
