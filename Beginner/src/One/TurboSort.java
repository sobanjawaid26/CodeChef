package One;
/*
 * Example
Input:

5
5
3
6
7
1
Output:

1
3
5
6
7
 */
public class TurboSort {
	public static void main(String[] args) {
		int arr1[] = {5,5,3,6,7,1};
		int arr3[] = new int[arr1.length];
		
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1.length - i ; j++) {
				if(arr1[j] > arr1[j + 1]) {
					int temp;
					temp = arr1[j];
					arr1[j] = arr1[j + 1];
					arr1[j + 1] = temp;
				}
			}
			
		}
		for (int i = 0; i < arr3.length; i++) {
			if(arr1[i - 1] != arr1[i]) {
				arr3[i] = arr1[i];
			}
				
		}
		for (int i = 0; i < arr3.length; i++) {
			System.out.print(arr1[i] + " ");
		}
	}
}
