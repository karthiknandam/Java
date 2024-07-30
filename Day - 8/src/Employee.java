public class Employee extends Worker {
    private long employeeId;
    private String hireDate;
    private static int idNo = 1;

    public Employee(String name , String dob , String hireDate){
        super(name , dob);
        this.employeeId = Employee.idNo++;
        this.hireDate = hireDate;
    }
    @Override
    public String toString(){
        return "Employee [ Employee Id = "+employeeId  +" , Hire Date = " + hireDate + " ] " + super.toString();
    }


}
