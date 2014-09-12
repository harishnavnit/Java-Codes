/* A simple program that gives the user a calculator menu */

import java.util.*;

class calculator {
  public static void main(String args[]) {

    /* Variable declarations */
    int sum, product, quotient, difference;

    System.out.println("\n\t\tWelcome to the calculator menu : \n");
    System.out.println("\nChoices : \n\n1.Add\n2.Subtract\n3.Multiply\n4.Divide\n");

    /* Create a scanner */
    Scanner in = new Scanner(System.in);
    System.out.print("\nEnter your choice : ");
    int choice = in.nextInt();

    System.out.print("\nEnter first value : ");
    int var1  = in.nextInt();
    System.out.print("\nEnter the second value : ");
    int var2 = in.nextInt();

    /* Switch - case implementation */
    switch(choice) {
      case 1 :
              sum = var1 + var2;
              System.out.println("\nSum of the two numbers = " + sum);
              break;

      case 2 :
              difference = var1 - var2;
              System.out.println("\nDifference of the two numbers = " + difference);
              break;

      case 3 :
              product = var1 * var2;
              System.out.println("\nProduct of the two numbers = " + product);
              break;

      case 4 :
              quotient = var1 / var2;
              System.out.println("\nQuotient = " + quotient);
              break;

      default:
        System.out.println("\nInvalid Choice ! ");
    }
  }
}
