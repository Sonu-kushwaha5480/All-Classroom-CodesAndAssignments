import java.util.Arrays;
import java.util.Scanner;

public class MurthalParantha {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        long paratha = sc.nextLong();
        int cook = sc.nextInt();
        int arr[]= new int[cook];
        for(int i=0; i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        long ans= minTimeNeeded(arr, paratha, cook);
        System.out.println(ans);
    }
    public static long minTimeNeeded(int[] arr , long paratha, int cook) {
		int maxRank = Arrays.stream(arr).max().getAsInt();
        long lo=0;
        // long hi = (long) maxRank * paratha * (paratha + 1) / 2;
		long hi= Integer.MAX_VALUE;
        // for(int i=0; i<arr.length; i++){
        //     hi+= arr[i];
        // }
        long ans = 0;
		while(lo<=hi) {
			long mid = lo + (hi-lo)/2;
			
			if(isitPossible(mid,arr, paratha)) {
				ans = mid;
				hi= mid-1;
			}
			else {
				lo = mid+1;
			}
		}
		
		return ans;
		
	}

	public static boolean isitPossible(long mid, int[] arr, long nop) {
		long count = 0;
        for (int i = 0; i < arr.length; i++) {
            int rank = arr[i];
            long t = 0;
            long time = 0;
            for (int p = 1; ; p++) {
                time += (long) rank * p;
                if (time > mid) {
					break;
				}
                t++;
            }
            count += t;
            if (count >= nop) {
				return true;
			}
        }
        return false;
	}
}
