package Array_Practice.co;

public class Array_Sum {
    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4,5};
        int sum = 0;
        for(int e:array){
            sum+=e;
        }
        System.out.printf("Sum of Array Elements is : %d",sum);
    }
}
//Sum of Array Elements is : 15