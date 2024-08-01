package Array_Practice.co;

public class Array_find_Sorted_OrNot {
    public static void main(String[] args) {
        int[] array = new int[]{2,3,5,4,7,8,9};
        boolean isTrue = true;
        for(int i = 0 ; i < array.length - 1 ;i++){
            if(array[i] > array[i+1]){
                isTrue = false;
                break;
            }
        }
        String Value = isTrue ? "Sorted Array" : "Unsorted Array";
        System.out.println(Value);
    }
}
//Unsorted Array