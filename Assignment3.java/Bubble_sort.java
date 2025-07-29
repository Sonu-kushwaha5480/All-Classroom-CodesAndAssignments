import java.util.Scanner;

public class Bubble_sort {
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
		for (int pass = 1; pass < arr.length; pass++) {
			for (int j = 0; j < arr.length-pass; j++) {
				if(arr[j]>arr[j+1]) {
					int t = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = t;
				}
			}
		}		
	}
}
