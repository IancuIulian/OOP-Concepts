/**
 * Created by ulise on 06/03/2017.
 */
public class InstanceMethod_StaticMethod {

    public static void main(String[] args) {
        Test test = new Test();

        test.instanceMethod();
        Test.staticMethod(test);
    }
}

class Test{
    int a = 10;

    public void instanceMethod(){  //here it is safe to use "this" keyword
        int a = 25;
        System.out.println("Inside Instance Method...");
        System.out.println(this.a);
    }

    public static void staticMethod(Test t){    //we can't use "this" keyword here since this method is static
                                                //we have to create an object of type "Test" in order to reach variable "a"
        int a = 35;
        System.out.println("Inside Static Method...");
        System.out.println(t.a);
    }
}

