//Q2) WAP in which take multipal variables(Global,Static,Local) and petform arithamatic
//operation on each and print the Result
package package1;

public class Global {
	
	int a=8;
	int b=2;//global variable

	public static void main(String[] args) {
		Global obj = new Global();
		System.out.println( "Addisation ="+(obj.a + obj.b));
		System.out.println("Multification ="+(obj.a*obj.b));
		System.out.println("Substraction ="+(obj.a-obj.b));
		System.out.println("Divisation ="+(obj.a/obj.b));
		System.out.println("Modulas ="+(obj.a%obj.b));
}
}

