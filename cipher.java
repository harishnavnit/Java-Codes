
import java.util.*;

public class cipher {
    public static void main(String args[]) {

        int el, diff;
        char paste;

        /* Creating the scanner */
        Scanner in = new Scanner(System.in);

        System.out.print("\nPlain text : ");
        String plain = in.nextLine();
        System.out.print("\nEnter the key : ");
        int key = in.nextInt();

        System.out.print("\nCipher text : ");
        /* Logic for cipher */
        for(int i=0; i<plain.length(); i++) {
            if(plain.charAt(i) != ' ') {
                el = (int)plain.charAt(i);
                el += key;

                if(el > 122) {
                    diff = el - 122;
                    el = 97 + diff;
                }
                paste = (char)el;

                System.out.print(paste + " ");
            }
        }

        System.out.println();
    }
}
