package managebank;

import java.util.*;
import java.lang.*;
import java.io.*;

public class Account {

    public double balance;

    // Constructor
    public Account(double initBal) {
        if(initBal >= 0)
            balance = initBal;
    }

    /* Member functions */
    void credit(double addToBal) {
        balance += addToBal;
    }

    boolean debit(double subFromBal) {

        if( subFromBal <= balance) {
            balance -= subFromBal;
            return true;
        } else {
            System.out.println("\nDebit ammount exceeded account balance\n");
            return false;
        }
    }

    double getBalance() {
        return balance;
    }
}
