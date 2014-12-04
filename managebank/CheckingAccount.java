package managebank;

import java.util.*;
import java.lang.*;
import java.io.*;

public class CheckingAccount extends Account {

    public double feePerTransaction;

    /* Constructor */
    public CheckingAccount(double initBal, double feeAmount) {
        super(initBal);
        feePerTransaction = feeAmount;
    }

    /* Re-defining member methods */
    void credit(double amount) {
        super.credit(amount - feePerTransaction);
    }

    /*void debit(double debitAmount) {
        if (super.debit(debitAmount)) {
            super.balance -= feePerTransaction;
        }
    }*/
}
