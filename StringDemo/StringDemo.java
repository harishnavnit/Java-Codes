/* Develop a class StringDemo that demonstrates the following string operations
 * 1. Comparison
 * 2. Length of a string
 * 3. Number of words
 * 4. Uppercase conversion
 * 5. Check for a particular sequence of characters
 * 6. Replace a character with another
 * 7. Check if a string is suffixed or prefixed with a value
 *
 */

import java.util.*;


public class StringDemo {

    /* Main method */
    public static void main (String[] args) {

        //Local variables
        String input, to_be_compared, dummy;
        int choice, length, count = 0;

        //Creating the scanner
        Scanner in = new Scanner(System.in);

        System.out.print("\nEnter the input string : ");
        input = in.nextLine();

        System.out.println("Operations on strings are \n");
        System.out.print("\n1. Comparison\n2. String Length\n3. Number of words\n4. Uppercase conversion\n5. Check for sequence\n6. Character replacement\n7. Check prefix and suffix\n");
        System.out.print("\nEnter your choice of operation : ");
        choice = in.nextInt();

        switch (choice) {
            case 1 :
                dummy = in.nextLine();
                System.out.print("\nEnter the string to be compared : ");
                to_be_compared = in.nextLine();

                if(input.equals(to_be_compared))
                    System.out.println("\nThe two strings are equal !\n");
                else
                    System.out.println("\nThe two strings are NOT equal !\n");

                break;

            case 2 :
                length = input.length();
                System.out.println("\nThe length of the string = " + length);
                break;

            case 3 :
                for(int i=0; i<input.length(); i++) {
                    if(input.charAt(i) == ' ')
                        count++;
                }
                System.out.println("\nThe number of words = " + count + "\n");
                break;

            case 4 :
                String upper_case = input.toUpperCase();
                System.out.println("\nThe entered string in upper-case is : " + upper_case);
                break;

            case 5 :
                dummy = in.nextLine();
                String sequence;
                sequence = in.nextLine();
                if(input.contains(sequence))
                    System.out.println("\nThe entered string contains the given sequence\n");
                else
                    System.out.println("\nThe entered string does NOT contain the given sequence\n");
                break;

            case 6 :
                char replace, replaced_with;
                System.out.print("\nEnter the character to be replaced : ");
                replace = in.next().charAt(0);
                System.out.print("\nEnter the character to be replaced with : ");
                replaced_with = in.next().charAt(0);

                String post_replacement = input.replace(replace, replaced_with);
                System.out.println("\nThe string after replacing the characters is : " + post_replacement);
                break;

            case 7 :
                dummy = in.nextLine();
                String suffix, prefix;
                System.out.print("\nEnter the prefix : ");
                prefix = in.nextLine();
                System.out.print("\nEnter the suffix : ");
                suffix = in.nextLine();

                // Check for pre-fix
                if(input.startsWith(prefix))
                    System.out.print("\nYes, the string is pre-fixed with the entered value\n");
                else
                    System.out.print("\nThe string is NOT pre-fixed with the entered value\n");

                // Check for suffix
                if(input.endsWith(suffix))
                    System.out.print("\nYes, the string is suffixed with the entered value\n");
                else
                    System.out.print("\nThe string is NOT suffixed with the entered value\n");

                break;

            default:
                System.out.println("\nSorry ! Invalid choice\n");
        }
    }
}
