import java.util.*;
public class PasswordGenerator {
	public static void main(String args[]) {
		String initials, firstName;
		int age;
		// Create the scanner
		Scanner in = new Scanner(System.in);
		System.out.print("\nEnter your first name : ");
		firstName = in.nextLine();
		System.out.print("\nEnter your initials : ");
		initials = in.nextLine();
		System.out.print("Enter your age : ");
		age = in.nextInt();
		System.out.print("\nYour password is : ");
		System.out.print(firstName.charAt(0) + initials.charAt(0) + "_" + firstName.substring(1, firstName.length()) + "_" + age);
		System.out.println();
	}
}