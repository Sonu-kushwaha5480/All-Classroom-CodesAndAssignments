import java.util.Arrays;

public class Bubble_Sorting {
    public static void main(String[] args) {
        int arr[]={5,4,3,1,2};
        sort(arr);
        // for(int i=0; i<arr.length; i++){
        //     System.out.print(arr[i] + " ");
        // }                                    //printing element one by one
        System.out.println(Arrays.toString(arr));//we can directly write this code to print sorted array directly
                                                // without printing each element one by one.
    }
    public static void sort(int[] arr) {
        for(int pass=1; pass<arr.length;pass++){
            for(int j=0; j<arr.length-pass; j++){
                if (arr[j]>arr[j+1]) {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}
