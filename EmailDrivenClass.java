package emailapp;

public class EmailDrivenClass {

    public static void main(String[] args){
        Email e1 = new Email("Diep", "La");
        System.out.println("Your email is successfully created");
        e1.printedInfo();

        System.out.println();
        Email e2 = new Email("Mom", "Dad");
        System.out.println("Your email is successfully created");
        e2.printedInfo();

        e1.setMailBoxCapacity(50);
        System.out.println("\nYour mailbox capacity has changed!!");
        e1.printedInfo();

    }
}
