import java.util.Scanner;

public class CallPolyMorphism {
    public static void main(String[] args) {

//        PolyMorphism pixel = new Action("Star Wars");
//        PolyMorphism pixel2 = new Horror("The nun");
//        PolyMorphism pixel3 = new Funny("Dead pool");
//        pixel.theWatch();
//        System.out.println();
//        pixel2.theWatch();
//        System.out.println();
//        pixel3.theWatch();
//
//        PolyMorphism kk = PolyMorphism.getMovie();
//        kk.theWatch();

        Scanner s = new Scanner(System.in);

        while(true){
            System.out.print("Enter A for Action F for Funny and H for Horror and Q for quit : ");
            String type = s.nextLine();
            if("Qq".contains(type)){
                break;
            }
            System.out.print("Enter the Movie Name : ");
            String movieName = s.nextLine();
            PolyMorphism movie = PolyMorphism.getMovie(type,movieName);
            movie.theWatch();
        }
    }
}

//Enter A for Action F for Funny and H for Horror and Q for quit : h
//Enter the Movie Name : the Nun
//the Nun is an Horror Film
//... 🥶🥶🥶🥶Welcome🥶🥶🥶🥶
//... Take your Seat
//... Have a blast experience
//Enter A for Action F for Funny and H for Horror and Q for quit : F
//Enter the Movie Name : Deadpool
//Deadpool is an Funny Film
//... 😁😁😁Welcome😁😁😁
//... Take your Seat
//... Have a blast experience
//Enter A for Action F for Funny and H for Horror and Q for quit : q