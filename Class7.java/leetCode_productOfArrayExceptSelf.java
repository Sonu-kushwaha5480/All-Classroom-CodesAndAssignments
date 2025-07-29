public class leetCode_productOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
		
		int ans[] = productExceptSelf(arr);
		
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i]+ " ");
		}
	}
	
//	public static int[] productExceptSelf(int nums[]) {
		// int ans[] = new int[nums.length];
		
		// for (int i = 0; i < ans.length; i++) {// tracking idx
		// 	int prod =1;
		// 	for (int j = 0; j < ans.length; j++) {// to calculate prod by traveling whole array
		// 		if(i!=j) { // skips i == j condition hence itself
		// 			prod = prod * nums[j];
		// 		}
		// 	}
		// 	ans[i] = prod;
		// }
		
		// return ans;
//	}
	
	public static int[] productExceptSelf(int nums[]) {
		int left[] = new int[nums.length];
		int right[] = new int[nums.length];
		
		left[0] = 1;
		for (int i = 1; i < left.length; i++) {
			left[i] = left[i-1] * nums[i-1];
		}
		
		right[right.length-1] = 1;
		for (int i = right.length-2; i>=0; i--) {
			right[i] = right[i+1] * nums[i+1];
		}
		
		for (int i = 0; i < right.length; i++) {
			right[i] = right[i]*left[i];
		}
		
		return right;
    }
}
