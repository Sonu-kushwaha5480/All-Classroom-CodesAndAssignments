public class Binary_Search {
    public static void main(String[] args) {
        int arr[] = {-1,2,6,7,13,21};
        System.out.print(binarySearch(arr,1));
    }
    public static boolean binarySearch(int[] arr , int target) {
        int low=0;
        int high=arr.length-1;
        while (low<=high) {
            int mid = (low+high)/2;
            if (arr[mid]==target) {
                return true;
            }
            if (arr[mid]>target) {
                high = mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return false;
    }
    
}
