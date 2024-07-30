public class Employee extends Worker{
    private long employeeId;
    private String hireDate;
    private static int employeIdCalc = 1;
    public Employee(String name , String birthDay , String hireDate)
    {
        super(name , birthDay);
        this.employeeId = Employee.employeIdCalc++;
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", hireDate='" + hireDate + '\'' +
                "} " + super.toString();
    }
}
