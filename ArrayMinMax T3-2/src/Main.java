import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        System.out.println("Total Case =");
        int casee = scan.nextInt();
        
        System.out.println("How many Number you want to insert?");
        int array_number = scan.nextInt();


        int array[];
        array = new int[array_number];
            
        for(int i=0; i<array_number ;i++){
            array[i]=scan.nextInt();
        }
        
        for(int i=0;i<array_number;i++){
            for(int j=i;j<array_number;j++){
                if(array[i]<array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        
        boolean  found = false;
        int src_value;
        
        for(int i=0; i<casee ;i++){
            System.out.println("Case"+(i+1));
            System.out.println("Enter Data You want to search");
            src_value = scan.nextInt();
            
            for(int k=0;k<array.length;k++) {
            	
            	if(array[k]==src_value) {
            		
            		found = true;
            		System.out.println(src_value+" found at Index "+k);
            		break;
            	}
            	else {
            		System.out.println(src_value+" not found in the Array");
            	}
            }
         
        }
        
        if(found == true) {
        	System.out.println(src_value+" found at Index "+k);
        }
        

	}

}
