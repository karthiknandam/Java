public class Animal {
    private String size;
    private String type;
    private double weight;

    public Animal(String type ,String size  , double weight){
        this.type = type;
        this.size = size;
        this.weight = weight;

    }
    public void isMove(){
        System.out.println("This is animal parent section");
    }

    public void move(String speed){
        System.out.println(type + " moves " + speed );
    }

    @Override
    public String toString() {
        return "Animal{" +
                "Type='" + type + '\'' +
                ", Size='" + size + '\'' +
                ", weight=" + weight +
                '}';
    }
}
