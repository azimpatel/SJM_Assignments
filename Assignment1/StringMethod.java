import java.util.Arrays;
import java.util.Locale;

public class StringMethod {
    public static void main(String[] args) {

        String s1="  welcome to java";
        String s2="Automation testing";

        System.out.println(s1+s2);   // welcome to javaAutomation testing
        System.out.println(s1.concat(s2));  //welcome to javaAutomation testing

        System.out.println(s2.length());   //18

        System.out.println(s1.trim());   //welcome to java

        System.out.println(s2.charAt(5));  // a

        System.out.println(s1.contains("  wel")); // true

        System.out.println(s1==s2); //false

        System.out.println(s1.equals(s2));//false

        System.out.println(s2.equals("Automation testing")); //true

        System.out.println(s1.replace("java","coding")); // welcome to coding

        System.out.println(s1.substring(3,10));//elcome

        System.out.println(s1.toUpperCase()); // WELCOME TO JAVA

        System.out.println(s2.toLowerCase());  //automation testing

        System.out.println(s2.equalsIgnoreCase("AUTOMATION TESTING")); //true

        String s3="abc@gmail.com";
        String [] a=s3.split("@");
        System.out.println(a[0]);  //abc
        System.out.println(a[1]);  //gmail.com

       System.out.println(Arrays.toString(a));  //[abc, gmail.com]

    }
}
