public class Car {
    private String description;

    public Car(String description){
        this.description = description;
    }

public void startEngine(){
    System.out.println("Car -> Engine is Starting%n");
}

public void drive(){
    System.out.printf("%s -> Driving starts%n",getClass().getSimpleName());
     runEngine();
}
protected void runEngine(){
    System.out.println("Running the Engine");
}
}

class GasPoweredCar extends Car{
    private double averageKmPerLitre;
    private int cylinders;
    public GasPoweredCar(double avg ,int cylinders){
        super("Gives an avg km range per km of "+avg+" and consists of "+cylinders+" Cylinders");
        this.cylinders = cylinders;
        this.averageKmPerLitre = avg;
    }

    @Override
    public void startEngine() {
        System.out.printf("Gas -> run at a avg of %.2f%n",averageKmPerLitre);
    }

    @Override
    protected void runEngine(){
        System.out.printf("Gas -> All %d Cylinders are fired up",cylinders);
    }

}

class ElectricCar extends  Car{
    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(String description,double avg , int batterySize){
        super(description);
        this.avgKmPerCharge = avg;
        this.batterySize = batterySize;
    }

    @Override
    public void startEngine() {
        System.out.printf("EV -> WIll give range of Avg %.2f%n",avgKmPerCharge);
    }
    @Override
    protected void runEngine()
    {
        System.out.printf("EV -> Running with battery capacity of %d",batterySize);
    }
}

class HybridCar extends Car {

    private double avgKmPerLiter;
    private int batterySIze;
    private int cylinders;

    public HybridCar(String description, double avg , int battery , int cylinders){
        super(description);
        this.avgKmPerLiter = avg;
        this.cylinders = cylinders;
        this.batterySIze = battery;
    }

    @Override
    public void startEngine() {
        System.out.printf("Hybrid -> will run at avg kms of %.2f",avgKmPerLiter);
    }

    @Override
    protected void runEngine() {
        System.out.printf("Hybrid -> All %d cylinders are fire up and ready to go with a bettery size of %d",cylinders,batterySIze);
    }
}