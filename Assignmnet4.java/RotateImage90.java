import java.util.Scanner;

public class RotateImage90 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        // int m=sc.nextInt();
        int [][]arr= new int [n][n];
        for(int i=0; i<arr.length;i++){
            for(int j=0; j<arr[0].length;j++){
                arr[i][j]= sc.nextInt();
            }
        }
        rotate(arr);
    }
    public static void rotate(int arr[][]) {
        int count=0;
        int minR=0;
        int maxR=arr.length-1;
        int minC=0;
        int maxC=arr[0].length-1;

        while (minR<arr.length) {
            for(int i=0; i<=maxR; i++){
                System.out.print(arr[i][maxC]+" ");
            }
            maxC--;
            minR++;            
        }
        System.out.println();
    }
}

