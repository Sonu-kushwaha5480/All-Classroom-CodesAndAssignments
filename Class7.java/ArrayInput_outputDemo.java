import java.util.Scanner;

public class ArrayInput_outputDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int size =  sc.nextInt();
		
		int arr[] = new int[size];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i]+",");
		}
    }
}
