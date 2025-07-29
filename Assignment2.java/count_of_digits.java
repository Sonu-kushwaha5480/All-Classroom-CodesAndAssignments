import java.util.Scanner;

public class count_of_digits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int target=sc.nextInt();
        int count=0;
        while (n>0) {
            int digit=n%10;
            if (digit==target) {
                count++;
            }
            n=n/10;
        }
        System.out.print(count);
    }
}
