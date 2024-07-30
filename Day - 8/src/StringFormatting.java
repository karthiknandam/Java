public class StringFormatting {
    public static void main(String[] args) {
//        int age = 30;
//        System.out.printf("Your age is = %d%n",age);

        for(int i = 1; i<=10000 ; i*=10){
            System.out.printf("i = %6d%n" , i);
        }
        int inputt = 36;
        System.out.printf("Input value is %.1f%n",(float)inputt);
        System.out.println("Input value is %d".formatted(inputt));
    }

}
