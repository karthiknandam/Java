package Array_Practice.co;

public class Array_find_Max_Max_in_Array {
    public static void main(String[] args) {
        int[] array = new int[] {2,3,5,7,10,23};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int e : array){
            if(e > max){
                max = e;
            }
            if(e<min){
                min = e;
            }
        }
        System.out.printf("Max is : %d , Min is : %d" ,max,min );
    }
}
