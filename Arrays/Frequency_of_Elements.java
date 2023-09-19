import java.util.HashMap;
import java.util.Scanner;

public class Frequency_of_Elements {
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
			mp.put(arr[i], mp.getOrDefault(arr[i], 0) + 1);
		}
		for (int key : mp.keySet()) {
			System.out.println(key + " " + mp.get(key));
		}
		sc.close();

	}
}
