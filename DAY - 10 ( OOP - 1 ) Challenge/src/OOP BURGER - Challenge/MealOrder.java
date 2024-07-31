public class MealOrder {
    private Item drink;
    private Item side;
    private Burger burger;

    public MealOrder(){
        this("COKE","CHICKEN","SIMPLE");
    }
    public MealOrder(String drinkType , String sideType , String burgerType){
        if(burgerType.equalsIgnoreCase("deluxe") ) {
            this.burger = new DeluxBurger("Deluxe",8.5);
        }
        else{
            this.burger = new Burger(burgerType, 4.0);
        }
        this.drink = new Item("DRINK",drinkType, 3.0);
        this.side = new Item("SIDE",sideType, 2.0);
    }

    public void setSize(String size){
        drink.setSize(size);
    }

    public void addToppings(String extra1 ,String extra2, String extra3){
        burger.addToppings(extra1,extra2,extra3);
    }

    public void addToppings(String extra1 , String extra2 , String extra3 , String extra4 , String extra5){
        if(burger instanceof DeluxBurger db){
          db.addTopings(extra1,extra2,extra3,extra4,extra5);
        }
        else{
            burger.addToppings(extra1,extra2,extra3);
        }
    }
    public double getTotalPrice(){
        if( burger instanceof  DeluxBurger){
            return burger.getBasePrice();
        }
        else {
            return burger.getCalculatedPrice() + drink.getCalculatedPrice() + side.getCalculatedPrice();
        }
    }
    public void printItems(){
        burger.priceItem();
        if(burger instanceof  DeluxBurger){
            Item.priceItem(drink.getName() , 0);
            Item.priceItem(side.getName(),0);
        }
        else {
            drink.priceItem();
            side.priceItem();
        }
        System.out.println("_".repeat(30));

        Item.priceItem("Total",getTotalPrice());
    }

}
