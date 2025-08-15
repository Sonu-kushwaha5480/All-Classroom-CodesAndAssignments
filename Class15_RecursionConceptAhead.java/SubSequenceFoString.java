public class SubSequenceFoString {
    public static void main(String[] args) {
        // int n=3;
        String s="abc";
        int ans= subseq(s, "");
        System.out.println(ans);
    }
    public static int subseq(String ques, String ans) {
        if(ques.length() ==0) {
			System.out.println(ans);
			return 1;
		}
		char ch = ques.charAt(0);
		int exc = subseq(ques.substring(1), ans);//exclusion
		int inc = subseq(ques.substring(1), ans+ch);// inclusion
		return inc+exc;
    }
}
