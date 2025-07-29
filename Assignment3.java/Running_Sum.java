import java.util.Scanner;

public class Running_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int arr[]=new int[N];
        for(int i=0; i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        int[] ans=runningsum(arr);
        for(int i=0; i<arr.length;i++){
            System.out.print(ans[i] + " ");
        }
    }
    public static int[] runningsum(int[] arr) {
        int [] sum=new int[arr.length];
        sum[0]=arr[0];
		for (int i = 1; i < arr.length; i++) {
            sum[i] = sum[i-1]+arr[i];
            // for (int j = 0; j <=i; j++) {
            //     sum[i] += arr[j];
	        // }
	    }
        return sum;
    }
}
