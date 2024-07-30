import java.util.Scanner;
public class Exception {
    public static void main(String[] args) {
        int currentYear = 2024;

        System.out.println("Hello Welcome to the age calculator please enter your name");

         Scanner scan = new Scanner(System.in);
         String name = scan.nextLine();
         System.out.println("Hi "+name+" Welcome to the game Please enter your birth Year");

         int age = 0;
         boolean yearCheck = false;
         do{
             try {
                 System.out.println("Birth Year should be >=" + (currentYear - 125) + " or < " + currentYear);
                 age = checkUserData(currentYear, scan.nextLine());
             }
             catch (NumberFormatException typeError){
                 System.out.println("ONLY numbers allowed please check once again..");
             }
             yearCheck = age < 0 ? false : true;

         }while(!yearCheck);
        System.out.println("So Your age is " + age);
    }
    public static int checkUserData(int currentYear , String birthYear){
        int dobCheck = currentYear - 125;
        int yearBirth = Integer.parseInt(birthYear);
        if((dobCheck > yearBirth) || (yearBirth > currentYear)){
            return -1;
        }
        return currentYear - yearBirth;
    }
}
