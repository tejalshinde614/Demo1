//Q2) WAP in which take multipal variables(Global,Static,Local) and petform arithamatic
//operation on each and print the Result using object
package package1;

public class Variables {

    // Global Variabal
    class Global {
        int a = 10;
        int b = 20;
    }

    // Static Variable
    static class Static {
        static int a = 20;
        static int b = 20;
    }

    public static void main(String[] args) {

        // Local Variabal
        class Local {
            int a = 10;
            int b = 10;
        }

       
        Variables outer = new Variables(); 
       // Global Object
        Global g = outer.new Global();

        System.out.println("Global Variables:");
        System.out.println("Addition = " + (g.a + g.b));
        System.out.println("Multiplication = " + (g.a * g.b));
        System.out.println("Subtraction = " + (g.a - g.b));
        System.out.println("Division = " + (g.a / g.b));
        System.out.println("Modulus = " + (g.a % g.b));
        System.out.println();

        // Local object
        Local l1 = new Local();

        System.out.println("Local Variables:");
        System.out.println("Addition = " + (l1.a + l1.b));
        System.out.println("Multiplication = " + (l1.a * l1.b));
        System.out.println("Subtraction = " + (l1.a - l1.b));
        System.out.println("Division = " + (l1.a / l1.b));
        System.out.println("Modulus = " + (l1.a % l1.b));
        System.out.println();

        // Static object
        Static s1 = new Static();
        
        System.out.println("Static Variables:");
        System.out.println("Addition = " + (s1.a + s1.b));
        System.out.println("Multiplication = " + (s1.a * s1.b));
        System.out.println("Subtraction = " + (s1.a - s1.b));
        System.out.println("Division = " + (s1.a / s1.b));
        System.out.println("Modulus = " + (s1.a % s1.b));
        System.out.println();
    }
}
