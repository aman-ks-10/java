import java.util.Scanner;

class Customer {
    String name;
    int age;
    String contactDetails;
    String emailAddress;
    String residenceAddress;
    String accountNumber;

    public Customer(String name, int age, String contactDetails, String emailAddress, String residenceAddress, String accountNumber) {
        this.name = name;
        this.age = age;
        this.contactDetails = contactDetails;
        this.emailAddress = emailAddress;
        this.residenceAddress = residenceAddress;
        this.accountNumber = accountNumber;
    }

    public void displayInfo() {
        System.out.println("Customer Information:");
        System.out.printf("Name: %s%nAge: %d%nContact Details: %s%nEmail Address: %s%nResidence Address: %s%nAccount Number: %s%n",
                name, age, contactDetails, emailAddress, residenceAddress, accountNumber);
    }
}

public class SimpleBankingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long accountNumberCounter = 0;
        String response;

        do {
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();

            System.out.print("Enter your age: ");
            int age = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter your contact details: ");
            String contactDetails = scanner.nextLine();

            System.out.print("Enter your email address: ");
            String emailAddress = scanner.nextLine();

            System.out.print("Enter your residence address: ");
            String residenceAddress = scanner.nextLine();

            //Create a new customer
            Customer customer = new Customer(name, age, contactDetails, emailAddress, residenceAddress, String.valueOf(accountNumberCounter++));

            System.out.println("Customer entry successful.. \n\n");
            try {
                Thread.sleep(5000); //Wait for 5 second
            } catch (InterruptedException e) {
                System.out.println("Error occured while waiting.");
            }
            customer.displayInfo();
            System.out.println("\nThank you for registering");
            System.out.println("Your account created successfully.\n");

            //chose to  create a account or not!
            System.out.print("Do you want to add another customer? (yes/no): ");
            response = scanner.nextLine();
        } while (response.equalsIgnoreCase("yes"));

        System.out.println("Thank you for using the Simple Banking System!");
        scanner.close();
    }
}