import java.util.Arrays;
import java.util.Scanner;

public class String_class {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first string : ");
        String s1 = scan.nextLine();
        System.out.print("Enter the second string : ");
        String s2 = scan.nextLine();
        System.out.print("Enter the third string : ");
        String s3 = scan.nextLine();
        
        String[] array = new String[]{s1,s2,s3};
        
        Arrays.sort(array); //small to big 
        System.out.println(array[2]); //so the last element is the biggest one
        scan.close();
    }
    
}
