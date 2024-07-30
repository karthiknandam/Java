// Reading % inputs from User and adding them while checking the type of their input invalid or not
import java.util.Scanner;
public class ExcceptionChallenge {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double sum = 0;
        int i = 1;
        System.out.println("Enter numbers only");
        do{
            try{
                System.out.println("Enter Number#" + i);
                String val = scan.nextLine();
                double sumVal = Double.parseDouble(val);
                i++;
                sum+=sumVal;

            }catch (NumberFormatException defend){
                System.out.println("Invalid Number Enter");
            }
        }while (i<=5);
        System.out.println(sum);
    }
}
