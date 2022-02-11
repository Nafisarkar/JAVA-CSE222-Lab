import java.util.Scanner;

public class Student {
    private String name ;
    private int id;
    private double cgpa;

    public static void main(String[] args){
        Student s1 = new Student();
        Scanner scan = new Scanner(System.in);
        s1.name = scan.nextLine();
        s1.id = scan.nextInt();
        s1.cgpa = scan.nextDouble();
        Student s2 = new Student();
        scan.nextLine();
        s2.name = scan.nextLine();
        s2.id = scan.nextInt();
        s2.cgpa = scan.nextDouble();

        System.out.println("S1 Name: "+s1.name+" s1 Id: "+s1.id+" s1 CGPA: "+s1.cgpa);
        System.out.println("S1 Name: "+s2.name+" s1 Id: "+s2.id+" s1 CGPA: "+s2.cgpa);

        scan.close();
    }
    
}