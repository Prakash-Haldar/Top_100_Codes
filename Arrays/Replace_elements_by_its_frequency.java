import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Replace_elements_by_its_frequency {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the length of the array:");
		int n = scanner.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the elements:");
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}

		for (int i = 0; i < n; i++) {
			Set<Integer> s = new HashSet<>();
			for (int j = 0; j < n; j++) {
				if (arr[j] < arr[i]) {
					s.add(arr[j]);
				}
			}
			System.out.print(s.size() + 1 + " ");
		}
		scanner.close();
	}
}
