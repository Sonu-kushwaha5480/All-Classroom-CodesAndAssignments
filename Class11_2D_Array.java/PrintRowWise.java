import java.util.Scanner;

public class PrintRowWise {
    public static void main(String[] args) {
        int arr[][] ={ {1,2,3,4} , {5,6,7,8}, 
				{9,10,11,12}, {13,14,15,16}};
		
		for (int i = 0; i < arr.length; i++) {
			if(i%2 ==0) {
				for (int j = 0; j < arr[0].length; j++) {
					System.out.print(arr[i][j] + " ");
				}
			}
			else {
				for (int j = arr[0].length-1; j>=0; j--) {
					System.out.print(arr[i][j] + " ");
				}
			}
		}
    }
}
//     public static void row(int[][] arr) {
//         int i=1;
//         while (i<M) {
//             for(int j=0; j<arr[0].length; j++){
//                 int temp= arr[i][j];
//                 arr[i][j]=arr[j][i];  
//                 arr[j][i]=temp;
//             }
//         }
            
//         }     
//     }
// }
