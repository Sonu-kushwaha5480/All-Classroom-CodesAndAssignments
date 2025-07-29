import java.util.Scanner;

public class Sort_zeros_And_Ones {
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
        int zeroIndex=0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]==0) {
                int temp= arr[i];
                arr[i] = arr[zeroIndex];
                arr[zeroIndex]=temp;
                zeroIndex++;
            }
		}
    }
}
