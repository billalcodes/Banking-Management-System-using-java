import Account;
public class Customer {
    private String name;
    private String address;
    private String phone;
    private Account checking;
    private Account saving;

    // Parameterized contructor
    public Customer(String name, String address, String phonenumber){
        this.name = name;
        this.phone = phonenumber;
        this.address = address;
    }

    //setters
    public void setchecking(Account checking){
        this.checking = checking;
    }

    public void setsaving(Account saving){
        this.saving = saving;
    }

    // getters
    public String getname(){ 
        return name;
    }
    public String getaddress(){
        return address;
    }
    public String getphonenumber(){
        return phone;
    }

    public Account getsavingAccount(){
        return saving;
    }
    public Account getcheckingAccount(){
        return checking;
    }

    
}

