/**
 * Created by ulise on 14/03/2017.
 */
public class PolymorphismConceptChallenge {

    public static void main(String[] args) {
        Person u = new Undergrad();
        u.method1();
    }
}

class Person{
    public void method1(){
        System.out.println("Person 1");
    }
    public void method2(){
        System.out.println("Person 2");
    }
}

class Student extends Person{
    @Override
    public void method1() {
        System.out.println("Student 1");
        super.method1();
        method2();  // here java calls "this.method2();" --> that is Undergrad's method2().
        // if there was no method2() inside Undergrad class, Student's method2() would have been called
    }
    @Override
    public void method2() {
        System.out.println("Student 2");
    }
}

class Undergrad extends Student{
    @Override
    public void method2() {
        System.out.println("Undergrad 2");
    }
}

/* Output:
Student 1
Person 1
Undergrad 2
*/
