public class CarCall {
    public static void main(String[] args) {

    var c1 = new ElectricCar("TATA punch",50.55,1000);
    details(c1);

    }
    public static void details(Car car){
        car.startEngine();
        car.drive();
    }
}

//EV -> WIll give range of Avg 50.55
//ElectricCar -> Driving starts
//EV -> Running with battery capacity of 1000