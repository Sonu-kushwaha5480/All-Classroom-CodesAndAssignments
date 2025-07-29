import java.util.Scanner;

public class Rain_water_Tapping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
            int N=sc.nextInt();
        int arr[]=new int[N];
        for(int i=0; i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        int ans= trap(arr);
        System.out.println(ans);
        }        
    }
    public static int trap(int[] height) {
		int leftmax[] = new int[height.length];
		int rightmax[] = new int[height.length];
		
		leftmax[0] = height[0];
		
		for (int i = 1; i < rightmax.length; i++) {
			leftmax[i] = Math.max(leftmax[i-1], height[i]);
		}
		
		rightmax[rightmax.length-1] = height[height.length-1];
		
		for (int i = height.length-2; i>=0; i--) {
			rightmax[i] = Math.max(rightmax[i+1], height[i]);
		}
		int sum =0;
		for (int i = 0; i < height.length; i++) {
			int unit  = Math.min(leftmax[i], rightmax[i]) - height[i];
			sum+= unit;
		}
		
		return sum;
	}
}
