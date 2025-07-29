import java.util.Scanner;

public class max_circular_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0; i<arr.length;i++){
            arr[i]= sc.nextInt();          
        }
        int ans  = max_sum(arr);
		System.out.println(ans);
        }  
    }
    public static int max_sum(int[] arr) {
        int maxSum=arr[0];
        int sum1=0;
        int minSum=arr[0];
        int sum2=0;
        int total=0;
        for(int i=0; i<arr.length; i++){
            sum1+=arr[i];
            maxSum=Math.max(maxSum, sum1);
            if (sum1<0) {
                sum1=0;
            }
            sum2+=arr[i];
            minSum=Math.min(minSum, sum2);
            if (sum2>0) {
                sum2=0;
            }
            total+=arr[i];
        }
        if (total==minSum) {
            return maxSum;
        }
        return Math.max(maxSum, total-minSum);
    }
    
}
