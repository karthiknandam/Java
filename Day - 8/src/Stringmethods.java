public class Stringmethods {
    public static void main(String[] args) {
        stringCheck("Hello World");
//        stringCheck("\t \n");

        String n = "Hello World";
        String nLower = n.toLowerCase();

        System.out.println("Content is " + n.contentEquals("Hello World")); ;//Returns true;
        System.out.println("Content is " + nLower.equals(n)); ;//Returns false;
        System.out.println("Content is "+ n.equalsIgnoreCase(nLower)); ;//Returns true;

        System.out.println("Contains "+ n.contains("Hello"));


    }
    public static void stringCheck(String val){
        System.out.printf("value : %d %n",val.length());
        System.out.printf("value index of h : %d %n",val.indexOf('h'));
        System.out.printf("Last index of : %d %n",val.lastIndexOf("d"));
        System.out.println(val.startsWith("Hello"));
        System.out.println(val.endsWith("d"));
        System.out.println(val.isEmpty());
        System.out.println(val.isBlank());
        System.out.printf("Char at : %c %n", val.charAt(val.length()-2));

    }
}
//O/p
//value : 11
//value index of h : -1
//Last index of : 10
//        true
//        true
//        false
//        false
//Char at : l
//Content is true
//Content is false
//Content is true
//Contains true