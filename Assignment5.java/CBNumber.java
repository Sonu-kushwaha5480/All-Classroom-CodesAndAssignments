import java.util.Scanner;

public class CBNumber {
    public static void main(String[] args) {
        // String s="81615";
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String s;
        while (true) {
            System.out.print("Enter the string of length " + size + ": ");
            s = sc.nextLine();
            if (s.length() == size) {
                break;
            } 
        }
        int n= Integer.parseInt(s);
        // long l=Long.parseLong(s);
        int count=0;
        boolean visited[]= new boolean[s.length()];
        for(int i=1; i<=s.length(); i++){
            for(int j=0; j<=s.length()-i; j++){
                // System.out.println(s.substring(j, j+i));
                long l= Long.parseLong(s.substring(j, j+i));
                if (IsCBNumber(l)&& isvisited(visited, j, j+i)) {
                    // System.out.println(l);
                    count++;
                    for(int k=j; k<j+i; k++){
                        visited[k]=true;
                    }
                }
            }
        }
        System.out.println(count);
    }
    public static boolean IsCBNumber(long l) {
        int arr[]={2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
        if (l==0||l==1) {
            return false;
        }
        for(int i=0; i<arr.length; i++){
            if (l==arr[i]) {
                return true;
            }
        }
        for(int i=0; i<arr.length; i++){
            if (l%arr[i]==0) {
                return false;
            }
        }
        return true;
    }
    public static boolean isvisited(boolean[] visited, int i, int j) {
        for(int k=i; k<j;k++){
            if (visited[k]==true) {
                return false;
            }
        }
        return true;
    }
}
