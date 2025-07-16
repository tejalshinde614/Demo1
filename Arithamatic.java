//Q6) Write a java program to add Substract .multiply,and divide two numbers
//entered by the users
package package1;

import java.util.Scanner;

public class Arithamatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc =  new Scanner(System.in);
     System.out.println("Enter First no");
     int First = sc.nextInt();
     System.out.println("Enter Second no");
     int Second = sc.nextInt();
  
     System.out.println("Addisation of two number is =" +(First + Second));
     System.out.println(" ");
     System.out.println("Multiplication of two number is =" +(First * Second));
     System.out.println(" ");
     System.out.println("Divisation of two number is =" +(First / Second));
     System.out.println(" ");
     System.out.println("Mod of two number is =" +(First % Second));
     sc.close();
	}

}
