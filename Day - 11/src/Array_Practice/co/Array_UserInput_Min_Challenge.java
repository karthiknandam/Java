package Array_Practice.co;

import java.util.Arrays;
import java.util.Scanner;

public class Array_UserInput_Min_Challenge {
    public static void main(String[] args) {

        int[] array = getUserInput();
        System.out.println("Your Array is : "+Arrays.toString(array));
        int minValue = findMin(array);
        System.out.println("Min value : "+minValue);

        int[] newValue = reverseValue(array);
        System.out.println("Your Reverse Array is : "+Arrays.toString(newValue));
    }

    private static int[] getUserInput(){
        System.out.print("Enter the values separated by , comma : ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] newArray = input.split(",");

        int[] intArray = new int[newArray.length];

        for(int i = 0 ; i< newArray.length ; i++){
            intArray[i] = Integer.parseInt(newArray[i].trim());
        }
        return intArray;

    }

    private static int findMin (int[] array){
        int min = Integer.MAX_VALUE;

        for(int e : array){
            if(e < min){
                min = e;
            }
        }
        return min;
    }


    private static int[] reverseValue(int[] array){
        int[] newValue = new int[array.length];
        int maxValue = array.length - 1;
        for(int e : array){
            newValue[maxValue--] = e;
            System.out.println("----> " +Arrays.toString(newValue));
        }
        return newValue;
    }
}
