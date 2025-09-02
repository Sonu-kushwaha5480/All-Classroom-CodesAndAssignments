import java.util.Stack;
public class InsertAtBottom {
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
    public static void iab(int i,Stack<Integer> st) {
		Stack<Integer> temp = new Stack<>();//take a new Stack and push all element of first stack to new by doing pop
		
		while(!st.isEmpty()) {
			int a =  st.pop();
			temp.push(a);
		}
		st.push(i);//Here again pop from temp and push in original array.
		while(!temp.isEmpty()) {
			int a =  temp.pop();
			st.push(a);
		}
        //This approach causes more time space complexity. So we go for recursion approach as it has it's own default stack
	}
}
