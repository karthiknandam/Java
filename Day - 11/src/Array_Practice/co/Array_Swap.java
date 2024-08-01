package Array_Practice.co;

import java.util.Arrays;

public class Array_Swap {
    public static void main(String[] args) {
        int[] array = new int[]{1,2,4,5,6,19};
        int temp;
        int n = Math.floorDiv(array.length, 2);

        for(int i = 0 ; i < n ; i++){
            int l = array.length - 1 - i;
            temp = array[i];
            array[i] = array[l];
            array[l] = temp;
        }
        System.out.println(Arrays.toString(array));
    }
}

//[19, 6, 5, 4, 2, 1]