public class DeluxBurger extends Burger {
    Item delux1;
    Item delux2;
    public DeluxBurger(String name , double price){
        super(name,price);
    }
    public void addTopings(String extra1 , String extra2 , String extra3 , String extra4 ,String extra5){
        super.addToppings(extra1 , extra2 ,extra3);
        this.delux1 = new Item("Toppping",extra4,0);
        this.delux2 = new Item("Topping",extra5,0);
    }

    @Override
    public void  priceItemizedLIst(){
        super.priceItemizedLIst();
        if(delux1 != null)delux1.priceItem();
        if(delux2 != null)delux2.priceItem();
    }

    @Override
    public double getExtraPrice(String toppings){
        return 0;
    }

}
