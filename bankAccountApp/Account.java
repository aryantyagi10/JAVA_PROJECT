package bankAccountApp;

public abstract class Account implements IBaseRate {
    //List common properties for savings and checking accounts
    private String name;
    private String sSN;
    private double balance;
    private static int index = 10000;
    protected String accountNumber;
    protected double rate;


    //Constructor to set base properties and initialize the account
    public Account(String name, String sSN, double initialDeposit){
        this.name = name;
        this.sSN = sSN;
        balance = initialDeposit;

        // Set Account Number
        index++;
        this.accountNumber = setAccountNum();

        //Calling BaseRate Method, It will call for both checking and saving
        setRate();
    }

    public abstract void setRate();

    private String setAccountNum(){
        String lastTwoOfsSN = sSN.substring(sSN.length()-2, sSN.length());
        int uniqueID = index;
        int randomNumber = (int)(Math.random()*Math.pow(10, 3));//random() method returns a pseudorandom double type number greater than or equal to 0.0 and less than 1.0. Example-0.3456*1000 = 345
        String formattedNumber = String.format("%03d", randomNumber);
        return lastTwoOfsSN + uniqueID + formattedNumber;
    }


    //List common methods - transactions

    public void deposit(double amount){
        balance = balance + amount;
        System.out.println("Depositing Rs. " + amount);
        printBalance();
    }

    public void withdraw(double amount){
        balance = balance - amount;
        System.out.println("Withdrawing Rs. " + amount);
        printBalance();
    }

    public void transfer(String toWhere, double amount){
        balance = balance - amount;
        System.out.println("Transferring Rs. " + amount + " to " + toWhere);
        printBalance();
    }

    public void printBalance(){
        System.out.println(" Your Balance is now: Rs. " + balance);
    }


    public void showInfo(){
        System.out.println("Name: " + name +
                "\nAccount Number: " + accountNumber +
                "\nBalance: Rs." + balance +
                "\nRate: " + rate + "%");
    }

}

