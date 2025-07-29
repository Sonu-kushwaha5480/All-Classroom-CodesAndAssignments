public class firstbadversion {
    static int bad; 
    public static void main(String[] args) {
        int n = 5;
        bad = 4; // as per sample input
        System.out.println(firstBadVersion(4));
    }

    public static int firstBadVersion(int n) {
        int low=0;
        int high=n;
        int ans=0;
        while (low<=high) {
            int mid = low+ (high-low)/2;
            if (isBadVersion(mid)) {
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;

    }
    public static boolean isBadVersion(int n) {
        return false;
    }
}
