import java.util.Arrays;
import java.util.Scanner;

public class Pair_Of_Rose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while (t-- > 0) {
            int N = sc.nextInt(); // Number of roses
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            int target = sc.nextInt();
            Arrays.sort(arr);
            int left = 0, right = N - 1;
            int temp1 = 0, temp2 = 0;
            int minDiff = Integer.MAX_VALUE;
            while (left < right) {
                int sum = arr[left] + arr[right];
                if (sum == target) {
                    int diff = arr[right] - arr[left];
                    if (diff < minDiff) {
                        minDiff = diff;
                        temp1 = arr[left];
                        temp2 = arr[right];
                    }
                    left++;
                    right--;
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
            System.out.println("Deepak should buy roses whose prices are " + temp1 + " and " + temp2 + ".");
        }
    }
}
