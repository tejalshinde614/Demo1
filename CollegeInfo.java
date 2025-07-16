//Q4) Create a class Student With fileds name,roll,and Method displayInfo()
//create an object of the class and set data print the ditels using object
package package1;

class Fybcs{
	public static final String StdClass = null;
	int RollNo=10;
	String StdName = "Tejal";
	String StdtClass ="Fybcs";
	long StdAdharNo =635123575612l;
	float StdPercentage = 90.22f;
}

class Sybcs{
	public static final String StdClass = null;
	int RollNo=11;
	String StdName = "Ram";
	String StdtClass ="Sybcs";
	long StdAdharNo =641456575612l;
	float StdPercentage = 92.33f;
}

class Tybcs{
	int RollNo=12;
	String StdName = "Sham";
	String StdClass ="Tybcs";
	long StdAdharNo =635123512122l;
	float StdPercentage = 95.44f;
}

public class CollegeInfo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Fybcs object
		Fybcs f1 = new Fybcs();
		System.out.println("Fybcs Student Informesation");
		System.out.println("Student Roll No is =" +f1.RollNo);
		System.out.println("Student Roll No is =" +f1.StdName);
		System.out.println("Student Roll No is =" +f1.StdClass);
		System.out.println("Student Roll No is =" +f1.StdAdharNo);
		System.out.println("Student Roll No is =" +f1.StdPercentage);
		System.out.println("Student Roll No is =" +f1.RollNo);
		System.out.println(" ");
		
		//Sybcs Object
		Sybcs s1 = new Sybcs();
		System.out.println("Sybcs Student Informesation");
		System.out.println("Student Roll No is =" +s1.RollNo);
		System.out.println("Student Roll No is =" +s1.StdName);
		System.out.println("Student Roll No is =" +s1.StdClass);
		System.out.println("Student Roll No is =" +s1.StdAdharNo);
		System.out.println("Student Roll No is =" +s1.StdPercentage);
		System.out.println("Student Roll No is =" +s1.RollNo);
		System.out.println(" ");
		
		//Tybcs object
		Tybcs t1 = new Tybcs();
		System.out.println("Tybcs Student Informesation");
		System.out.println("Student Roll No is =" +t1.RollNo);
		System.out.println("Student Roll No is =" +t1.StdName);
		System.out.println("Student Roll No is =" +t1.StdClass);
		System.out.println("Student Roll No is =" +t1.StdAdharNo);
		System.out.println("Student Roll No is =" +t1.StdPercentage);
		System.out.println("Student Roll No is =" +t1.RollNo);
		System.out.println(" ");
	}

}
