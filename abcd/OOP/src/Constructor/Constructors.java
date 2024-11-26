package Constructor;

public class Constructors {

    public String name;
    public int age;

    Constructors()
    {
        System.out.println("NON-constructor");
    }

    Constructors(String name, int age)
    {
        System.out.println("YES-constructor");
        this.name = name;
        this.age = age;
    }

    public void show()
    {
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println();
    }


}
