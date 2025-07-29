import java.util.Scanner;

public class InverseOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int arr[]=new int[N];
        for(int i=0; i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        // for(int i=0; i<arr.length;i++){
        //     System.out.print(arr[i] +" ");
        // }  
        int[] inv= inverse(arr);
        for (int i = 0; i < inv.length; i++) {
            System.out.print(inv[i] + " ");
        }
        // System.out.print(arr);
    }
    //write function for taking inverse of above array.
    public static int[] inverse(int[] arr) {
        int[] inv = new int[arr.length];
        for(int i=0;i<arr.length; i++){
            inv[arr[i]]=i;
        }
        return inv;
    }
}
