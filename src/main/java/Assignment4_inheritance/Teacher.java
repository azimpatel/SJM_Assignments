package Assignment4_inheritance;

public class Teacher extends Person{

    String subject;

    public void display()
    {
        System.out.println(name);
        System.out.println(age);
        System.out.println(subject+"\n");
    }
}
