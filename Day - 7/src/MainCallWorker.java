public class MainCallWorker {
    public static void main(String[] args) {

//        Employee e1 = new Employee("Karthk","02/02/2003" , "03/06/2022");
//        System.out.println(e1);
//        System.out.println(e1.getAge());
//        System.out.println(e1.collectPay());
//        System.out.println();
//
//        SalariedEmployee s1 = new SalariedEmployee("Nandu","22/03/2002","03/12/2021",120002.5,false);
//        System.out.println(s1);
//        System.out.println(s1.collectPay());
//        System.out.println(s1.getAge());
//        System.out.println();
//        SalariedEmployee s2 = new SalariedEmployee("Nandu","22/03/2002","03/12/2021",120002.5,false);
//        System.out.println(s2);
//        System.out.println(s2.collectPay());
//        System.out.println(s2.getAge());


        SalariedEmployee s1 = new SalariedEmployee("k","21/06/2003","21/02/2022",30000);
        s1.retire();
        System.out.println(s1);

        HourlyEmployee h1  = new HourlyEmployee("N","22/03/2001","12/02/2021",15);
        System.out.println(h1);
        h1.getDoublePay();
        h1.terminate("21/05/2024");
        System.out.println(s1.getAge());

    }

}
