public class POGO1CHILD {
    public static void main(String[] args) {
        for(int i = 1; i<=5 ; i++){

            POGO1 details = new POGO1(
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
            Class8th details2 = new Class8th(
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
            System.out.println(details);
        }

    }
}

// O/P ->{

//POGO1{id='AKPG201', name='MIKASA', dob='12/2/1999', sec='Java'}
//POGO1{id='AKPG202', name='EREN', dob='12/2/1999', sec='Java'}
//POGO1{id='AKPG203', name='LEVI', dob='12/2/1999', sec='Java'}
//POGO1{id='AKPG204', name='COLOSAL', dob='12/2/1999', sec='Java'}
//POGO1{id='AKPG205', name='ARMOR', dob='12/2/1999', sec='Java'}


//}