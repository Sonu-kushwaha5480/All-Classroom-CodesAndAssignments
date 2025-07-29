import java.util.Arrays;
import java.util.Scanner;

public class Squares_Of_Sorted_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int arr[]=new int[N];
        for(int i=0; i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        
        int[] ans= square(arr);        
        for (int i = 0; i < ans.length; i++) {
        System.out.print(ans[i] + " ");
        }
    }
    public static int[] square(int[] arr) {
        int[] sq= new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			sq[i]= (arr[i]*(arr[i]));
		}
        Arrays.sort(sq);
        return sq;	
	}
}
