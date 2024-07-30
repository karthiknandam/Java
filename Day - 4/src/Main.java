public class Main {
    public static void main(String[] args) {
        System.out.println("value is " + value(133));
        System.out.println("value is " + value(-12));
    }
//    adding numbers for EX "125" -> 1+2+5 = 8 ;
    public static int value(int val){
        if(val<0){
            return -1;
        }
        int sum = 0;
        while(val > 9){
            sum += (val%10);
            val/=10;
        }
        sum+=val;
        return sum;
    }
}