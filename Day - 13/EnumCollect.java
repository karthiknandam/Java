import java.util.Random;

public class EnumCollect {

    public static void main(String[] args) {

        for(int i = 0 ; i<10 ; i++){
            DaysOfWeeks x = getVal();
            System.out.println(x.name() +" "+ x.ordinal());
        }

    }
    public static DaysOfWeeks getVal(){
        int rand = new Random().nextInt(7);
        var allDays = DaysOfWeeks.values();
        return allDays[rand];
    }
}
enum DaysOfWeeks {
    SUN,MON,TUE,WED,THU,FRI,SAT
}