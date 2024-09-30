package Assignment7;

public class StudentMain {

    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student("Azim");
        Student student3= new Student(50);
        Student student4 = new Student("sara",10);

        student2.name="arshil";
        System.out.println(student2.name);
        student3.id=30;
        System.out.println(student3.id);

        StdSubClass subclass=new StdSubClass();
        //

    }
}
