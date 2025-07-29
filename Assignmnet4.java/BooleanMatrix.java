import java.util.Scanner;

public class BooleanMatrix {
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
        BooleanMatrix(arr);
        for(int i=0; i<arr.length;i++){
            for(int j=0; j<arr[0].length;j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
    public static void BooleanMatrix(int[][] arr) {
    int[] row = new int[arr.length];
    int[] col = new int[arr[0].length];
    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr[0].length; j++) {
            if (arr[i][j] == 1) {
                row[i] = 1;
                col[j] = 1;
            }
        }
    }
    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr[0].length; j++) {
            if (row[i] == 1 || col[j] == 1) {
                arr[i][j] = 1;
            }
        }
    }
}
}