import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int arr[]=new int[N];
        for(int i=0; i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        int M=sc.nextInt();
        int ans=LinearSearch(arr,M);
        System.out.print(ans);
    }
    public static int LinearSearch(int[] arr, int target) {		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == target) {
				return i;
			}
		}
        return -1;		
	}
}
