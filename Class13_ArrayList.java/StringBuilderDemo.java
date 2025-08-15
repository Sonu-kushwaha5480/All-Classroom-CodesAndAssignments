public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb =  new StringBuilder();

		sb.append('a');
		sb.append('a');
		sb.append('a');
		sb.append('a');
		sb.append('a');
		sb.append('a');
		
		System.out.println(sb);
		System.out.println(sb.toString());
		
		sb.replace(0, 0, "");
		System.out.println(sb);
		sb.delete(0, 2);
		System.out.println(sb);
		
		sb.length();
		for (int i = 0; i < sb.length(); i++) {
			System.out.println(sb.charAt(i));
		}
    }
}
