package Assignment4_inheritance;
/*
Create a class hierarchy where:
There is a Person class with attributes like name, age, and methods like display(),
which prints the name and age.
Extend the Person class into Student and Teacher classes.
 The Student class should have an additional attribute grade, and the Teacher class should have subject.
In the Student and Teacher classes,
override the display() method to print their specific details along with name and age.

Tasks:
Create instances of Person, Student, and Teacher.
Call the display() method on each to check inheritance.
*/

public class Person {

    String name;
    int age;

    public void display()
    {
        System.out.println(name);
        System.out.println(age+"\n");
    }

}
