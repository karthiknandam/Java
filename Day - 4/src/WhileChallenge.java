public class WhileChallenge {
    public static void main(String[] args) {
        int x = 4;
        int y = 20;
        int odd = 0;
        int even = 0;
        while(x<=y){
            x++;
            if(!isEvenNumber(x)){
                odd++;
                continue;
            }
            even++;
            if(even>5){
                break;
            }
            System.out.println("This number "+ x +" even");
        }

        System.out.println("Evens are "+even +" odds are "+odd);
    }
    public static boolean isEvenNumber(int i){
       if(i%2 ==0){
           return true;
       }
       return false;
    }
}
