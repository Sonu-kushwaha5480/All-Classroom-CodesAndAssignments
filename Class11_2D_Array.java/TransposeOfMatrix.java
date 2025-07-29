import java.util.Arrays;
import java.util.Scanner;

public class TransposeOfMatrix {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int m= sc.nextInt();
        // int target=sc.nextInt();
        int arr[][]= new int[n][m];
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                arr[i][j]= sc.nextInt();
                // System.out.println(arr);
            }
        } 
        transpose(arr);
        for(int []a: arr){
            System.out.println(Arrays.toString(a)); 
        }    
    }
    public static void transpose(int[][] arr) {
        for(int i=0; i<arr.length;i++){
            for(int j=0; j<i; j++){
                int temp= arr[i][j];
                arr[i][j]=arr[j][i];  
                arr[j][i]=temp;
            }
        }     
    }
}
