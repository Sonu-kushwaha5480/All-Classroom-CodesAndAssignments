import java.util.Scanner;

public class SearchInMatrix {
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
        int target= sc.nextInt();
        int ans=search(arr,target);
        System.out.println(ans);
    }
    public static int search(int arr[][], int target) {
        for(int i=0; i<arr.length;i++){
            for(int j=0; j<arr[0].length;j++){
                if (arr[i][j]==target) {
                    return 1;
                }
            }
        }
        return 0;
    }
}
