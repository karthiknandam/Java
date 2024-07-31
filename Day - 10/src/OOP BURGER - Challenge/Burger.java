public class Burger extends Item {
    private Item extra1;
    private Item extra2;
    private Item extra3;

    public Burger(String name , double price){
        super("Burger",name,price);
    }

    @Override
    public double getCalculatedPrice(){
        return  getBasePrice() + (extra1 == null ?0 : extra1.getBasePrice()) +
                (extra2 == null ? 0 : extra2.getBasePrice())+
                (extra3 == null ? 0 : extra3.getBasePrice());
    };

    public double getExtraPrice(String toppings){
        return switch (toppings){
            case "AVOCADO" , "CHEESE" -> 0.5;
            case "PICKLE" , "CHICKEN" -> 1;
            default -> 0;
        };
    }
    public void addToppings(String extra1, String extra2 , String extra3){
        this.extra1 = new Item("Toppings",extra1,getExtraPrice(extra1));
        this.extra2 = new Item("Toppings",extra2,getExtraPrice(extra2));
        this.extra3 = new Item("Toppings",extra3,getExtraPrice(extra3));
    }

    public void priceItemizedLIst(){
        priceItem("Base Burger",getBasePrice());

        if(extra1 != null) extra1.priceItem();
        if(extra2 != null) extra2.priceItem();
        if(extra3 != null) extra3.priceItem();

    }

    @Override
    public void priceItem(){
        priceItemizedLIst();
        System.out.println("-".repeat(30));
        priceItem("Burger Total",getCalculatedPrice());
    }

}
