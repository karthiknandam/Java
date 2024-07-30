public class BankAccounts {
    private int accountNumber;
    private  int accountBalance;
    private  String customerName;
    private String customerEmail;
    private  int phoneNumber;

//    constructors
    public BankAccounts(){
//        Default setting accessing line 15 - chaining;
        this(9876543 , 5000 ,"Nan","Nan@email.com",234543);
        System.out.println("Account Called");
    }

    public BankAccounts(int accountNumber , int accountBalance , String name , String email , int number){
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        customerName = name;
        customerEmail = email;
        phoneNumber = number;
    }
    public BankAccounts(String name , String email){
        this(88887 , 2000 ,name,email,5433);
    }
    //    Two Methods

    public void depositingFunds(int val){
        this.accountBalance+=val;
        System.out.println("Deposited " + val + " to your account and Total balance is "+ this.accountBalance);
    }
    public void withdrawFunds(int val){
        if(val <= 0 || val>this.accountBalance){
            System.out.println("Withdrawal can't take place");
        }
        else {
            this.accountBalance -= val;
            System.out.println("Withdrawal takes place of amount " + val + " Total balance is " + this.accountBalance);
        }
    }



    public int getAccountNumber() {
        return accountNumber;
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }
//    Setters


    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}
