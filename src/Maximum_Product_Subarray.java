import java.util.Scanner;
public class Maximum_Product_Subarray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the length of the array:");
		int n = scanner.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the elements:");
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}

		int result = Integer.MIN_VALUE;
		int pre = 1;
		int suf = 1;
		for (int i = 0; i < n; i++) {
			if (pre == 0) {
				pre = 1;
			}
			if (suf == 0) {
				suf = 1;
			}
			pre *= arr[i];
			suf *= arr[n - i - 1];
			result = Math.max(result, Math.max(pre, suf));
		}

		System.out.println("The maximum subarray is: " + result);
		scanner.close();
	}
}
