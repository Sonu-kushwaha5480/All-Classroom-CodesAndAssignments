import java.util.Scanner;

public class vonNeuman {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr= new int[n];
        for(int i=0; i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        for(int i=0; i<arr.length;){
            int sum = 0;
		    int mul =1;
            while(arr[i]>0) {
			int digit = arr[i]%10;
			sum = sum+digit*mul;
			mul = mul *2;
			arr[i] = arr[i]/10;
		}		
		arr[i]=sum;
        i++;
        }
        for(int i=0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
