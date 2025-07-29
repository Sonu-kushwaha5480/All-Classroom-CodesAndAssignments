import java.util.Scanner;

public class PainterToPaintBoard {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int k = sc.nextInt();
        int N = sc.nextInt();
        long arr[]= new long[N];
        for(int i=0; i<arr.length;i++){
            arr[i]= sc.nextLong();
        }
        long ans= minTime(arr, k, N);
        System.out.println(ans);
    }
    public static long minTime(long[] arr , int k, int N) {
        long lo=0;
        long hi=0;
        for(int i=0; i<arr.length; i++){
            hi+= arr[i];
        }
        long ans = 0;
		while(lo<=hi) {
			long mid = lo + (hi-lo)/2;
			
			if(isitPossible(mid,arr, k)) {
				ans = mid;
				hi= mid-1;
			}
			else {
				lo = mid+1;
			}
		}
		
		return ans;
		
	}

	public static boolean isitPossible(long mid, long[] arr, long nop) {
		int p =1;
		int board_painted = 0;
		
		for (int i = 0; i < arr.length; ) {
			if(board_painted + arr[i] <=mid) {
				board_painted+= arr[i];
				i++;
			}
			else {
				p++;
				board_painted = 0;
			}
			if(p>nop) {
				return false;
			}
		}
		return true;
    }
}
