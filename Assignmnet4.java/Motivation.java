import java.util.Scanner;

public class Motivation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int [][]arr= new int [n][n];
        for(int i=0; i<arr.length;i++){
            for(int j=0; j<arr[0].length;j++){
                arr[i][j]= sc.nextInt();
            }
        }
        System.out.print(lowerTriangular(arr));
    }
    public static boolean lowerTriangular(int [][] arr) {
        for(int i=0; i<arr.length; i++){
            for(int j=i+1;j<=arr[0].length-1; j++){
                if (arr[i][j]==0) {
                    return true;
                }
                if (arr[i][j]!=0) {
                    return false;
                }
            }
        }        
        return false;        
    }
}
