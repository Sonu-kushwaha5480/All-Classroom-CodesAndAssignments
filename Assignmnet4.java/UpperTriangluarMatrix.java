import java.util.Scanner;

public class UpperTriangluarMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int [][]arr= new int [n][n];
        for(int i=0; i<arr.length;i++){
            for(int j=0; j<arr[0].length;j++){
                arr[i][j]= sc.nextInt();
            }
        }
        UpperTriangular(arr);
        for(int i=0; i<arr.length;i++){
            for(int j=0; j<arr[0].length;j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
    public static void UpperTriangular(int[][] arr) {
        for(int i=0; i<arr.length; i++){
            for(int j=0;j<i; j++){
                arr[i][j]=0;
            }
        }
    }
}
