

public class Admin {
    private BankingSystem bankingSystem;
    public Admin(BankingSystem bankingSystem) {
        this.bankingSystem = bankingSystem;
    }
    public void start() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("===== Welcome to Admin Console =====");
            System.out.println("1. Create Customer Account");
            System.out.println("2. Create Account for Existing Customer");
            System.out.println("3. View Customer Details");
            System.out.println("4. View Account Details");
            System.out.println("5. Delete Account");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    createCustomerAccount();
                    break;
                case 2:
                    //createAccountForExistingCustomer();
                    break;
                case 3:
                    //viewCustomerDetails();
                    break;
                case 4:
                    //viewAccountDetails();
                    break;
                case 5:
                    //deleteAccount();
                    break;
                case 6:
                    System.out.println("Exiting Admin Console...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid choice.");
            }
        } while (choice != 6);
    }
    private void createCustomerAccount() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===== Create Customer Account =====");
        System.out.print("Enter Customer Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Customer Phone Number: ");
        String phoneNumber = scanner.nextLine();

        Customer customer = new Customer(name, phoneNumber);

        System.out.print("Enter Account Type (Checking/Savings): ");
        String accountType = scanner.nextLine();

        if (accountType.equalsIgnoreCase("Checking")) {
            System.out.print("Enter Initial Deposit: ");
            int initialDeposit = scanner.nextInt();

            CheckingAccount checkingAccount = new CheckingAccount(bankingSystem.generateAccountNumber(), initialDeposit, bankingSystem.getCurrentDate(), customer);
            bankingSystem.addAccount(checkingAccount);
            System.out.println("Checking Account created successfully. Account Number: " + checkingAccount.getAccountNumber());
        } else if (accountType.equalsIgnoreCase("Savings")) {
            System.out.print("Enter Initial Deposit: ");
            int initialDeposit = scanner.nextInt();

            SavingsAccount savingsAccount = new SavingsAccount(bankingSystem.generateAccountNumber(), initialDeposit, bankingSystem.getCurrentDate(), customer);
            bankingSystem.addAccount(savingsAccount);
            System.out.println("Savings Account created successfully. Account Number: " + savingsAccount.getAccountNumber());
        } else {
            System.out.println("Invalid account type. Please enter a valid account type.");
        }
    }
}
