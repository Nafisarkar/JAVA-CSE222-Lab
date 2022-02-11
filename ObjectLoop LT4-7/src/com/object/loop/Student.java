package com.object.loop;

import java.util.Scanner;

public class Student {
    private String name;
    private int id;
    private double cgpa;
    
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter how many student you want ?");
        int n = scan.nextInt();
        Student[] array = new Student[n];
        for(int i =0; i<n;i++) {
            array[i] = new Student();
            scan.nextLine();
            System.out.print("Enter name "+(i+1)+" ->");
            array[i].name = scan.nextLine();
            System.out.print("Enter id "+(i+1)+" ->");
            array[i].id = scan.nextInt();
            System.out.print("Enter double"+(i+1)+" ->");
            array[i].cgpa = scan.nextDouble();
        }
        print(array);
        scan.close();
    }
    public static void print(Student[] x){
        for (Student student : x) {
            System.out.println("-----------------");
            System.out.println("Name : " + student.name);
            System.out.println("Id : " + student.id);
            System.out.println("Cgpa : " + student.cgpa);
            System.out.println("-----------------");
        }
    }
}
