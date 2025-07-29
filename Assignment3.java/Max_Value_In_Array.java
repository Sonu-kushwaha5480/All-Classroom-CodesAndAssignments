import java.util.Scanner;

public class Max_Value_In_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int arr[]=new int[N];
        for(int i=0; i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        // int M=sc.nextInt();
        int ans=MaxValueInArray(arr);
        System.out.print(ans);
    }
    public static int MaxValueInArray(int[] arr) {
        int max=Integer.MIN_VALUE;	
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]> max) {
				max=arr[i];
			}
		}
        return max;		
	}
}
