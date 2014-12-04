package managebank;

import java.util.*;
import java.lang.*;
import java.io.*;

public class SavingsAccount extends Account {

    public double interestRate;

    /* Constructor */
    public SavingsAccount(double initBal, double initInterest) {
        super(initBal);
        interestRate = initInterest;
    }

    /* Member functions */
    double calculateInterest() {
        double calculatedInterest = super.balance * interestRate;
        return calculatedInterest;
    }
}
