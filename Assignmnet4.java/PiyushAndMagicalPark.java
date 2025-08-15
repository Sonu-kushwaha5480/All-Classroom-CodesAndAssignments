import java.util.Arrays;
import java.util.Scanner;

public class PiyushAndMagicalPark {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int k=sc.nextInt();
        int s=sc.nextInt();
        char [][]arr= new char [n][m];
        for(int i=0; i<arr.length;i++){
            for(int j=0; j<arr[0].length;j++){
                arr[i][j] = sc.next().charAt(0);
            }
        }
        int ans= calculateStrength(arr,s,k);
        if (ans>=k) {
            System.out.println("Yes");
            System.out.print(ans);
        }else{
            System.out.print("No");
        }

    }
    public static int calculateStrength(char[][] arr, int s, int k) {
        int sumStrength=s;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                if (arr[i][j]=='.') {
                        sumStrength=sumStrength -2;
                }else if (arr[i][j]=='*') {
                        sumStrength=sumStrength +5;
                }else if (arr[i][j]=='#') {
                    break;
                }
                if (j != arr[0].length - 1) {
                sumStrength--;
                }
                if (sumStrength < k) {
                return -1;
                }
            }
        }
        return sumStrength;
    }
}
