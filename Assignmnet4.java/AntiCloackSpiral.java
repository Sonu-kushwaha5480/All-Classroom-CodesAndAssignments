import java.util.Scanner;

public class AntiCloackSpiral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr[][]= new int[n][m];
        for(int i=0; i<arr.length;i++){
            for(int j=0; j<arr[0].length;j++){
                arr[i][j]= sc.nextInt();
            }
        }
        Antispiralprint(arr);
    }
    public static void Antispiralprint(int arr[][]) {
        int totalElement = arr.length* arr[0].length;
        int count=0;
        int minR=0;
        int maxR=arr.length-1;
        int minC=0;
        int maxC=arr[0].length-1;

        while (count<totalElement) {
            for(int i=minR; i<=maxR && count<totalElement;i++){
                System.out.print(arr[i][minC]+", ");
                count++;
            }
            minC++;
            for(int i=minC; i<=maxC && count<totalElement;i++){
                System.out.print(arr[maxR][i]+", ");
                count++;
            }
            maxR--;
            for(int i=maxR; i>=minR && count<totalElement;i--){
                System.out.print(arr[i][maxC]+", ");
                count++;
            }
            maxC--;
            for(int i=maxC; i>=minC && count<totalElement;i--){
                System.out.print(arr[minR][i]+", ");
                count++;
            }
            minR++;
        }
        System.out.print("END");
    }
}
