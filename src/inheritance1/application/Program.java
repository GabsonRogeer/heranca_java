package inheritance1.application;

import inheritance1.entities.Account;
import inheritance1.entities.BusinessAccount;
import inheritance1.entities.SavingsAccount;

public class Program {
    public static void main(String[] args) {

        Account acc = new Account(1001, "Gabson", 00.00);
        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.00, 500.0);

        //UPCASTING

        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003, "bob", 0.0, 200.00);
        Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);

        //DOWNCASTING


    }
}
