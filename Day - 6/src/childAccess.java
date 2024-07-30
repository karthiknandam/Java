public class childAccess {
    public static void main(String[] args) {
        for(int i = 1; i<=5 ; i++){

            pojo1 detailsPojo = new pojo1(
                    "AKPG20"+i ,
                    switch (i){
                        case 1 -> "MIKASA";
                        case 2 -> "EREN";
                        case 3 -> "LEVI";
                        case 4 ->"COLOSAL";
                        case 5 -> "ARMOR";
                        default -> "ANONYMUS";
                    },
                    "12/2/1999",
                    "Java");

//            Pojo vs record

//            Record1 detailsRecord = new Record1(
//                    "AKPG20"+i ,
//                    switch (i){
//                        case 1 -> "MIKASA";
//                        case 2 -> "EREN";
//                        case 3 -> "LEVI";
//                        case 4 ->"COLOSAL";
//                        case 5 -> "ARMOR";
//                        default -> "ANONYMUS";
//                    },
//                    "12/2/1999",
//                    "Java");

            System.out.println(detailsPojo);
//            System.out.println();
//            System.out.println(detailsRecord);


        }
//        Additional for brief understanding
//        Record cant get modified it's Encapsulated we can't set any value it is fixed
//        Pojo can be modified and set the required number any time;

        System.out.println();

        pojo1 test1 = new pojo1("21DDFR3","MIL","01/02/2001","java");
        Record1 test2 = new Record1("21DDFR3","KIM","02/09/1999","java");
//Getting from the pojo 1 getter instance ;
        System.out.println(test1);
        System.out.println("Record");
        System.out.println(test2);
        System.out.println(test1.getId());
//        Getting from record Direct Attribute;

        System.out.println(test2.id());

        System.out.println();

        test1.setSec(test1.getSec() + " , Java New mode " );

        System.out.println(test1.getSec());

//        test2.setSec not possible;

    }
}
