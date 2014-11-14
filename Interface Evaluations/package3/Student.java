package pacakge3;

import java.util.*;
import java.lang.*;
import java.io.*;

import package2.Evaluation;

public class Student implements Evaluation {

    public String Name;
    public int Id, homeAssignmentsMarks, classTestsMarks, periodicalsMarks, endExamMarks;

    /* Constructor */
    public Student(String stud_name, int ID) {
        Name = stud_name;
        Id = ID;
    }

    /* Implement the interface function evaluate().
     * Function calculates and returns the total marks of the student.
     */
    public int evaluate() {
        return homeAssignmentsMarks + classTestsMarks + periodicalsMarks + endExamMarks;
    }

    public void getMarks() {
        Scanner in = new Scanner(System.in);

        System.out.print("\nEnter marks in Home Assignments : ");
        homeAssignmentsMarks = in.nextInt();

        System.out.print("\nEnter the marks in Class Tests : ");
        classTestsMarks = in.nextInt();

        System.out.print("\nEnter the marks in Periodicals : ");
        periodicalsMarks = in.nextInt();

        System.out.print("\nEnter the marks in the end exam : ");
        endExamMarks = in.nextInt();
    }
}
