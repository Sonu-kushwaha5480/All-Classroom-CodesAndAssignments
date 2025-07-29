import java.util.Scanner;

public class MaxCoulSum {
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
        MaxSum(arr);
        // for(int i=0; i<arr.length;i++){
        //     for(int j=0; j<arr[0].length;j++){
        //         System.out.print(arr[i][j]+ " ");
        //     }
        //     System.out.println();
        // }
    }
    public static void MaxSum(int[][] arr) {
        int maxColIndex = -1;
        int maxSum=Integer.MIN_VALUE;
        int minR=0;
        int maxR=arr.length-1;
        int minC=0;
        int maxC=arr[0].length-1;
        while (minC<=maxC) {
            int sum=0;
            for (int i = minR; i <=maxR; i++) {
            sum+= arr[i][minC];
            }
            if (sum > maxSum) {
            maxSum = sum;
            maxColIndex = minC+1;
        }
        minC++;
        }
    System.out.println(maxColIndex);
    System.out.println(maxSum);
    }  
}
