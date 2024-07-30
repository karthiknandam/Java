public class SalariedEmployee extends Employee{
    private double annualSalary;
    private boolean isRetire;

    public SalariedEmployee(String name , String dob , String hireDate , double annualSalary){
        super(name, dob,hireDate);
        this.annualSalary = annualSalary;
    }

    @Override
    public double collectPay() {
        double NormalSal = annualSalary/13;
        double RetireSal = NormalSal *0.9;
        return isRetire ? (int) RetireSal : (int) NormalSal;
    }

    public void retire(){
        isRetire = true;
        terminate("22/03/2025");
    }

    @Override
    public String toString() {
        return "SalariedEmployee [" +
                "annualSalary=" + annualSalary +
                " ] " + super.toString();
    }
}
