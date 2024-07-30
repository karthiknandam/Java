public class Fish extends Animal {
    private int fins ;
    private int wings;

    public Fish(String type,  double weight , int fins , int wings) {
        super(type, "small", weight);
        this.fins = fins;
        this.wings = wings;

    }

    @Override
    public void move(String speed) {
        super.move(speed);
        isFins();
        if(speed == "fast"){
            isWings();
        }
        System.out.println();
    }

    public void isFins(){
        System.out.println("Quicker");
    }
    public void isWings(){
        System.out.println("Moves Faster");
    }

    @Override
    public String toString() {
        return "Fish{" +
                "fins=" + fins +
                ", wings=" + wings +
                "} " + super.toString();
    }
}
