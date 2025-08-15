public class AllCombinationToSum5 {
    public static void main(String[] args) {
        int arr[] ={1,2,5};
		coin(arr,target,"");
	}

	public static void coin(int arr, int target, String ans) {
		if(op>n) {
			return;
		}
		if(target == 0) {
			System.out.println(ans);
			return;
		}
		
		balanced(n, op+1, cl, ans+"(");
		if(op>cl) {
			balanced(n, op, cl+1, ans+")");
		}
    }
}
