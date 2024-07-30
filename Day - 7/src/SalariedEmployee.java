public class SalariedEmployee extends Employee{
    private double annualSalary;
    private boolean isRetailed;

    public SalariedEmployee(String name, String birthDay, String hireDate, double annualSalary) {
        super(name, birthDay,  hireDate);
        this.annualSalary = annualSalary;
    }

    @Override
    public double collectPay() {
        double annualWithoutRetire = (int) annualSalary/26;
        double annualWithRetire = (int) (annualWithoutRetire *0.9);

        return  isRetailed?  annualWithRetire : annualWithoutRetire;
    }

    public void retire() {

        terminate("12/12/2025");
        isRetailed = true;
    }

}
