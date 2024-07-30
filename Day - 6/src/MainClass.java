public class MainClass {
    private String name;
    private int CreditLimit;
    private String emailAddress;

//    Constructor 1

    public MainClass(){
        this("Vishnu","vishnu@gmail.com");
    }

    public MainClass(String name , String email){
        this(name,790,email);
    }

    public MainClass(String name , int cl , String email){
        System.out.println("Your details are");
        this.name = name;
        CreditLimit = cl;
        emailAddress = email;
    }


    public String getName(){
        return name;
    }

    public int getCreditLimit() {
        return CreditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
