public class HourlyEmployee extends  Employee{
    private double hourlyPayRate;

    public HourlyEmployee(String name , String birthDay , String hireDate , double pay){
        super(name, birthDay,  hireDate);
        this.hourlyPayRate = pay;
    }

    public void getDoublePay(){
        hourlyPayRate*=2;
    }


    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "hourlyPayRate=" + hourlyPayRate +
                "} " + super.toString() ;
    }
}
