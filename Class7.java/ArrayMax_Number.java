import java.util.Scanner;

public class ArrayMax_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int size =  sc.nextInt();
		
		int arr[] = new int[size];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int ans = max(arr);
		System.out.println(ans);
	}

	public static int max(int[] arr) {
		// TODO Auto-generated method stub
		int ans = Integer.MIN_VALUE;
		System.out.println(ans);
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>ans) {
				ans = arr[i];
			}
		}
		return ans;
    }
}
