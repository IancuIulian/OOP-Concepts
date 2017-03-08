/**
 * Created by ulise on 09/03/2017.
 *
 *  Encapsulation: ~ data hiding
 *      - it helps us to show/hide what user can access
 *      - setting public getter method to read the private data fields
 *      - setting public setter method to update the private data fields
 *
 */
public class Encapsulation {

    public static void main(String[] args) {
        Me ulise = new Me("Iancu Iulian", 22);

        System.out.println("Name: "+ ulise.getName()+ "  Age: "+ ulise.getAge());

        ulise.setName("Modified");
        ulise.setAge(-1);

        System.out.println("Name: "+ ulise.getName()+ "  Age: "+ ulise.getAge());
    }
}

class Me{
    private String name;
    private int age;

    Me(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void setName(String newName){
        name = newName;
    }
    public void setAge(int newAge){
        age = newAge;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}
