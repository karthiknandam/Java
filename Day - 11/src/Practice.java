import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
        int[][] array = new int[3][2];
        System.out.println(Arrays.deepToString(array));

        for(int[] e : array){
            for(int x : e){
                System.out.println(x);
            }

        }
    }

}
