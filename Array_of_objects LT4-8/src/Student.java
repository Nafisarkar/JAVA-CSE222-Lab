import java.util.Scanner;

public class Student {
    private String name;
    private int id;
    private double cpa;
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Number of students ? ");
        int n = scan.nextInt();

        Student[] array = new Student[n];
        for (int i=0;i<n;i++){
            array[i]=new Student();
            scan.nextLine();
            System.out.println("Details of "+(i+1)+" student");
            System.out.print("name :");
            String x = scan.nextLine();
            System.out.print("id :");
            int y =scan.nextInt();
            System.out.print("cgpa :");
            double z = scan.nextDouble();
            array[i].insertRecord(x,y,z);
        }
        for(int i=0;i<n;i++){
            System.out.println("------------------");
            System.out.println("Details of Student number "+(i+1));
            array[i].displayRecord();
        }
        scan.close();
    }
    public void insertRecord(String n,int i,double d){
        this.name = n;
        this.id = i;
        this.cpa = d;
    }
    public void displayRecord(){
        System.out.println("name : "+this.name);
        System.out.println("id : "+this.id);
        System.out.println("cgpa : "+this.cpa);
        System.out.println("------------------");
    }

}
