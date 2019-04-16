package One;

import java.util.Scanner;

public class AddTwoNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int testCases = sc.nextInt();
		int[] arr = new int[testCases];
		for (int i = 0; i < testCases; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = a + b;
			arr[i] = c;
		}
		for (int i = 0; i < testCases; i++) {
			System.out.println(arr[i]);
		}
	}
}
