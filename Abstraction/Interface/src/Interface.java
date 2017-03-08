/**
 * Created by ulise on 06/03/2017.
 *
 *  Interface - a completely abstract class that contains only abstract methods
 *            - cannot contain an implementation of the methods (it is possible in Java 8)
 *            - cannot be instantiated — they can only be implemented by classes or extended by other interfaces
 *            - cannot contain a constructor (because interfaces cannot be instantiated)
 *            - can contain constant declarations. All constant values defined in an interface are implicitly public, static, and final
 *
 *  A class can inherit (extend) from just one superclass, but can implement multiple interfaces!
 *
 * If your class claims to implement an interface, all methods defined by that interface must appear in its source code
 * before the class will successfully compile.
 *
 */
public class Interface {
    public static void main(String args[])
    {
        D obj1= new D();

        obj1.methodA();
        obj1.methodB();
        obj1.methodC();
    }
}


interface A {
    int a=0;
    public void methodA();
}

interface B extends A {
    public void methodB();
}

interface C extends A {
    public void methodC();
}

class D implements B, C {

    public void methodA() {
        System.out.println("MethodA");
    }

    public void methodB() {
        System.out.println("MethodB");
    }

    public void methodC() {
        System.out.println("MethodC");
    }

}