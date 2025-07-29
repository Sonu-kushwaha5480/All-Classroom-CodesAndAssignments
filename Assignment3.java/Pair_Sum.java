import java.util.Arrays;
import java.util.Scanner;

public class Pair_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int arr[]=new int[N];
        for(int i=0; i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        int target=sc.nextInt();
        Arrays.sort(arr);
        for(int i=0; i<arr.length; i++){
            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }
            for(int k=arr.length-1; k>=i; k--){
                if (k < arr.length - 1 && arr[k] == arr[k + 1]) {
                    continue;
                }
                if((arr[i] + arr[k] == target) && (i < k)) {
                System.out.println(arr[i] + " and " + arr[k]);
                }
            }
        }
    }
}
