import java.util.Arrays;
import java.util.Scanner;

public class MaximumFrequecy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        String sorted = new String(arr);
        // System.out.println(sorted);
        System.out.println(maxFString(sorted));
    }
    public static char maxFString(String str) {
        // if (str.isEmpty()){
        //     return "";
        // }
        StringBuilder result = new StringBuilder();
        char currentChar = str.charAt(0);
        int count = 1;
        char maxChar = currentChar;
        int maxCount = 1;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == currentChar) {
                count++;
            } else {
                // result.append(currentChar).append(count);
                if (count>maxCount) {
                    maxCount=count;
                    maxChar=currentChar;
                }
                currentChar = str.charAt(i);
                count = 1;
            }
        }
        // result.append(currentChar).append(count);
        if (count > maxCount) {
            maxCount = count;
            maxChar = currentChar;
        }
        // result.append(str)
        return maxChar;
    }
}
