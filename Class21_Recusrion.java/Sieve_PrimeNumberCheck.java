import java.util.Scanner;

public class Sieve_PrimeNumberCheck {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
		primesieve(n);
	}

	public static void primesieve(int n) {
		boolean arr[] = new boolean[n+1];		
		for (int i = 2; i*i <=n ; i++) {
			if(arr[i] == false) {
				for (int j = 2; i*j < arr.length; j++) {
					arr[i*j] = true;
				}
			}
		}		
		for (int i = 2; i < arr.length; i++) {
			if(arr[i] == false) {
				System.out.println(i);
			}
		}
    }
}
