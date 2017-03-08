/**
 * Created by ulise on 06/03/2017.
 */
public class Constructor_this {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Dog dog2 = new Dog("Wollie", 2);

        Dog.DogPrinter(dog);
        Dog.DogPrinter(dog2);
    }
}

class Dog{
    String name;
    int age;

    Dog(){
        this("untitled", 0);
    }

    Dog(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public static void DogPrinter(Dog d){
        System.out.println("Dog \""+d.name+"\" age \""+d.age+"\" says hi");
    }
}
