public class Reverse_Array_On_Range {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+",");
		}
		System.out.println();
		reverse(arr,1, 4);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+",");
		}
		
	}

	public static void reverse(int[] arr,int i , int j) {
		while(i<j) {
			int t = arr[i];
			arr[i] = arr[j];
			arr[j] = t;
			i++;
			j--;
		}
    }
}
