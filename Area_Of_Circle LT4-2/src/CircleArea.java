import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args){
        CircleArea area = new CircleArea();
        Scanner scan = new Scanner(System.in);
        int r = scan.nextInt();

        System.out.printf("Area: %.3f",area.area_circle(r));
        scan.close();
    }
    public double area_circle(int r){
        return Math.PI*Math.pow(r,2);
    }
}
