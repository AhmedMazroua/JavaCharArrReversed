import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class bigOneReverse {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        reverseInPlace(arr);
    }

    public static void reverseInPlace(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
            System.out.println(Arrays.toString(arr));
        }
    }
}

