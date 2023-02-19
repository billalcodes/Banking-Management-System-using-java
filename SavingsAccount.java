import Account;
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
            this.saving.makeWithdrawal(temp);
        }
    }


}