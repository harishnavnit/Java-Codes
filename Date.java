/* Write an application demonstrating the creation of date object and using the methods in it */

import java.util.*;         //used for the GregorianCalendar class
import java.text.*;         //used for the DateFormat class

public class Date {

    public static void main (String[] args) {

        int month,day;                          //Store day and month attributes

        // Creating the object
        GregorianCalendar randomDay = new GregorianCalendar(2014,Calendar.SEPTEMBER, 6);

        // Using get() to return the day of the month and the month of the year
        day = randomDay.get(Calendar.DAY_OF_MONTH);
        System.out.println("\nDay of the month is : " + day);

        month = randomDay.get(Calendar.MONTH);
        System.out.println("\nMonth of the year is : " + month);

        // Manipulating the date
        randomDay.add(Calendar.DAY_OF_MONTH, -9);

        // Now, checking the date
        day = randomDay.get(Calendar.DAY_OF_MONTH);
        System.out.println("\nDay of the month is : " + day);

        month = randomDay.get(Calendar.MONTH);
        System.out.println("\nMonth of the yer is : " + month);

        /* Formatting the date using DateFormat */
        DateFormat dformat = DateFormat.getInstance();
        System.out.println("\nFormatted date : " + dformat.format(randomDay.getTime()));
    }
}
