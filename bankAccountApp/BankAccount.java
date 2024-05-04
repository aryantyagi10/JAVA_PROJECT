package bankAccountApp;

public class BankAccount {
    public static void main(String[] args) {

        Checking chkacc1 = new Checking("Aryan Tyagi", "123456789", 1500);
        Savings svacc1 = new Savings("Aryan", "987654321", 2000);

        chkacc1.showInfo();
        System.out.println("***********************************************");
        svacc1.showInfo();
        svacc1.deposit(5000);
        svacc1.withdraw(1000);
        svacc1.transfer("Aryan Tyagi", 2000);

        //Read a CSV file then create new accounts based on that data

    }
}
