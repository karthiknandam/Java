public class Product {
    private String model;
    private String manufacture;

    public Product(String model ,String manufacture){
        this.model = model;
        this.manufacture = manufacture;
    }
}

class Moniter extends Product{
    private String dimension;
    private int size;
    public Moniter(String model , String manufacture , String dimension , int size){
        super(model , manufacture);
        this.dimension = dimension;
        this.size = size;
    }
    public void drawPixel(int x , int y , String color){
        System.out.println(String.format("Draw log of %d , %d and of color = %s",x,y,color));
    }
}

class MotherBoard extends Product{
    private String bios;
    private int ramSlots;
    private int cardSlots;


    public MotherBoard(String model , String manufacture , String bios , int ramSlots , int cardSlots){
        super(model , manufacture);
        this.bios = bios;
        this.cardSlots = cardSlots;
        this.ramSlots = ramSlots;
    }

    public void loadProgram(String programName){
        System.out.println(programName + " Program is loading....");
    }
}

class ComputerCase extends Product{
    private String powerSupply;
    public ComputerCase(String model , String manufacture , String powerSupply )
    {
        super(model , manufacture);
        this.powerSupply = powerSupply;
    }

    public void pressPowerButton(){
        System.out.println("power button Pressed");
    }
}
