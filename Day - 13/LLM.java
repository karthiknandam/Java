import javax.lang.model.element.NestingKind;
import java.util.LinkedList;
import java.util.List;

public class LLM {
    public static void main(String[] args){
        var ne = new LinkedList<String>();
        addItems(ne);
        System.out.println(ne);
        removeItems(ne);
        System.out.println(ne);

    }
    public static void addItems(LinkedList<String> karthik){
        karthik.add("Name : Karthik Nandam");
        System.out.println(karthik);
//       Ques
        karthik.offer("Age : 21");
        System.out.println(karthik);
        karthik.offerFirst("Identity : male ");
        System.out.println(karthik);
        karthik.offerLast("Fav color is black");
//        Stacks;
        System.out.println(karthik);

        karthik.push("Yo boi Welcome to the amazing coding journey");
        System.out.println(karthik);
        karthik.add("MDM");
        System.out.println(karthik);

    }
    private static void removeItems(LinkedList<String> karthik){
        karthik.addAll(List.of("Kart","Nan","Vish","Mom"));
        System.out.println(karthik);
        karthik.remove();
        System.out.println(karthik);
        karthik.removeFirst();
        System.out.println(karthik);
        karthik.removeLast();
        System.out.println(karthik);
        karthik.pop();
        System.out.println(karthik);

    }

}
