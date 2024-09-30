package Assignment7;
/*1.Create a class with constructor overloading.
  1.Create a subclass for the clas created in the step 1.
  1.Requirement is class(){} --> make this as private.*/

public class Student {

    String name;
    int id;

    public Student()
    {
        System.out.println();
    }
    public Student(String name)
    {
        System.out.println(name);
    }
    public Student(int id)
    {
        System.out.println(id);
    }
    public Student(String name, int id)
    {
        System.out.println(name+" : "+id);
    }

}
