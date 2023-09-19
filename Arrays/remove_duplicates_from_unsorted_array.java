import java.util.HashMap;
import java.util.Scanner;

public class remove_duplicates_from_unsorted_array {
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
		{
			for (int i = 0; i < n; i++) {
				if (!mp.containsKey(arr[i])) {
					System.out.print(arr[i] + " ");
					mp.put(arr[i], 1);
				}
			}
		}
		sc.close();
	}
}
