public class BankAccHolderInfo {
    public static void main(String[] args) {
        BankAccounts details = new BankAccounts();

        details.setCustomerName("Karthik");
        details.setPhoneNumber(123456789);
        details.setAccountBalance(2000);
        details.setAccountNumber(422222343);
        details.setCustomerEmail("karthik@gmail.com");

        System.out.println("Your Account details are "+"\n Full Name : "+details.getCustomerName() + "\n Acc Num : "+ details.getAccountNumber() + "\n Acc Bal : "+ details.getAccountBalance() +
                "\n EmailId : " + details.getCustomerEmail() + "\n Phn Num : " + details.getPhoneNumber() );


        details.depositingFunds(25);
        details.withdrawFunds(450);
        details.withdrawFunds(2000);

        System.out.println();
        BankAccounts rita = new BankAccounts("Rita Chowdary","rita@gmail.com");
        System.out.println("Your Account details are "+"\n Full Name : "+rita.getCustomerName() + "\n Acc Num : "+ rita.getAccountNumber() + "\n Acc Bal : "+ rita.getAccountBalance() +
                "\n EmailId : " + rita.getCustomerEmail() + "\n Phn Num : " + rita.getPhoneNumber() );
        rita.depositingFunds(200);
        System.out.println();

        BankAccounts Nandu = new BankAccounts(8233388 , 300 ,"Nandu","Nandu@email.com",8894543);
        System.out.println("Your Account details are "+"\n Full Name : "+Nandu.getCustomerName() + "\n Acc Num : "+ Nandu.getAccountNumber() + "\n Acc Bal : "+ Nandu.getAccountBalance() +
                "\n EmailId : " + Nandu.getCustomerEmail() + "\n Phn Num : " + Nandu.getPhoneNumber() );

        Nandu.depositingFunds(55);
        Nandu.withdrawFunds(500);
//        System.out.println(details.getAccountBalance());
    }
}
