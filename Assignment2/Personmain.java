import javax.lang.model.element.Name;

public class Personmain {
    public static void main(String[] args) {
        Person pr=new Person("Azim",28,"Male");
        System.out.println(pr.getName());
        System.out.println(pr.getAge());
        System.out.println(pr.getGender());
        pr.setAge(24);
        pr.displayInfo();

        Person p=new Person("sara",18);
        p.displayInfo();

        Person p2=new Person("Arshil",25);
        p2.setGender("Male");
        p2.displayInfo();

        Person p3=new Person("Habib",30);
        p3.displayInfo();



    }
}
