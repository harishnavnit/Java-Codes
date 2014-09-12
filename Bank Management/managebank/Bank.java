package managebank;

import java.util.*;
import java.lang.*;
import java.io.*;

public class Bank {
    public static void main (String[] args) {

        SavingsAccount s1 = new SavingsAccount(5000, 10.0);

        System.out.println("\nThe balance in Savings Account is : " + s1.getBalance() );
        s1.credit(1000);

        System.out.println("\nThe balance in the Savings Account is :" + s1.getBalance() );
        s1.debit(800);

        System.out.println("\nThe balance in the Savings Account is : " + s1.getBalance() );

        CheckingAccount c1 = new CheckingAccount(3000, 10);
        System.out.println("\nThe balance in the checkings Account is " + c1.getBalance() );
        c1.credit(1000);

        System.out.println("\nThe balance in the new checkings Account is : " + c1.getBalance() );
        c1.credit(1000);

        System.out.println("\nThe new balance in the checkings Account is : " + c1.getBalance() );
        c1.debit(1500);

        System.out.println("\nThe new balance in the checkings Account is : " + c1.getBalance() );
    }
}
