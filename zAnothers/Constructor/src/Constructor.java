/**
 * Created by ulise on 05/03/2017.
 *
 * Constructor: -  a special method that is called when you use the "new" operator (when you create an object)
 *              - performs initializations of instance variables of a class
 *
 * There is a default constructor in Java. If you declare another constructor, the default one will not work anymore.
 * Constructors can be overloaded.
 */

public class Constructor {
    public static void main(String[] args) {

        Boy billy = new Boy("Billy",12);
        billy.getInfo();   //works

        Boy bob = new Boy();
       // bob.getInfo();  // brings an error, unless we declare a constructor for this case.

    }
}

class Boy{
    String name;
    int age;

//    Boy(){
//        name = "untitled";
//        age = 0;
//    }

    Boy(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void getInfo(){
        System.out.println("Boy name: "+name+"\nBoy age: "+age);
    }
}
