/**
 * Created by ulise on 07/03/2017.
 */
public class SuperKeyword {

    public static void main(String[] args) {
        Shape s = new Shape("Shape");
        Rectangle r = new Rectangle("Rectangle");
        Square sq = new Square("Square");
        /* Output:
        Shape
        Rectangle
        Square
        Note: "super" keyword must be used first within the new constructor
        */

        System.out.println("\n*** Using super keyword for methods ***");

        s.printMethod();     System.out.println();
        r.printMethod();     System.out.println();
        sq.printMethod();
        /*
        *** Using super keyword for methods ***
        Printed in Shape class

        Printed in Shape class
        Printed in Rectangle class

        Printed in Shape class
        Printed in Rectangle class
        Printed in Square class
        */

    }
}

class Shape {
    String text;

    Shape(String text){
        System.out.println(text);
    }

    public void printMethod(){
        System.out.println("Printed in Shape class");
    }
}

class Rectangle extends Shape {
    String text;

    Rectangle(String text){
        super(text);
    }

    @Override
    public void printMethod(){
        super.printMethod();
        System.out.println("Printed in Rectangle class");
    }
}

class Square extends Rectangle {
    String text;

    Square(String text){
        super(text);
        System.out.println("Note: \"super\" keyword must be used first within the new constructor.");
    }

    @Override
    public void printMethod(){
        super.printMethod();
        System.out.println("Printed in Square class");
    }
}
