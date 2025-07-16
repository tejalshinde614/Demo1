package package1;  

class Methods{
	void multiplication()
	{
		int a=20;
		int b=20;
		int c= a*b;
		System.out.println(" Multiplication is :" +c);
		System.out.println(" ");
	}
}

public class MethodPractice {
	public static void  main(String[] args)
	{
		MethodPractice m1 = new MethodPractice();
		Methods m2 = new Methods();

	m1.Add();
	m1.Sub(90, 10);
	m1.Sub(80, 10);
	m1.Sub(70, 10);
	m1.Sub(60, 10);
	m1.Add1(80, 10.5f);
	
	m2.multiplication();//class Method2
	
	}
	void Add() 
	{
		int a=10;
		float b=10.5f;
		float c= a+b;
		
		System.out.println("This is a Method for Addisation");
		System.out.println(" Addisation"+c);
		System.out.println(" ");
	}
	
	void Sub(int a,int b)	
	{
		int c;
		c=a-b;
		System.out.println("This is a Method for Substraction");
		System.out.println("The Substraction of  a minus b is :"+c);
		System.out.println(" ");
	}
	
	void Add1(int a,float b) {
		float c=a+b;
		System.out.println("Substraction" +c);
		System.out.println(" ");
	}
}
