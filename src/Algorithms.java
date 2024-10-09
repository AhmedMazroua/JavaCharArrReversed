import java.util.Arrays;

public class Algorithms {
    public static void main(String[] args) {
        char[] arr = {'a', 'n','d'};
        reversecharArr(arr);
    }

    public static void reversecharArr(char[] rray) {
        int start = 0;
        int end = rray.length -1;

        while (start < end){
            char temp = rray[start];
            rray[start] = rray[end];
            rray[end] = temp;
            start++;
            end--;
        }

        System.out.println(Arrays.toString(rray));

    }
}

