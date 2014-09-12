/* Program that does the following given inputs as integers
 * 1. Reverses the digits
 * 2. Prints the digits
 * 3. Checks if the number is a palindrome
 * 4. Writes the number in words.
 */

import java.util.*;

class Operations {
  public static void main (String[] args) {

    /* Variable declarations */
    int digits;

    System.out.println("\nWelcome to the menu ! \n");
    System.out.println("\n\n1.Print the digits\n2.Reverse the digits\n3.Check if the number is palindrome\n4.Write the number in words\n\n");

    /* Create the scanner */
    Scanner in = new Scanner(System.in);

    System.out.print("\nEnter your choice : ");
    int choice = in.nextInt();
    System.out.print("\nEnter the number : ");
    int num = in.nextInt();

    switch(choice) {
      case 1 :
        /* Print the digits */
        System.out.println("\nPrinting the digits in Reverse order ! \n");
        while(num > 0) {
          digits = num%10;
          num = num/10;
          System.out.print(digits);
        }
        System.out.println("\n");
        break;

      case 2 :
        /* Reverse the digits */
        while(num > 0) {
          digits = num % 10;
          num /= 10;
          System.out.print(digits);
        }
        System.out.println("\n");
        break;

     // case 3 :
     //   /* Check if the number is a palindrome */
     //  int test_array[];                          //Declaring the array
     //  int test_array[] = new int[10];            //Creating/initializing the array

      case 4 :
        /* Print the number in words */

        default:
        System.out.println("Invalid choice : ");
    }
  }
}
