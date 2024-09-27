package Assignment4_inheritance;

public class Main {

    public static void main(String[] args) {

        Person person = new Person();
        person.name="azim";
        person.age=28;
        person.display();


        Student stusent = new Student();
        stusent.name="sara";
        stusent.age=18;
        stusent.grade="A+";
        stusent.display();


        Teacher teacher = new Teacher();
        teacher.name="mustak";
        teacher.age=25;
        teacher.subject="Science";
        teacher.display();


    }
}
