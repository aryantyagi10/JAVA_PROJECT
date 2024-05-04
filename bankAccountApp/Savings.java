package bankAccountApp;

import java.util.concurrent.ThreadLocalRandom;

public class Savings extends Account{
    //List properties specific to saving account
    private int safetyDepositBoxID;
    private int safetyDepositBoxKey;

    //Constructor to initialize Saving account properties
    public Savings(String name, String sSN, double initialDeposit){
        super(name, sSN, initialDeposit); //In order to call the superclass, we need to explicitly invoke that with super keyword.
        accountNumber = "1" + accountNumber;
        setSafetyDepositBoxID();
    }

    public void setRate(){
        rate = getBaseRate() - 0.25;
    }

    private void setSafetyDepositBoxID(){
        safetyDepositBoxID = ThreadLocalRandom.current().nextInt(100, 1000);//Another method to generate random number
        safetyDepositBoxKey = ThreadLocalRandom.current().nextInt(1000, 10000);
    }

    //List of methods specific to saving account

    public void showInfo(){
        super.showInfo(); //This will call the showInfo method of the superclass
        System.out.println("Your Savings Account Features: " +
                "\n  Safety Deposit Box ID: " + safetyDepositBoxID +
                "\n  Safety Deposit Box Key: " + safetyDepositBoxKey);
    }
}
