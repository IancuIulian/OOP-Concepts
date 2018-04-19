/**
 * Created by ulise on 07/03/2017.
 */
public class ConstructorChaining {
    public static void main(String[] args) {
        Shape s = new Shape();
        System.out.println();

        Rectangle r = new Rectangle();
        System.out.println();

        Square sq = new Square();
    }
}
/* Output:
Shape

Shape
Rectangle

Shape
Rectangle
Square
*/

class Shape {

    Shape(){
        System.out.println("Shape");
    }
}

class Rectangle extends Shape {

    Rectangle(){
        System.out.println("Rectangle");
    }
}

class Square extends Rectangle {

    Square(){
        System.out.println("Square");
    }
}
