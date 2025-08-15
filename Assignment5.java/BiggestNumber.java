import java.util.Scanner;

public class BiggestNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0) {
            int m=sc.nextInt();
            long arr[]= new long[m];
            for(int i=0; i<arr.length;i++){
                arr[i]= sc.nextLong();
            }
            sort(arr);
            // for(int i=0; i<arr.length; i++){
            //     System.out.println(arr[i]);
            // }
            StringBuilder result= new StringBuilder();
            for(int i=0; i<arr.length; i++){
                result.append(arr[i]);
            }
            System.out.println(result);
        }
    }
    public static void sort(long[] arr) {
        for (int pass = 0; pass < arr.length - 1; pass++) {
            for (int i = 0; i < arr.length - 1 - pass; i++) {
                String concate1= Long.toString(arr[i]) + Long.toString(arr[i+1]);
                String concate2= Long.toString(arr[i+1]) + Long.toString(arr[i]);
                if (concate2.compareTo(concate1) > 0) { 
                    long temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
    }
}

