package emailApp;

import java.util.Random;
import java.util.Scanner;

public class Email {

    private String firstName;
    private String lastName;
    private String department;
    private String password;
    private int defaultPassword = 8;
    private String email;
    private String companySuffix = "company.com";
    private String alternateEmail;
    private int mailboxCapacity = 500;

    // Constructors to receive first and last name

    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;


        //Call a method asking for the department - return the department.
        this.department = setDepartment();


        //Call a method that returns a random password
        this.password = String.valueOf(randomPassword(defaultPassword));


        //Combine elements to create email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department.toLowerCase() + "." + companySuffix;

    }


    // Ask the department

    private String setDepartment() {
        System.out.print("Department codes\n1. Sales\n2. Development\n3. Accounting\n4. For none\nEnter department code: ");
        Scanner sc = new Scanner(System.in);
        int departChoice = sc.nextInt();
        if(departChoice == 1){
            return "Sales";
        }
        else if(departChoice == 2){
            return "Development";
        }
        else if(departChoice == 3){
            return "Accounting";
        }
        else
            return "";
    }

    // Generate a random password

   private char[] randomPassword(int defaultPassword){
        String capitalChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String smallChars = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String symbols = "!@#$%^&*()<>/";

        String values = capitalChars + smallChars + numbers + symbols;

       Random random_method = new Random();
       char[] password = new char[defaultPassword];
       for(int i=0; i<password.length; i++){
           password[i] = values.charAt(random_method.nextInt(values.length()));
       }
       return password;
   }

    // Set the mailbox Capacity

    public void setMailboxCapacity(int capacity){
        this.mailboxCapacity = capacity;
    }

    // Set the alternate email
    public void setAlternateEmail(String altEmail){
        this.alternateEmail = altEmail;
    }

    // change the password
    public void changepassword(String chPassword){
        this.password = chPassword;
    }

    public int getMailboxCapacity(){
        return mailboxCapacity;
    }
    public String getAlternateEmail(){
        return alternateEmail;
    }
    public String getPassword(){
        return password;
    }

    public String showInfo(){
        return  "Display Name: " + firstName + " " + lastName + " " +
                "\nCompany Email: " + email + " " +
                "\nTemporary Password: " + password + " " +
                "\nAlternative Email: " + "Not set" + " " +
                "\nMailBox Capacity: " + mailboxCapacity + "mb";

    }
}
