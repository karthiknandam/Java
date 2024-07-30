public class Dog extends Animal{
    private String isTail;
    private String isEars;

    public Dog(){
        super("Strey Dog","small",25.3);

    }
    public Dog(double weight , String type){
        this("Large","Big sharp",weight,type);
    }

    public Dog(String isTails , String isEars , double weight , String type){
        super(type , weight > 50 ? "large":"Small",weight );
        this.isEars = isEars;
        this.isTail = isTails;
    }

    public void isMove() {
        System.out.println("This is Dog Sec");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "isTail='" + isTail + '\'' +
                ", isEars='" + isEars + '\'' +
                "} " + super.toString();
    }
}
