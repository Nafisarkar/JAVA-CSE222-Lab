import java.util.Scanner;

public class Arrayindex {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Total Case = ");
		int cas = scan.nextInt();
		System.out.println("How many numbers you want to insert?");
		int element = scan.nextInt();
		
		int[] array = new int[element];
		
		for(int i=0;i<element;i++) {
			array[i] = scan.nextInt();
		}
		
		for(int i=0;i<cas;i++) {
			System.out.println("Case:"+(i+1));
			System.out.println("Enter data you want to search");
			int src_value = scan.nextInt();
			boolean value_found = false; 
			for(int j =0;j<element;j++) {
				if(array[j]==src_value) {
					System.out.println(src_value+" found at index "+ j);
					value_found = true;
					break;
					
				}
				
			}
			
			if(value_found==false) {
				System.out.println(src_value+" not found in the array");
			}
		}
		
		scan.close();
	}

}
