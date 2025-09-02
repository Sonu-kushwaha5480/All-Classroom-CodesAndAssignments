import java.util.Stack;
public class InsertAtBottomViaRec {
    public static void main(String[] args) {
        Stack<Integer> st =  new Stack<>();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		System.out.println(st);
		iab(60,st);
		System.out.println(st);
	}
    private static void iab(int i, Stack<Integer> st) {
		if(st.isEmpty()) {
			st.push(i);
			return;
		}
		
		int a = st.pop();
		iab(i, st);
		st.push(a);
		
	}
}
