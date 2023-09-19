import java.util.Scanner;

public class remove_duplicates_from_sorted_array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the length of array");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the Elements ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.print(arr[0] + " ");
		for (int i = 1; i < n; i++) {
			if (arr[i] != arr[i - 1]) {
				System.out.print(arr[i] + " ");
			}
		}
		sc.close();
	}
}
