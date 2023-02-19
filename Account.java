import java.util.Scanner;

public abstract class Account {
   private int accnum;
   private double balance;
   private String date;
   private Customer customer;
   protected SavingsAccount saving;
   protected CheckingAccount checking;

   //parameterized constructor
   public Account(int accnum,double balance,String date, Customer customer){
        this.accnum=accnum;
        this.balance=balance;
        this.date=date;
        this.customer=customer;
        this.checking = null;
        this.saving = null;
   }
   
   //getters
   public int getaccnum(){
    return accnum;
   }
   
   public double getbalance(){
    return balance;
   }

   public String getdate(){
    return date;
   }
   
   public Customer getcustomer(){
    return customer;
   }

   //setter
   public void setBalance(double newbalance){
    this.balance  = newbalance;
   }

   
   public abstract void checkBalance(int accnum);
   public abstract void printStatement(double amount);
   public abstract void makeDeposit(double amount);
   public abstract void makeWithdrawl(double temp);
   //public abstract void displayAllDeductions();
}


public class SavingsAccount extends Account{
    private double interest = 0.01; //default interest

    //super constructor
    public SavingsAccount(int accnum,int balance,String date, Customer customer){
        super(accnum, balance, date, customer);
    }

  
    public void calculateInterest(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Interest Rate: ");
        interest = input.nextDouble();
    }
    public void checkBalance(int accnum){
        if(this.getaccnum() == accnum){
            System.out.println("Name: " + this.getcustomer().getName());
            System.out.println("Balance: " + this.getbalance());
        }
    }
    public void printStatement(int amount){
        System.out.println("Name: " + this.getcustomer().getName());
        System.out.println("Account NUmber: " + this.getaccnum());
        System.out.println("Phone Number: " + this.getcustomer().getPhoneNumber());
        System.out.println("Transaction Amount: " + amount);
        System.out.println("Remaining Balance: " + this.getbalance());
    }
    public void makeDeposit(int amount){
        this.setBalance(amount + getbalance());
    }
    public void makeWithdrawl(double amount){
        this.setBalance(getbalance() - amount);
    }
    public void calculateZakat(){ //funtion to calulate zakat
        if(getbalance() >= 20000){
            double temp = getbalance() * 0.025;
            System.out.println("Zakat = " + temp);
            this.saving.makeWithdrawl(temp);
        }
    }


}
public class CheckingAccount extends Account{
    private int transactionsnum = 0;
    
    public CheckingAccount(int accnum, double balance,string date, Customer customer){
        super(accnum, balance, date, customer);
    }

    public void checkBalance(int accnum){
        if(this.getaccnum() == accnum){
            System.out.println("Name: " + this.getcustomer().getName());
            System.out.println("Balance: " + this.getbalance());
        }
    }
    public void printStatement(int amount){
        System.out.println("Name: " + this.getcustomer().getName());
        System.out.println("Account NUmber: " + this.getaccnum());
        System.out.println("Phone Number: " + this.getcustomer().getPhoneNumber());
        System.out.println("Transaction Amount: " + amount);
        System.out.println("Remaining Balance: " + this.getbalance());
    }
    public void makeDeposit(double amount){
        if(transactionsnum <= 2){
            this.setBalance(amount + getbalance());
            
        }
        else{
            this.setBalance((amount - 10) + getbalance());
        }
        transactionsnum++;
        
    }
    public void makeWithdrawal( double amount){
        if(amount < getbalance() + 5000){
            if(transactionsnum >= 2){
                setBalance(getbalance() - (amount + 10));
            }
            else{
                setBalance(getbalance() - amount);
            }
            transactionsnum++;
        }
        else{
            System.out.println("Insufficient balance");
        }
    }

}