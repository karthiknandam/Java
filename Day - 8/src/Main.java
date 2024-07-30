//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Karthik","22/03/2003","02/03/2022");
        System.out.println(e1);
        System.out.println(e1.getAge());

        SalariedEmployee s1 = new SalariedEmployee("Nan","02/04/2000","01/1/2021",50000);
        System.out.println(s1);
        System.out.println("In hand Salary per month = $"+s1.collectPay() + " his age is " + s1.getAge()) ;
        s1.retire();
        System.out.println("retire amount is = $"+s1.collectPay());

        HourlyEmployee h1 = new HourlyEmployee("Rita","02/12/2002","11/11/2019",15.5);
        System.out.println(h1);

        System.out.println("Normal working day amount is = $"+h1.collectPay());
        System.out.println("Double pay amount is = $"+h1.getDoublePay());

    }
}

//o/p

//Employee [ Employee Id = 1 , Hire Date = 02/03/2022 ] Worker [name='Karthik', birthDay='22/03/2003', endDate='null']
//21

//SalariedEmployee [annualSalary=50000.0 ] Employee [ Employee Id = 2 , Hire Date = 01/1/2021 ] Worker [name='Nan', birthDay='02/04/2000', endDate='null']
//In hand Salary per month = $3846.0 his age is 24
//retire amount is = $3461.0

//HourlyEmployee{HourPay=15.5} Employee [ Employee Id = 3 , Hire Date = 11/11/2019 ] Worker [name='Rita', birthDay='02/12/2002', endDate='null']
//Normal working day amount is = $124.0
//Double pay amount is = $248.0