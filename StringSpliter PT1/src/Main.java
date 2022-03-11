import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void  main(String[] args){

        Scanner scan = new Scanner(System.in);
        int t =0;
        t = scan.nextInt();
        scan.nextLine();
        for(int l=0;l<t;l++) {
            String sentence = scan.nextLine();
//        String sentence = "i am the king of the world";
            String[] array = sentence.split(" ");
            for (int i = 0; i < array.length; i++) {
                for (int j = i; j < array.length; j++) {
                    String temp = array[i];
                    String temp2 = array[j];
                    if (temp.length() < temp2.length()) {
                        String temp3 = array[i];
                        array[i] = array[j];
                        array[j] = temp3;
                    }
                }
            }
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i]+" ");
            }
            System.out.print("\n");
        }
    }
}
