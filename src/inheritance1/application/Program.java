package inheritance1.application;

import inheritance1.entities.Account;
import inheritance1.entities.BusinessAccount;
import inheritance1.entities.SavingsAccount;

public class Program {
    public static void main(String[] args) {

        Account x = new Account(1001, "Alex", 1000.0);
        Account y = new SavingsAccount(1002, "Bob", 1000.0,0.01);

        x.sacar(50.0);
        y.sacar(50.0);

        System.out.println(x.getSaldo());
        System.out.println(y.getSaldo());

    }
}
