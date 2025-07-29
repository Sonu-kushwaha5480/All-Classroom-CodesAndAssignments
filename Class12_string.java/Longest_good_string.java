public class Longest_good_string {
    public static void main(String[] args) {
        
    }
    public static int goodString(String s) {
        int max=Integer.MIN_VALUE;
        int count=0;
        for(int i=0; i<s.length();i++){
            if (s.charAt(i)==a||s.charAt(i)==e||s.charAt(i)==i||s.charAt(i)==o||s.charAt(i)==u) {
                count++;
            }
            else{
                max=Math.max(count, max);
                count=0;
            }
        }
        return max;
    }
    public static boolean isVowel(char ch) {
        int max=Integer.MIN_VALUE;
        int count=0;
        for(int i=0; i<s.length();i++){
            if (s.charAt(i)==a||s.charAt(i)==e||s.charAt(i)==i||s.charAt(i)==o||s.charAt(i)==u) {
                count++;
            }
            else{
                max=Math.max(count, max);
                count=0;
            }
        }
        return max;
    }
}
