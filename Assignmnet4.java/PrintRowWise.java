import java.util.Scanner;

public class PrintRowWise {
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
        for(int i=0; i<arr.length;i++){
            if (i%2==0) {
                for(int j=0; j<arr[0].length;j++){
                    System.out.print(arr[i][j]+",");
                }
            }else{
                for(int j=arr[0].length-1; j>=0;j--){
                    System.out.print(arr[i][j]+",");
                }
            }
        }
        System.out.print("END");
    }
}
