package Assignment2;//Assignment 1:
//Create a simple Person class
//Requirements:
//Define a class named Person with following attributes
//      1. String name
//       2. int age
//       3. String gender
//Implement a constructor to initialize all these     attributes
//Implement getters for all attributes(name, age, gender)
//implement setters for only age
//
//Add a method displayInfo() that prints out the person details in a readable format
//Assignment : Enhance your Person class to support constructor overloading
//        Requirements:
//Add additional constructor that takes name and age, with a default gender value ("NA")

public class Person{

    private String name;
    private int age;
    private String Gender;

    Person (String name,int age,String Gender)
    {
        this.name=name;
        this.age=age;
        this.Gender=Gender;
    }
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
    public String getGender()
    {
        return Gender;
    }
    public void  setAge(int age)
    {
        this.age=age;
    }

    void displayInfo()
    {
        System.out.println(getName()+" : "+getAge()+" : "+getGender());
    }
    Person(String name,int age)
    {
        this.name=name;
        this.age=age;
        Gender="NA";
    }
    public void setGender(String Gender)
    {
        this.Gender=Gender;
    }


}