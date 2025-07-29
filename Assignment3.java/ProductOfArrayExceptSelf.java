import java.util.Scanner;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int arr[]=new int[N];
        for(int i=0; i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        long[] ans= productExceptSelf(arr);
        for(int i=0; i<arr.length;i++){
            System.out.print(ans[i] + " ");
        }
    }
    public static long[] productExceptSelf(int nums[]) {
		long left[] = new long[nums.length];
		long right[] = new long[nums.length];
		
		left[0] = 1;
		for (int i = 1; i < left.length; i++) {
			left[i] = left[i-1] * nums[i-1];
		}
		
		right[right.length-1] = 1;
		for (int i = right.length-2; i>=0; i--) {
			right[i] = right[i+1] * nums[i+1];
		}
		
		for (int i = 0; i < right.length; i++) {
			right[i] = right[i]*left[i];
		}
        return right;
	}
}
