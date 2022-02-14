import java.util.Scanner;

public class Student {
    private String name ;
    private int id;
    private double cgpa;

    public static void main(String[] args){
        Student s1 = new Student();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Name 1st student :");
        s1.name = scan.nextLine();
        System.out.println("Enter Id 1st student :");
        s1.id = scan.nextInt();
        System.out.println("Enter Cgpa 1st student :");
        s1.cgpa = scan.nextDouble();
        Student s2 = new Student();
        scan.nextLine();
        System.out.println("Enter Name 2nd student :");
        s2.name = scan.nextLine();
        System.out.println("Enter Id 2nd student :");
        s2.id = scan.nextInt();
        System.out.println("Enter Cgpa 2nd student :");
        s2.cgpa = scan.nextDouble();

        System.out.println("S1 Name: "+s1.name+" s1 Id: "+s1.id+" s1 CGPA: "+s1.cgpa);
        System.out.println("S2 Name: "+s2.name+" s2 Id: "+s2.id+" s2 CGPA: "+s2.cgpa);

        scan.close();
    }
    
}