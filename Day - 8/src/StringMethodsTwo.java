public class StringMethodsTwo {
    public static void main(String[] args) {

        String date = "22/02/".concat("23");
        System.out.println(date.substring(date.lastIndexOf("2")));

        String newDate = String.join("/","26","06","2003");
        System.out.println(newDate);
        System.out.println();
        System.out.println(newDate.replace("/","-"));
        System.out.println(newDate.replace("2","-"));
        System.out.println(newDate.replaceFirst("/","-"));
        System.out.println(newDate.replaceAll("/","-"));
        System.out.println();
        System.out.println("ABC\n".repeat(3));
        System.out.println("-".repeat(20));

        System.out.println("ABC\n".repeat(3).indent(5));
        System.out.println("-".repeat(20));
        System.out.println("    ABC\n".repeat(3).indent(-2));
    }
}

