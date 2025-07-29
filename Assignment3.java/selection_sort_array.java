import java.util.Scanner;

public class selection_sort_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int arr[]=new int[N];
        for(int i=0; i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        sort(arr);
        for(int i=0; i<arr.length;i++){
            System.out.println(arr[i] + " ");
        }
    }
    public static void sort(int[] arr) {
		for (int i = 0; i < arr.length-1; i++) {
			int min_idx = i;			
			for (int j = i+1; j < arr.length; j++) {
				if(arr[j]< arr[min_idx]) {
					min_idx = j;
				}
			}
            if (arr[min_idx] != arr[i]) {
			int t = arr[i];
			arr[i] = arr[min_idx];
			arr[min_idx] = t;
            }
            if (arr[i] == 1) {
            break;
            }        
		}
	}
}
