import java.util.Scanner;

public class Student {
    private String name;
    private int id;
    private double cgpa;
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Student[] stdarray = new Student[2];
        for(int i =0;i<2;i++){
            scan.nextLine();                //buffer clear
            stdarray[i] = new Student();
            String x =scan.nextLine();
            int y=scan.nextInt();
            double z=scan.nextDouble();
            stdarray[i].insertRecord(x,y,z);
        }
        for(int i =0;i<2;i++){
            stdarray[i].displayRecord();
        }
    }
    public void insertRecord(String n,int i,double d){
        this.name = n;
        this.id =i;
        this.cgpa = d;
    }
    public void displayRecord(){
        System.out.println("Name :"+this.name);
        System.out.println("Id :"+this.id);
        System.out.println("Cgpa :"+this.cgpa);
    }
}
