package package1;

import java.util.Scanner;

public class Scanner1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Student Information");
        System.out.print("Enter Student Roll No: ");
        int RollNo = sc.nextInt();
        sc.nextLine();  
        System.out.print("Enter Student Name: ");
        String Name = sc.nextLine();
        System.out.print("Enter Student Address: ");
        String Address = sc.nextLine();
        System.out.print("Enter Student Education: ");
        String Edu = sc.nextLine();
        System.out.print("Enter Student CGPA: ");
        float Cgpa = sc.nextFloat();

        System.out.print("Enter Student Mobile No: ");
        long MoNo = sc.nextLong();
        System.out.print("Enter Student Aadhar No: ");
        long AddNo = sc.nextLong();

		System.out.println("Enter Student RollNo is" +RollNo);
		System.out.print(" ");
		System.out.println("Enter Student Name is" +Name);
		System.out.print(" ");
		System.out.println("Enter Student Address is" +Address);
		System.out.print(" ");
		System.out.println("Enter Student Education is" + Edu);
		System.out.print(" ");
		System.out.println("Enter Student CGPA" +Cgpa);
		System.out.print(" ");
		System.out.println("Enter Student MobileNo" +MoNo);
		System.out.print(" ");
		System.out.println("Enter Student Aadhar no" +AddNo);
		sc.close();
    }
}
