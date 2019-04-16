package One;

import java.util.Scanner;

public class SmallFactorials {
	Scanner sc = new Scanner(System.in);
	
	int itr = sc.nextInt();
	int[] arr = new int[itr]
	for(int j = 0; j < itr; j++) {
		int a = sc.nextInt();
		int fact = 1;
		for (int i = 1; i <= a; i++) {
			fact = fact*i;
		}
		arr[j] = fact;
	}
	for (int i = 0; i < itr; i++) {
		System.out.println(arr[j]);
	}
}
