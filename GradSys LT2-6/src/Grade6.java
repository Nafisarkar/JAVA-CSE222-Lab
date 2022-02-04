import java.util.Scanner;

public class Grade6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int mark = scan.nextInt();
		
		if(mark>=100) System.out.println("Not Possible!");
		else if(mark>=80 && mark<100) System.out.println("Grade: A+\nCGPA: 4.00\nRemarks:Outstanding");
		else if(mark>=75 && mark<80) System.out.println("Grade: A\nCGPA: 3.75\nRemarks:Outstanding");
		else if(mark>=70 && mark<75) System.out.println("Grade: A-\nCGPA: 3.50\nRemarks:Outstanding");
		else if(mark>=65 && mark<70) System.out.println("Grade: B+\nCGPA: 3.25\nRemarks:Outstanding");
		else if(mark>=60 && mark<65) System.out.println("Grade: B\nCGPA: 3.00\nRemarks:Outstanding");
		else if(mark>=55 && mark<60) System.out.println("Grade: B-\nCGPA: 2.75\nRemarks:Outstanding");
		else if(mark>=50 && mark<55) System.out.println("Grade: C+\nCGPA: 2.50\nRemarks:Outstanding");
		else if(mark>=45 && mark<50) System.out.println("Grade: C\nCGPA: 2.25\nRemarks:Outstanding");
		else if(mark>=40 && mark<45) System.out.println("Grade: D\nCGPA: 2.00\nRemarks:Pass");
		else {
			System.out.println("Grade: F\nCGPA: 0.00\nRemarks:Fail");
		     }
		
		scan.close();
	}

}
