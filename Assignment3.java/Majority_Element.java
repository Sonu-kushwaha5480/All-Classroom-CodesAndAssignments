import java.util.Scanner;

public class Majority_Element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int arr[]=new int[N];
        for(int i=0; i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        int count=0;
        int majorityelement=0;
        for(int i=0; i<arr.length;i++){
            if (count==0) {
                majorityelement=arr[i];
                count=1;
            }else if (arr[i]==majorityelement) {
                count++;
            }else{
                count--;
            }
        }
        System.out.println(count);
        System.out.println(majorityelement);
    }
}
