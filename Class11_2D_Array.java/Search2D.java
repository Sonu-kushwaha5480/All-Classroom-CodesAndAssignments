import java.util.Scanner;

public class Search2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m  =sc.nextInt();
		
		int arr[][] = new int[n][m];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {//row
				arr[i][j] = sc.nextInt();
			}
			
		}
		boolean ans = search(arr,11);
		System.out.println(ans);
	}

	public static boolean search(int[][] arr, int target) {		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(arr[i][j] == target) {
					return true;//target found
				}
			}
		}		
		return false; 
    }
}
