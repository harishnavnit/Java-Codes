import java.util.*;

public class Student extends Person {

    public int currentGrade;

    public Student(String personName, int grade) {
        super(personName);
        currentGrade = grade;
    }

    public String getName() {
        return super.getName() + "\t" + currentGrade;
    }

    public int getGrade() {
        return currentGrade;
    }

    /* Begining of the main method */
    public static void main (String[] args) {
        Person you = new Person("foo");
        Student me = new Student("bar", 12);

        System.out.println("\nYour name is " + you.getName() );
        System.out.println("\nYou are currently studying in Grade : " + me.getGrade() );
        System.out.println();
    }
}
