import java.util.Scanner;
public class StringClassLT411 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first String: ");
        String s1 = scan.nextLine();
        System.out.print("Enter the Second String: ");
        String s2 = scan.nextLine();
        System.out.print("Enter the Third String: ");
        String s3 = scan.nextLine();
            
        if(s1.equals(s2)){
            System.out.println("1st string equal 2nd string");
        }
        else if(s1.equals(s3)){
            System.out.println("1st string equal 3rd string");
        }
        else if(s3.equals(s2)){
            System.out.println("3rd string equal 2nd string");
        }
        scan.close();
    }
    
}
