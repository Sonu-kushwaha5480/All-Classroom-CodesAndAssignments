import java.util.Arrays;
import java.util.Scanner;

public class CalculateTheSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int Q = sc.nextInt();
        int X[] = new int[Q];
        for (int i = 0; i < Q; i++) {
            X[i] = sc.nextInt();
        }
        
        for (int j = 0; j < X.length; j++) {
            int x = X[j];
            int[] original = new int[N];
            for (int i = 0; i < N; i++) {
                original[i] = arr[i];
        }
            for (int i = 0; i < arr.length; i++) {
                arr[i] = original[i] + original[(i - x + N) % N];
            }
            if (x == 0) {
                break;
            }
        }
        // System.out.println(Arrays.toString(arr));
        long sum=0;
        for (int i = 0; i < arr.length; i++) {
                sum = sum+ arr[i];
            }
            long mod=1000000007;
            long ans= sum%mod;
            System.out.println(ans);
    }
}
