import java.util.Scanner;

public class Max_path_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
            int n=sc.nextInt();
            int m=sc.nextInt();
            int arr[]=new int[n];
            int brr[]=new int[m];
            for(int i=0; i<arr.length;i++){
            arr[i]= sc.nextInt();          
            }
            for(int i=0; i<brr.length;i++){
            arr[i]= sc.nextInt();          
            }
            int ans = maxsum(arr,brr,n,m); 
	        System.out.println(ans) ; 
        }
    }
    public static int maxsum(int[] arr,int[] brr,int n,int m)
	    {
	        int sum1 = 0,sum2= 0 ; 
	        int res = 0 ; 
	        int i=0,j=0;
	        while(i<m&&j<n)
	        {
	            if(arr[i]>brr[j])
	            { sum2=sum2+brr[j];
	               j++; }
	             else if(arr[i]<brr[j])
	             {
	                 sum1+=arr[i]; 
	                 i++;
	             }
	             else
	             {
	                 if(sum1>=sum2)
	                 res=res+sum1 ; 
	                 else
	                 res=res+sum2 ;
	                 while(i<m&&j<n&&arr[i]==brr[j])
	                 {
	                 res=res+arr[i] ; 
	                 i++; 
	                 j++; 
	                 }
	                 sum1=0 ; 
	                 sum2=0;
	             }}
	            while (i < m)
	                sum1  +=  arr[i++];
	            while (j < n)
	                sum2 +=  brr[j++];
	            if(sum1>=sum2)
	                res=res+sum1 ; 
	                else
	                res=res+sum2 ;
	        return res ;
    }        
}
