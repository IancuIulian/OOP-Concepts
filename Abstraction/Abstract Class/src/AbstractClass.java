/**
 * Created by ulise on 09/03/2017.
 *
 *  Abstract class  -  a class that is declared abstract
 *                  -  it may or may not include abstract methods
 *                  -  cannot be instantiated, but can be subclassed.
 *                  -  when an abstract class is subclassed, the subclass usually provides implementations
 *                     for all of the abstract methods in its parent class. However, if it does not, then
 *                     the subclass must also be declared abstract.
 *
 *  Abstract method -  a method that is declared without an implementation
 *
 *  Note: - a variable cannot be abstract
 *
 */

public class AbstractClass {
    public static void main(String[] args) {
        Potato p = new Potato();
        p.eat();
    }
}

abstract class Food{
    public void prepare(){
        System.out.println("Preparing food...");
    }

    abstract void eat();
}

class Potato extends Food{
    @Override
    public void eat() {
        System.out.println("Eating Potato");
    }
}

