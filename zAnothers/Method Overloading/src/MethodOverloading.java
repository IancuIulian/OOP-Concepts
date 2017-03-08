/**
 * Created by ulisee on 12/11/16.
 */

/*
* Method Overloading - SAME CLASS, 2 (or more) methods having the SAME NAME but DIFFERENT ARGUMENT LIST
*
*                       (ex1: different numbers of parameters
*                        ex2: different type of parameters
*                        ex3: different order of parameters)
*
*
*   	Overloading                  vs         Overriding
* 	    1. Within the class                      1. Between Parent and Child class
* 	    2. Different Parameters                  2. Same Parameters
* 	    3. Works with static                     3. Does not work with static
* 	    4. Compile time                          4. Runtime
*
*/

public class MethodOverloading {
    public static void main(String[] args) {
        int i = 1;
        double d = 2.0;
        String s = "Example";

        display(i);
        display(i, d);
        display(d, i);
        display(s, i, d);
    }

    private static void display(int i) {
        System.out.println(" i = " + i);
    }

    private static void display(int i, double d) {
        System.out.println(" i = " + i + "\t d = " + d);
    }

    private static void display(double d, int i) {
        System.out.println(" d = " + d + "\t i = " + i);
    }

    private static void display(String s, int i, double d) {
        System.out.println(" " + s + "\ti = " + i + "\td = " + d);
    }
}
