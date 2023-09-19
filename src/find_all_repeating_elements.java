import java.util.HashMap;
import java.util.Scanner;

public class find_all_repeating_elements {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of array");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the elements");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		HashMap<Integer, Integer> mp = new HashMap<>();
		for (int i = 0; i < n; i++) {
			int currentElement = arr[i];

			mp.put(currentElement, mp.getOrDefault(currentElement, 0) + 1);

		}
		for (int key : mp.keySet()) {
			int count = mp.get(key);
			if (count > 1) {
				System.out.print(key+" ");
			}
		}
		sc.close();
	}
}
