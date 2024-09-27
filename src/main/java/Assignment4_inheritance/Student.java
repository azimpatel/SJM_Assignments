package Assignment4_inheritance;

public class Student extends Person{

    String grade;

    public void display()
    {
        System.out.println(name);
        System.out.println(age);
        System.out.println(grade+"\n");
    }
}
