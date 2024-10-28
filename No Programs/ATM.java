import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int balance = 10000, deposit, withdraw;

        while (true) {
            System.out.println("\nATM Menu:");
            System.out.println("Enter 1 to check your balance");
            System.out.println("Enter 2 to deposit money");
            System.out.println("Enter 3 to withdraw money");
            System.out.println("Enter 4 to Exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Your balance is: " + balance);
                    break;

                case 2:
                    System.out.println("Enter the amount you want to deposit:");
                    deposit = sc.nextInt();
                    balance += deposit;
                    System.out.println("Deposit successful. New balance is: " + balance);
                    break;

                case 3:
                    System.out.println("Enter the amount you want to withdraw:");
                    withdraw = sc.nextInt();
                    if (balance >= withdraw) {
                        balance -= withdraw;
                        System.out.println("Withdrawal successful. New balance is: " + balance);
                    } else {
                        System.out.println("Insufficient balance. Current balance is: " + balance);
                    }
                    break;

                case 4:
                    System.out.println("Exiting... Thank you for using the ATM!");
                    sc.close(); // Close the scanner to avoid resource leaks
                    break;

                default:
                    System.out.println("Invalid choice! Please select a valid option.");
                    break;
            }

            if (choice == 4) {
                break; // Exit the while loop if the user chose to exit
            }
        }
    }
}
