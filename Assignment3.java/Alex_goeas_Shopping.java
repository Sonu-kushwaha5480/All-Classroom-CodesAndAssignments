import java.util.Arrays;
import java.util.Scanner;

public class Alex_goeas_Shopping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] prices = new int[n];
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }
        int q = sc.nextInt();
        while (q-- > 0) {
            int A = sc.nextInt(); 
            int k = sc.nextInt(); 
            if (canMakeSumWithKItems(prices, A, k)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
    public static boolean canMakeSumWithKItems(int[] prices, int target, int k) {
        int count=0;
        Arrays.sort(prices);
        for (int i = 0; i < prices.length; i++) {
            if (target % prices[i] == 0) {
                count++;
            }
            if (count >= k) {
            return true;
            }
        }
        return false;
    }
}
