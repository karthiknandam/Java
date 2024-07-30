public class HourlyEmployee extends Employee {
    private double HourPay ;

    public HourlyEmployee(String name, String dob, String hireDate, double HourPay) {
        super(name, dob, hireDate);
        this.HourPay = HourPay;
    }

    @Override
    public double collectPay() {
        double NormalDays = HourPay*8;
        return (int) NormalDays;
    }
    public double getDoublePay(){
        return collectPay()*2;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "HourPay=" + HourPay +
                "} " + super.toString();
    }
}
