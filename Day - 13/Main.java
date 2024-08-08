import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> cities = new LinkedList<String>
                (Arrays.asList("London", "Paris", "New York", "Tokyo", "Sydney"));

        for(int i= 1 ; i<cities.size(); i++){
            System.out.println("-> From the city of " + cities.get(i-1) + " to "       + cities.get(i));
        }

        getvalue(cities);

    }
    private static void getvalue(LinkedList<String> cities){
        System.out.println(cities.get(1));


        System.out.println(cities.getFirst());
        System.out.println(cities.getLast());

        System.out.println(cities.peek());
        System.out.println(cities.peekFirst() + " " + cities.peekLast());

        System.out.println(cities.element());
        System.out.println(cities.indexOf("Paris"));
    }


}



//-> From the city of London to Paris
//-> From the city of Paris to New York
//-> From the city of New York to Tokyo
//-> From the city of Tokyo to Sydney
//Paris
//London
//Sydney
//London
//London Sydney
//London
//1