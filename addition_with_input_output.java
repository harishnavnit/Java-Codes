import java.util.*;

class addition_with_input_output {
  public static void main(String args[]) {

    int sum;

    /* Creating the scanner */
    Scanner in = new Scanner(System.in);

    /* Getting the input */
    System.out.print("Enter the first number : ");
    int num1 = in.nextInt();
    System.out.print("Enter the second number : ");
    int num2 = in.nextInt();

    /* Perform the addition */
    sum = num1 + num2;

    /* Print the result */
    System.out.println("\nSum of the two numbers = " + sum);
  }
}
