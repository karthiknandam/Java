import java.util.*;

public class ArrayList_Challenge {
    private static Scanner sc = new Scanner(System.in);

    public static <ArraysList> void main(String[] args) {

        ArrayList<String> groceries = new ArrayList<>();
        boolean isTrue = true;
        while(isTrue){
            printValue();
            switch (Integer.parseInt(sc.nextLine())){

                case 1 -> {
                    addIng(groceries);
                }
                case 2 -> {
                    removeItem(groceries);
                }
                default ->{
                    isTrue = false;
                }
            }

        }

    }
    public static void printValue(){
         String getValue = """
                0 -> End ;
                1 -> add Items by the help of ",";
                2 -> Remove Items ;
                Enter the value :""";
        System.out.print(getValue+" " );
    }

    public static void addIng(ArrayList<String> groceries ){
        System.out.println("ADD items to basket");
        String[] values = sc.nextLine().split(",");
        for(String e : values){
            String trimmed = e.trim();
            if(!groceries.contains(trimmed)){
                groceries.add(trimmed);
            }
        }
        groceries.sort(Comparator.naturalOrder());
        System.out.println(groceries);
    }
    public static void removeItem(ArrayList<String> groceries){
        System.out.println("Remove items from basket");
        String[] value = sc.nextLine().split(",");
        for(String e : value){
            String trimmed = e.trim();
            groceries.remove(e);
        }
        groceries.sort(Comparator.naturalOrder());
        System.out.println(groceries);
    }

}
