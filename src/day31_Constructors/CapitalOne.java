package day31_Constructors;

public class CapitalOne {
    public static void main(String[] args) {
        BankAccount account1= new BankAccount();
        account1.setInfo("Aniqa Siddiqi",123456789);
        System.out.println(account1);

        account1.deposit(1000);
        account1.checkBalance();

        account1.withdraw(500);
        account1.checkBalance();

        BankAccount account2= new BankAccount();
        account2.setInfo("Madihah Alam",987654321);
        System.out.println(account2);

        account2.deposit(50);
        account2.withdraw(25);
        account2.checkBalance();
        System.out.println(account2);

    }
}
