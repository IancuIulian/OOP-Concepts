/**
 * Created by ulise on 08/03/2017.
 *
 *  Polymorphism - the ability of an object to take on many forms
 *
 *  Note: The superclass reference variable can point to any object of it's subclasses;
 *        Depending on that object, it can call the overriden method of the method it defines
 *
 *
 *  Polymorphism types: - Compile time polymorphism (static binding) -> method overloading
 *                      - Runtime polymorphism (dynamic binding) -> method overriding
 *
 *      Method overloading is an example of compile time/static polymorphism because method binding between
 *          method call and method definition happens at compile time and it depends on the reference of the
 *          class (reference created at compile time and goes to stack).
 *
 *      Method overriding is an example of run time/dynamic polymorphism because method binding between
 *          method call and method definition happens at run time and it depends on the object of the class
 *          (object created at runtime and goes to the heap).
 *
 */

public class Polymorphism {

    public static void main(String[] args) {
        Food[] myFood = new Food[3];  //this is called a polymorphic array
        myFood[0] = new Food();
        myFood[1] = new Potato();
        myFood[2] = new Bread();

        for (Food f : myFood) {
            f.eat();
        }

        System.out.println("*******");
        //Food2 class has the "eating(Food f)" method, where "f" can be of type Food, Potato or Bread
        Food2 food2 = new Food2();
        food2.eating(myFood[0]);
        food2.eating(myFood[1]);
        food2.eating(myFood[2]);
    }
}

class Food{
    public void eat(){
        System.out.println("What should I eat?");
    }
}

class Potato extends Food{
    @Override
    public void eat(){
        System.out.println("This potato is great!");
    }
}

class Bread extends Food{
    @Override
    public void eat(){
        System.out.println("This Bread is great!");
    }
}

class Food2{
    public void eating(Food f){  //object "f" can be of type Food or any of it's subclasses (Potato, Bread)
        f.eat();
    }
}