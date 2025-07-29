public class Odd_Even {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 50) {
            if (i % 2 == 0) {
                System.out.println(i + " is an Even number");
            } else {
                System.out.println(i + " is an Odd number");
            }
            i++;  // increment after the if-else block
        }
    }
}
