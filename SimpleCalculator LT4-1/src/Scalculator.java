import java.util.Scanner;

public class Scalculator {

    public static void main(String[] args){
        Scalculator mmain = new Scalculator();
        Scanner scan = new Scanner(System.in);

            int x = scan.nextInt();
            char sym;
            scan.nextLine();
            sym = scan.nextLine().charAt(0);
            int y = scan.nextInt();
            if(sym == '+'){
                System.out.println(mmain.ssum(x,y));
            }
            else if(sym == '-'){
                System.out.println(mmain.ssub(x,y));
            }
            else if(sym == '*'){
                System.out.println(mmain.smulti(x,y));
            }
            else if(sym == '/'){
                System.out.println(mmain.sdiv(x,y));
            }
            scan.close();

    }

    public int ssum(int x,int y){
        return x+y;
    }
    public int ssub(int x,int y){
        return x-y;
    }
    public int sdiv(int x,int y){
        return x/y;
    }
    public int smulti(int x,int y) {
        return x*y;
    }
    public double area_of_circle(int r){
        return Math.PI*Math.pow(r,2);
    }
}
