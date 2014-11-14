package pacakge3;

import java.util.*;
import java.lang.*;
import java.io.*;

import package1.EvaluationPatterns;
import package2.Evaluation;
import package3.Student;

public class Demo {

    public static void main(String args[]) {

        Student s1 = new Student("rharish", 12051);
        s1.getMarks();
        System.out.println("\nThe total marks = " + s1.evaluate() );
    }
}
