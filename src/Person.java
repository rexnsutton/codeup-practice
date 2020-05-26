import java.util.Arrays;

public class Person {
    private String name;
    public Person(String name){
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void sayHello(){
        System.out.println("hello " + this.name);
    }

    public static void main(String[] args) {
        Person rex = new Person("Rex");
        System.out.println(rex.getName());
        rex.setName("dave");
        rex.sayHello();

    }
}
