public class Main {
    public static void main(String[] args) {

//        Burger b1 = new Burger("Noraml",4.0);
//        b1.addToppings("AVOCADO","CHEESE","SAUSE");
//        b1.priceItem();

//        MealOrder m1 = new MealOrder("COKE","PRAWN","HAM");
//        m1.addToppings("CHEESE","AVOCADO","MAYO");
//        m1.setSize("LARGE");
//        m1.printItems();

//        DeluxBurger d1 = new DeluxBurger("deluxe",8.5);
//        d1.addTopings("AVOCADO","CHEESE","MONACO","PICKLES","MAYO");
        System.out.println();
        System.out.println("First Meal\n");
        MealOrder First = new MealOrder("COKE","CHICKEN","deluxe");
        First.addToppings("AVOCADO","CHEESE","MAYO","MUSTARD SAUCE","GARLIC SAUCE");
        First.printItems();

        System.out.println();
        System.out.println("Second Meal\n");
        MealOrder Second = new MealOrder("COKE","CHICKEN","normal");
        Second.addToppings("AVOCADO","CHEESE","MAYO","MUSTARD SAUCE","GARLIC SAUCE");
        Second.printItems();
    }
}