import java.util.Arrays;
import java.util.Scanner;

public class InsertLastelement {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int arr[] = {2,11,4,5,1,-1,13,3};
		int idx = part(arr,0,arr.length-1);
		System.out.println(idx);
		System.out.println(Arrays.toString(arr));
	}

	public static int part(int[] arr, int si, int ei) {
		int temp= arr[ei];
        int idx=si;
        for(int i=si; i<ei; i++){
            if (arr[i]<temp) {
                int j= arr[i];
                arr[i]=arr[idx];
                arr[idx]=j;
                idx++;
            }
        }
        int j=arr[idx];
        arr[idx]=arr[ei];
        arr[ei]=j;
        return idx;
    }
}
