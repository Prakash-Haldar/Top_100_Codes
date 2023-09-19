import java.util.Arrays;
import java.util.Scanner;

public class Rearrange_array_in_increasing_decreasing_order {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of array");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		for (int i = 0; i < n / 2; i++) {
			System.out.print(arr[i] + " ");
		}
		for (int i = n - 1; i >= n / 2; i--) {
			System.out.print(arr[i] + " ");
		}
		sc.close();
	}
}
