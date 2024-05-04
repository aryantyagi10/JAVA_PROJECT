package bankAccountApp;

public class Checking extends Account{
    //List properties specific to checking account
    private long debitCardNumber;
    private int debitCardPIN;

    //Constructor to initialize checking account properties
    public Checking(String name, String sSN, double initialDeposit){
        super(name, sSN, initialDeposit);
        accountNumber = "2" + accountNumber;
        setDebitCard();
    }

    public void setRate(){
        rate = getBaseRate() * 0.15;
    }

    private void setDebitCard(){
        debitCardNumber = (long) (Math.random()*Math.pow(10, 12));
        debitCardPIN = (int) (Math.random()*Math.pow(10, 4));
    }

    //List of methods specific to checking account
    public void showInfo(){
        super.showInfo();
        System.out.println("Checking Account Features: " +
                "\n  Debit Card Number: " + debitCardNumber +
                "\n  Debit Card PIN: " + debitCardPIN);
    }
}
