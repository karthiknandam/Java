public class EncapsulationAccess {
    public static void main(String[] args) {
        EncapsulationChallenge E1 = new EncapsulationChallenge(50,true);
//        E1.addToner(1000);
//        E1.setPagesPrinted(35);

         E1.addToner(20);


        System.out.println(E1.setPagesPrinted(25)+" and Total pages "+E1.getPagesPrinted() + " and toner of "+ E1.getToner());

        E1.addToner(50);
//        did not execute because we set it in -1 false sot it will print existing toner which is 50+20;

        System.out.println(E1.setPagesPrinted(30)+" and Total pages "+E1.getPagesPrinted()+ " and toner of "+ E1.getToner());
    }
}
//O/P

//13 and Total pages 25 and toner of 70
//15 and Total pages 55 and toner of 70