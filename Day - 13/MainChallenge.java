import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

record cites(String place , int distance){
    @Override
    public String toString(){
        return String.format("%s (%d)",place,distance);
    }
}
public class MainChallenge {
    public static void main(String[] args) {
        LinkedList<cites> citesLinkedList = new LinkedList<>();
        citesLinkedList.addFirst(new cites("Sydney",0));
        addCities(citesLinkedList,new cites("Adelaide"  ,1374));
        addCities(citesLinkedList,new cites("ALice Spring"  ,2771));
        addCities(citesLinkedList,new cites("Brisbane"  ,917));
        addCities(citesLinkedList,new cites("Darwin"  ,3972));
        addCities(citesLinkedList,new cites("Melbourne"  ,877));
        addCities(citesLinkedList,new cites("Perth"  ,3923));

        System.out.println(citesLinkedList);

        printValue();

        boolean go = true;
        boolean forward = true;

        ListIterator<cites> iterator = citesLinkedList.listIterator();
        Scanner sc = new Scanner(System.in);

        while (go){

            if(!iterator.hasPrevious()){
                System.out.println("Starting station is -> " + iterator.next());
                forward = true;
            }
            if(!iterator.hasNext()){
                System.out.println("Last station is -> " + iterator.previous());
                forward = false;
            }
            String value = sc.nextLine().toUpperCase().substring(0,1);
            switch (value){
                case "F" -> {
                    if(!forward){
                        forward = true;
                        if(iterator.hasNext()){
                            iterator.next();
                        }
                    }
                    System.out.println(iterator.next());
                }
                case "B" -> {
                    if(forward){
                        forward = false;
                        if(iterator.hasPrevious())
                        {
                            iterator.previous();
                        }
                    }
                    System.out.println(iterator.previous());
                }
                case "M" -> {
                    printValue();
                }
                case "L" -> {
                    System.out.println(citesLinkedList);
                }
                default -> {
                    go = false;
                }
            }
        }

    }
    private static void addCities(LinkedList<cites> list , cites c){

        for(var x : list){
            if(c.place().equalsIgnoreCase(x.place())) {
                return;
            }
        }
        int alocation = 0;
        for(var v : list){
            if(c.distance() < v.distance()){
                list.add(alocation,c);
                return;
            }
            alocation++;
        }

        list.add(c);

    }
    private static void printValue(){
        System.out.println("""
                (F) -> Forward
                (B) -> Backward
                (M) -> Menu
                (L) -> List
                (Q) -> Quit""");
    }
}
