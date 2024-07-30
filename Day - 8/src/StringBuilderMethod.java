public class StringBuilderMethod {
    public static void main(String[] args) {
        StringBuilder s2 = new StringBuilder("Hello World");
        System.out.println(s2.length());

        StringBuilder s3 = new StringBuilder();
        s3.append("a".repeat(12));
        System.out.println(s3);
        System.out.println(s3.length() + " " + s3.capacity());

        StringBuilder s4 = new StringBuilder();
        s4.append("Hello World and GoodBye");
        System.out.println(s4.indexOf("G"));

        s4.deleteCharAt(16).insert(16,"g");
        System.out.println(s4);


        s4.replace(16,s4.length(),"Welcome");
        System.out.println(s4);


        s4.insert(16,2);
        System.out.println(s4);

        System.out.println(s4.delete(0,s4.indexOf("W")));


        StringBuilder s5 = new StringBuilder("Hello my G Welocme");

        s5.reverse().setLength(s5.indexOf("W")+1);
        s5.setCharAt(s5.indexOf("W"),'w');
        System.out.println(s5);

    }
}

//O/p
//11
//aaaaaaaaaaaa
//12 16 length and capacity because capacity never overridden until we change it;
//16 default
//Hello World and goodBye
//Hello World and Welcome
//Hello World and 2Welcome
//World and 2Welcome
//emcolew