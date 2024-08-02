import java.util.ArrayList;

record GetType(String name , String type , int val){

}
public class ArrayLists {
    public static void main(String[] args) {

        System.out.println(new GetType("Karthik" , "kd",2));

        ArrayList<GetType> newArray = new ArrayList<>();
        newArray.add(new GetType("k","S",2));

        System.out.println(newArray);

    }

}
