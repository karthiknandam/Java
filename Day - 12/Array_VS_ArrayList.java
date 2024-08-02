import java.util.*;

public class Array_VS_ArrayList {
    public static void main(String[] args) {
//        String[] one = {"a","b","c","d"};
//        System.out.println(Arrays.toString(one));
//        List<String> second = List.of(one);
//        System.out.println("-".repeat(20).indent(20));
//        ArrayList<String> third = new ArrayList<>(List.of(one));
//        third.addAll(second);
//        third.set(1,"Karthik");
//        System.out.println(second);
//        System.out.println(third);
//
//
////        ArrayList Methods
//
//        third.addAll(Arrays.asList("List","AS","Form"));
//        third.addAll(List.of("k","d","Tech","Tech","k"));
//        System.out.println(third);
//
//        third.remove(1);
//        System.out.println(third);
//        third.remove("k");
//
//        System.out.println(third);
//
//        third.removeAll(List.of("d","Tech"));
//
//        System.out.println(third);
//
////        third.retainAll(Arrays.asList("e","a"));
////        System.out.println(third);
//
//        third.sort(Comparator.naturalOrder());
//        System.out.println(third);
//
//        third.sort(Comparator.reverseOrder());
//        System.out.println(third);
//
//        ArrayList<Object> in = new ArrayList<>(Arrays.asList(1,2,3,4,"Karthik","Mine"));
//
//
//        System.out.println(in);
//
//        var toVar = third.toArray(new Object[third.size()]);
//        System.out.println(Arrays.toString(toVar));

        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        String[]  x = n.split(",");
        System.out.println(Arrays.toString(x));
    }
}
