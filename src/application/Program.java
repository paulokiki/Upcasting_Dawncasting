package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

    public static void main(String[] args) {
        Account acc = new Account(1001, "Alex", 0.0);
        BusinessAccount bacc = new BusinessAccount(0.0, 1002, "Maria", 500.00);

        //UPCASTING
        // Quando um objeto da subclasse é atribuido a um objeto da super classe
        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(0.0, 1003, "Bob", 0.01);
        Account acc3 = new SavingsAccount(0.0, 1004, "Anna", 0.01);

        //DOWNCASTING
        // Quando um objeto da super classe é atribuido a um objeto da subclasse
        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(100.00);

        // BusinessAccount acc5 = (BusinessAccount) acc3; //SavingsAccount não pode ser convertido para businessAccount
        if (acc3 instanceof BusinessAccount) { // testar se objeto acc3 é instacia de businessAccount
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(200.0);
            System.out.println("Loan!");
        }
        if (acc3 instanceof SavingsAccount) {
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }
        
        Account acc6 = new Account(1001, "Alex", 1000.0);
        acc6.withdraw(200.0);
        System.out.println(acc6.getBalance());
        
        Account acc7 =  new SavingsAccount(0.01, 1002, "Maria", 1000.0);
        acc7.withdraw(200.0);
        System.out.println(acc7.getBalance());
        
        BusinessAccount acc8 = new BusinessAccount(1002, 1000, "Paulo", 1000.0);
        //acc8.withdraw(200.0);
        System.out.println(acc8.getBalance());
        
        Account acc9 = acc8;
        acc9.withdraw(200.0);
        System.out.println(acc9.getBalance());
    }

}
