import java.util.ArrayList;
import java.util.List;
import java.util.random;

public class BankingSystem {
    private List<Customer> customers;
    private List<Account> accounts;
    
    public BankingSystem() {
        customers = new ArrayList<>();
        accounts = new ArrayList<>();
    }
    
    public void addCustomer(Customer customer) {
        customers.add(customer);
    }
    
    public void addAccount(Account account) {
        accounts.add(account);
    }
    
    public void transferAmount(Account source, Account target, int amount) {
        if (source.getBalance() >= amount) {
            source.setBalance(source.getBalance() - amount);
            target.(target.getBalance() + amount);
            System.out.println("Transfer of " + amount + " successful from Account " + source.getAccountNumber() +
                    " to Account " + target.getAccountNumber());
        } else {
            System.out.println("Transfer of " + amount + " failed from Account " + source.getAccountNumber() +
                    " to Account " + target.getAccountNumber() + ": insufficient balance.");
        }
    }
    
    public void displayAllCustomers() {
        System.out.println("All Customers:");
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }
    
    public void displayAllAccounts() {
        System.out.println("All Accounts:");
        for (Account account : accounts) {
            System.out.println(account);
        }
    }
    public int generateAccountNumber(){
        Random rand = new Random();
        int random = rand.nextInt();
        return random;
    }
}