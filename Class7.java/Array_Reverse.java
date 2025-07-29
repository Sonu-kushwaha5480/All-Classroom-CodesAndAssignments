public class Array_Reverse {
    public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		for (int i = 0; i < arr.length; i++) {
			if (i==arr.length-1) {
                System.out.print(arr[i]);
            }else{
                System.out.print(arr[i]+",");
            }
		}
        System.out.println();
		System.out.println(".......");

		reverse(arr);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+",");
		}
		
	}

	public static void reverse(int[] arr) {
		int i = 0;
		int j = arr.length-1;
		
		while(i<j) {
			int t = arr[i];
			arr[i] = arr[j];
			arr[j] = t;
			i++;
			j--;
		}
		
	}
}
