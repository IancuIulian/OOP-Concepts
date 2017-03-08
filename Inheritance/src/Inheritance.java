/**
 * Created by ulise on 06/03/2017.
 *
 *  Inheritance - the process where one class acquires properties of another
 *              - keyword:  " extends "
 *              - the derived class can access base class properties AND the derived class has its own properties.
 *
 *  Multiple inheritance is not allowed in Java (cannot extend more than one class).
 *  To inherit more classes, one have to use interfaces.
 */

public class Inheritance {
    public static void main(String[] args) {
        C obj = new C();

        obj.methodA();
        obj.methodB();
        obj.methodC();
    }
}

class A{

    public void methodA(){
        System.out.println("class A method");
    }
}

class B extends A{

    public void methodB(){
        System.out.println("class B method");
    }
}

class C extends B{

    public void methodC(){
        System.out.println("class C method");
    }
}
