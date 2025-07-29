import java.util.Arrays;
import java.util.Scanner;

public class SortRowwise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int [][]arr= new int [n][m];
        for(int i=0; i<arr.length;i++){
            for(int j=0; j<arr[0].length;j++){
                arr[i][j]= sc.nextInt();
            }
        }
        sort(arr);
        for(int i=0; i<arr.length;i++){
            for(int j=0; j<arr[0].length;j++){
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }
    }
    public static void sort(int arr[][]) {
        int minR=0;
        while (minR<arr.length) {
            for(int i=0; i<arr[0].length; i++){
                for(int j=i+1; j<=arr[0].length-1; j++){
                    if (arr[minR][j]<arr[minR][i]) {
                        int temp = arr[minR][j];
                        arr[minR][j] = arr[minR][i];
                        arr[minR][i] = temp;
                    }
                }
            }
            minR++;
        }
    }
}
