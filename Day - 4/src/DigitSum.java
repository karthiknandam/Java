public class DigitSum {
    public static void main(String[] args) {
        double k = sumDigits(125);
        int sum = 0;
        for (double i = k ; i>0 ; i/=10){
            double remainder = (int) i%10;
            sum+=remainder;
        }
        if(sum>0){
            System.out.println(sum);
        }
        else {
            System.out.println("Invalid Input");
        }
    }
    public static int sumDigits(int val){
        if(val>0){
            return  val;
        }
        return -1;
    }
}
