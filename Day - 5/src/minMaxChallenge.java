import java.util.Scanner;
public class minMaxChallenge {
    public static void main(String[] args) {
// Min Max output from User Input
        double min = 0;
        double max = 0;
        int increment = 0;
        System.out.println("Enter the Number to know it is Min or Max to my number ");
        while (true){
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the Number or press any key to exit");
            try{
                String userIn = scan.nextLine();
                double userInConv = Double.parseDouble(userIn);
                if( increment == 0 || userInConv < min ){
                    min = userInConv;
                }
                if(increment == 0 || userInConv > max){
                    max = userInConv;
                }
                increment++;
            }catch (NumberFormatException Error){
                break;
            }
        }
        if(increment > 0){
            System.out.println("Min " + min + " Max " + max);
        }
        else {
            System.out.println("Invalid");
        }
    }
}
