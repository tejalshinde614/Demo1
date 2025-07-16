//Write a Program in which create classes CAR,BIKE,BICYCLE ,Vehicls(main) in those classes
//real word entieies releted to those classes and display it
package package1;

class Student{
	String name="Tejal";
	int[] markes= {90,80,88};
	short StudentRoll=34;
	String StudentName="Sham";
	String StudentClass="TyBcs";
    short StudentMarkes =600;
    float StudentPer=90.52f;
    String StudentAddress ="Sangamner";
}

class 	Car{
	
	String Carname="Scorpio";
	String Carcolor="Blue";
    String Carmodel ="Mahindra";
    float Carprice =13.99f;
    int Inshurance = 85409;
}
    class Bike{
    	String Bikename="GL1800 Gold Wing";
    	String Bikecolor="Green";
        String Bikemodel ="Honda";
        float Bikeprice =2.5f;
        int BikeInshurance = 5000;
        short Maxpower=93;
        short Maxtorque=170;
    }
    
    class 	Bicycle{
    	String Bicyclename="JetGold";
    	String Bicyclecolor="Red";
        String Bicyclemodel ="Hero";
        int Bicycleprice =6300;
        int BicycleInshurance = 1600;
      
    }
    
   
   
	
public class Vehicals {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		System.out.println("Student Informesation");
		System.out.println("Student Roll Number is :"+s1.StudentRoll);
		System.out.println("Student Roll Name is :"+s1.StudentName);
		System.out.println("Student Roll Class is :"+s1.StudentClass);
		System.out.println("Student Roll Markes is :"+s1.StudentMarkes);
		System.out.println("Student Roll Percentage is :"+s1.StudentPer);
		System.out.println("Student Roll Number is :"+s1.StudentAddress);
		System.out.println(" ");
		
		//Car object
		
		Car c1 = new Car();
		System.out.println("Car Informesation");
		System.out.println("Car Name is :"+c1.Carname);
		System.out.println("Car Color is :"+c1.Carcolor);
		System.out.println("Car Model is :"+c1.Carmodel);
		System.out.println("Car Price is :"+s1.StudentMarkes);
		System.out.println("Car Inshurance Price is :"+c1.Inshurance);
		System.out.println(" ");
		
		//Bike Object
		
		Bike b1 = new Bike();
		System.out.println("Bike Informesation");
		System.out.println("Bike Name is :"+b1.Bikename);
		System.out.println("Bike Color is :"+b1.Bikecolor);
		System.out.println("Bike Model is :"+b1.Bikemodel);
		System.out.println("Bike Price is :"+b1.Bikeprice);
		System.out.println("Bike Inshurance Price is :"+b1.BikeInshurance);
		System.out.println("Bike MaxPower is :"+b1.Maxpower);
		System.out.println("Bike Maxtorque is :"+b1.Maxtorque);
		
		//Bicycle Object
		
		
		Bicycle b2 = new Bicycle();
		System.out.println("Bike Informesation");
		System.out.println("Bike Name is :"+b2.Bicyclename);
		System.out.println("Bike Color is :"+b2.Bicyclecolor);
		System.out.println("Bike Model is :"+b2.Bicyclemodel);
		System.out.println("Bike Price is :"+b2.Bicycleprice);
		System.out.println("Bike Inshurance Price is :"+b2.BicycleInshurance);
		System.out.println(" ");
		
	}
}
    


