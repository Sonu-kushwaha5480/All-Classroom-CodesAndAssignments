import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SumOfTwoArrays {
    public static void main(String[] args) {
        int arr[] = {9,9,9,9};
		int brr[] = {7,8};
		
		ArrayList<Integer> ans = new ArrayList<>();
		
		int carry = 0;
		int i = arr.length-1;
		int j = brr.length-1;
		while(i>=0 && j>=0) {
			int sum = arr[i]+brr[j]+carry;
			ans.add(sum%10);
			carry = sum /10;
			i--;
			j--;
		}
		while(j>=0) {
			int sum = brr[j]+carry;
			ans.add(sum%10);
			carry = sum /10;
			j--;
		}
		while(i>=0) {
			int sum = arr[i]+carry;
			ans.add(sum%10);
			carry = sum /10;
			i--;
		}
		
		if(carry>0) {
			ans.add(carry);
		}
		Collections.reverse(ans);
		System.out.println(ans);
    }
}
