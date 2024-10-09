//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        revString("helloWorld");
    }

    public static String revString(String s) {
        char[] chars = s.toCharArray();
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            char tempSlot = chars[left];
            chars[left] = chars[right];
            chars[right] = tempSlot;
            left++;
            right--;
        }
        String result = new String(chars);
        System.out.println(result);
        return result;
    }
}