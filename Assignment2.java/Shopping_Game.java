import java.util.Scanner;

public class Shopping_Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long T = sc.nextLong();
        while (T-- > 0) {
            long M = sc.nextLong();
            long N = sc.nextLong();
            long turn = 1;
            long sum1 = 0;
            long sum2 = 0;
            while (true) {
                if (turn % 2 != 0) {
                    sum1 =sum1+turn;
                    if (sum1 > M) {
                        System.out.println("Harshit");
                        break;
                    }
                } else {
                    sum2 = sum2 + turn;
                    if (sum2 > N) {
                        System.out.println("Aayush");
                        break;
                    }
                }
                turn++;
            }
        }
    }
}
