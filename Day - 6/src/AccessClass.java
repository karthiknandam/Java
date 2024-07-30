public class AccessClass {
    public static void main(String[] args) {
//        Main Constructor

        MainClass FirstOne = new MainClass("Karthik",800,"karthik@gmail.com");
        System.out.println("Name : "+ FirstOne.getName() +
                "\nCredit Limit : "+FirstOne.getCreditLimit() +
                "\nEmail : "+ FirstOne.getEmailAddress());
        System.out.println();

//        Default one access from main Constructor;

        MainClass SecondOne = new MainClass();
        System.out.println("Name : "+ SecondOne.getName() +
                "\nCredit Limit : "+SecondOne.getCreditLimit() +
                "\nEmail : "+ SecondOne.getEmailAddress());
        System.out.println();

//        Assigned only 2 arguments remaining getting from main constructor

        MainClass ThirdOne = new MainClass("Rita Chowdary","ritac@gmail.com");
        System.out.println("Name : "+ ThirdOne.getName() +
                "\nCredit Limit : "+ThirdOne.getCreditLimit() +
                "\nEmail : "+ ThirdOne.getEmailAddress());


    }
}

//OUTPUT :-
//Your details are
//Name : Karthik
//Credit Limit : 800
//Email : karthik@gmail.com
//
//Your details are
//Name : Vishnu
//Credit Limit : 790
//Email : vishnu@gmail.com
//
//Your details are
//Name : Rita Chowdary
//Credit Limit : 790
//Email : ritac@gmail.com
