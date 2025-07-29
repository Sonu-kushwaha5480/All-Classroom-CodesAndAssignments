public class selectionSort {
    public static void main(String[] args) {
        int arr []={4,-1,2,5,-3,3};
        sort(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void sort(int[] arr) {
        for(int i=0;i<arr.length-1;i++){
            int min_idx=i;
            for(int j=i+1; j<arr.length; j++){
                if (arr[j]<arr[min_idx]) {
                    min_idx=j;
                }
            }
            int t=arr[i];
            arr[i]=arr[min_idx];
            arr[min_idx]=t;
        }
    }
}
