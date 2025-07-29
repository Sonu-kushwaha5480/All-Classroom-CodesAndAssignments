public class maxSubArraySum {
    public static void main(String[] args) {
        int arr[] = { 1, -2, 3, 4 };
        maxSubarray(arr);
        // for(int i=0; i<arr.length;i++){
        //     System.out.print(arr[i] + " ");
        // }
        System.out.print(maxSubarray(arr));

    }
    public static int maxSubarray(int[] nums) {
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0; i<nums.length;i++){
            sum=sum+nums[i];
            max=Math.max(max, sum);
            if(sum<0){
                sum=0;
            }
        }
        return max;
    }
}
