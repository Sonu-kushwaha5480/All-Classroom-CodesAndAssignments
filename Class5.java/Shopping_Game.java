import java.util.Scanner;

public class Shopping_Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); 
        while (T-- > 0) {
            int M = sc.nextInt();
            int N = sc.nextInt();

            int turn = 1;
            int sum1 = 0;
            int sum2 = 0;

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
                        System.out.println("Ayush");
                        break;
                    }
                }
                turn++;
            }
        }
    }
}
