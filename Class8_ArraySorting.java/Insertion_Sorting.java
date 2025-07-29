import java.util.Arrays;

public class Insertion_Sorting {
    public static void main(String[] args) {
        int arr[] = { -20, 4,-1,2,5,-3,3 };
		// Arrays.sort(arr);
		sort(arr);

		// System.out.println(Arrays.toString(arr));
		for(int i=0; i<arr.length;i++){
			System.out.print(arr[i] + " ");
		}

	}

	public static void sort(int[] arr) {
	    for(int i=1; i<arr.length; i++){
			int temp=arr[i];
			int j=i-1;
			while (j>=0 && arr[j]>temp) {
				arr[j+1]=arr[j];
				j--;
			}
			j++;
			arr[j]=temp;
		}
        
    }
}
