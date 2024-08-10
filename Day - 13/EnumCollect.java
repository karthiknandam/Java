import java.util.Random;

public class EnumCollect {

    public static void main(String[] args) {

        for(int i = 0 ; i<10 ; i++){
           getDays(getVal());
        }
        double total = 0;
        for(DaysOfWeeks day : DaysOfWeeks.values()){

            total+= day.getPay();
            System.out.println(total);
        }

    }
    public static void getDays (DaysOfWeeks day){
        int val = day.ordinal()+1;

        switch (day){
            case SUN -> System.out.println(day.name().charAt(0)+day.name().substring(1).toLowerCase() + ":" + " Is holiday Pay is : " + (day.getPay()));
            case SAT -> System.out.println(day.name().charAt(0)+day.name().substring(1).toLowerCase() + ":" + " First holiday Pay is : " +(day.getPay()));
            default -> System.out.println("Week day no : "+ val +" "+ day.name() + " Pay is : " +(day.getPay()));
        }

    }
    public static DaysOfWeeks getVal(){
        int rand = new Random().nextInt(7);
        var allDays = DaysOfWeeks.values();
        return allDays[rand];
    }
}
enum DaysOfWeeks {
    SUN,MON,TUE,WED,THU,FRI,SAT;
    public double getPay(){
        return switch (this){
            case SUN , SAT -> 0;
            default -> 15.5;
        };
    }
}