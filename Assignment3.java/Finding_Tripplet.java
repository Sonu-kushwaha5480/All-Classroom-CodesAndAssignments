import java.util.Arrays;
import java.util.Scanner;

public class Finding_Tripplet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int arr[]=new int[N];
        for(int i=0; i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        int target=sc.nextInt();
        Arrays.sort(arr);
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                for(int k=0; k<arr.length; k++){
                    if ((arr[i]+arr[j]+arr[k]==target)&& (i!=j&&j!=k&&k!=i) && (arr[i]<=arr[j] && arr[j]<=arr[k])) {
                        System.out.println(arr[i] + "," + arr[j] +"and" + arr[k]);
                    }
                }
            }
        }
    }
}
