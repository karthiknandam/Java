package Array_Practice.co;

public class Array_Avg {
    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4,5};
        int sum = 0;
        for(int e : array){
            sum+=e;
        }
        System.out.printf("Avg of Array is : %d",sum/array.length);
    }
}
//Avg of Array is : 3