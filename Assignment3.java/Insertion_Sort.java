import java.util.Scanner;

public class Insertion_Sort {
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
		for (int i = 1; i < arr.length; i++) {
			int temp= arr[i];
            int j=i-1;
            while (j>=0 && arr[j]>temp) {
                arr[j+1]=arr[j];
                j--;
            }
            j++;
            arr[j]=temp;
		}
    }
}
