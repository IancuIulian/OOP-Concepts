/**
 * Created by ulise on 07/03/2017.
 *
 *  Method OVERRIDING  -  The ability of a subclass (child class) to provide a specific implementation of a method that
 *                        is already provided by one of its superclasses (parent classes)
 *
 *                     -  DIFFERENT Class (Parent - Child), rewritten method with SAME Name, SAME Parameters, different behaviour
 *					
 *					   - the acces level cannot be more restrictive than the overriden's method acces level
 *					   - a final/static method cannot be overriden
 *
 *   	Overloading                  vs         Overriding
 * 	    1. Within the class                      1. Between Parent and Child class
 * 	    2. Different Parameters                  2. Same Parameters
 * 	    3. Works with static                     3. Does not work with static
 * 	    4. Compile time                          4. Runtime
 */

public class MethodOverriding {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.makeSound();
        cat.makeSound();
    }
}

class Animal{
    int legs;
    public void makeSound(){
        System.out.println("Grrr");
    }
}

class Dog extends Animal{
    @Override   //method overriding is done during Runtime. Use " @Override " to check for errors during Compile time.
    public void makeSound(){
        System.out.println("Woof!");
    }
}

class Cat extends Animal{
    @Override
    public void makeSound(){
        System.out.println("Meow!");
    }
}
