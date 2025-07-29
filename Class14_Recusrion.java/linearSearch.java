public class linearSearch {
    public static void main(String[] args) {
        int arr[]= {3,4,-1,11,17,19,6};
        int ans=ls(arr, 29, 0);
        System.out.println(ans);
    }
    public static int ls(int[] arr, int target, int idx) {
        if (idx==arr.length) {
            return -1;
        }
        if (arr[idx]==target) {
            return arr[idx];
        }
        return ls(arr, target, idx+1);
    }
}
