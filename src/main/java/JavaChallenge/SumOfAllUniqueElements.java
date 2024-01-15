package JavaChallenge;
import java.util.Arrays;
public class SumOfAllUniqueElements {
	public static int FindSumOfAllUniqueElements(int arr[], int len) {
		Arrays.sort(arr);
		int sum = 0;
		for (int i = 0; i < len; i++) {
			if (arr[i] == Integer.MIN_VALUE) {
				continue;
			}
			int count = 0;
			for (int j = i; j < len; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			if (count > 1) {
				for (int j = i; j < i + count; j++) {
					arr[j] = Integer.MIN_VALUE;
				}
			}
		}
		for (int i = 0; i < len; i++) {
			if (arr[i] != Integer.MIN_VALUE) {
				sum = sum + arr[i];
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		int arr1[] = { 1, 2, 3, 2 };
		int len1 = arr1.length;
		System.out.println("Sum of all unique elements: "+FindSumOfAllUniqueElements(arr1, len1));

		int arr2[] = { 1, 1, 1, 1, 1 };
		int len2 = arr2.length;
		System.out.println("Sum of all unique elements: "+FindSumOfAllUniqueElements(arr2, len2));

		int arr3[] = { 1, 2, 3, 4, 5 };
		int len3 = arr3.length;
		System.out.println("Sum of all unique elements: "+FindSumOfAllUniqueElements(arr3, len3));
	}
}
