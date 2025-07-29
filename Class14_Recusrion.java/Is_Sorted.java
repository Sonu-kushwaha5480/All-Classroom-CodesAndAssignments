public class Is_Sorted {
    public static void main(String[] args) {
        int arr[]={2,3,4,5,6,7,9,10};
        boolean ans=check(arr,0);
        System.out.println(ans);
    }
    public static boolean check(int [] arr, int idx) {
        if (idx==arr.length) {
            return true;
        }
        if (arr[idx]<arr[idx-1]) {
            return false;
        }
        boolean temp= check(arr, idx+1);
        return temp;
    }
}
