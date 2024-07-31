public class Item {
    private String name;
    private String type;
    private double price;
    private String size = "MEDIUM";

    public Item(String type , String name , double price){
        this.type = type ;
        this.name = name ;
        this.price = price;
    }

    public double getBasePrice(){
        return price;
    }
    public String getName(){
        if(type == "DRINK")return size + " "+ name ;
        else {
            return name;
        }
    }
    public double getCalculatedPrice(){
        return switch (size){
            case "SMALL" -> getBasePrice()+1;
            case "LARGE" -> getBasePrice()+2;
            default -> getBasePrice();
        };
    }
    public void setSize(String size){
        this.size = size.toUpperCase();
    }

    public static void priceItem(String name , double price){
        System.out.printf("%20s:%6.2f%n",name,price);
    }
    public void priceItem(){
        priceItem(getName(),getCalculatedPrice());
    }
}
