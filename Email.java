package emailapp;
import java.util.Scanner;

public class Email {

    final static int DEFAULT_MAILBOX_CAPACITY = 20;
    /** Generate variable for email **/
    private String firstName;
    private String lastName;
    private String department;
    private String password;
    private String email;
    private int mailBoxCapacity;
    private String companySuffix = ".fluxcompany.com";

    /** Constructors **/
    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = getDepartment();
        this.password = generatePassword(8);
        mailBoxCapacity = DEFAULT_MAILBOX_CAPACITY;
        this.email = this.firstName.toLowerCase()  + "." + this.lastName.toLowerCase() + "@"
                + this.department + companySuffix;
    }

    /** Prompt department **/
    private String getDepartment(){
        System.out.println(this.firstName + ", " + this.lastName + "\nEnter the number according to your apartment:" +
                "\n1. Sales\n2. Development\n3. Accounting\n");
        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();
        if(choice == 1){ return "sales";}
        else if(choice == 2){return "dev";}
        else if(choice == 3){return "acc";}
        else{return "";}
    }

    /** Generate random string password **/
    private String generatePassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890#$&*"; //40
        char[] password = new char[length];
        for(int i = 0; i < length; i++){
            int randomNumber = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(randomNumber);
        }

        return new String(password);
    }

    /** Set the mailbox capacity **/
    public void setMailBoxCapacity(int num){
        this.mailBoxCapacity = num;
    }

    /** Display the info of the email **/
    public void printedInfo(){
        System.out.println("Name: " + this.firstName + " " + this.lastName);
        System.out.println("Email: " + this.email);
        System.out.println("Password: " + this.password);
        System.out.println("Mailbox Capacity: " + this.mailBoxCapacity);
    }

    /** Getter and Setter methods **/
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getMailBoxCapacity() {
        return mailBoxCapacity;
    }
}
