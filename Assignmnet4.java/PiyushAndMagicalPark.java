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
                arr[i][j]= sc.nextChar();
            }
        }
    }
}
