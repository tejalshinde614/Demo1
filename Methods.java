package package1;  
class Method2{
	void multiplication()
	{
		int a=20;
		int b=20;
		int c= a*b;
		System.out.println(" Multiplication is :" +c);
		System.out.println(" ");
	}
}

public class Methods {
	public static void  main(String[] args) //perdefined it is an method //void=return type
	//returnType methodName(dataType Variable_Name)
	
	//object inside class
	{
	Methods m1 = new Methods();
	Method2 m2 = new Method2();
	
	
	m2.multiplication();
	
	m1.Add();
	m1.Sub(90, 10);// one method can exicute multiple times
	m1.Sub(80, 10);
	m1.Sub(70, 10);
	m1.Sub(60, 10);
	
	m1.Add1(80, 10.5f);
	
	}

	//object outside class
	Method2 m2 = new Method2();
	{
		
		m2.multiplication();
	}
	//non parameterized method /non static method
	void Add() //out side the main method so we create an object m1
	{
		int a=10;
		float b=10.5f;
		float c= a+b;
		
		System.out.println("This is a Method for Addisation");
		System.out.println(" Addisation"+c);
		System.out.println(" ");
	}
	
	// parameterized method
	void Sub(int a,int b)//userdefined(type= 1)parametrased 2)non-parametrasaed.)  it is an method
	
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
