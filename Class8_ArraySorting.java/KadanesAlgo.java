public class KadanesAlgo {
    public static void main(String[] args) {
        
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
