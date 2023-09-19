import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
public class sort_array_of_elements_by_its_frequency {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Enter the Elements");
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		HashMap<Integer, Integer> mp = new HashMap<>();
		for (int num : arr) {
			mp.put(num, mp.getOrDefault(num, 0) + 1);
		}
		List<Integer> arrList = new ArrayList<>();
		for (int num : arr) {
			arrList.add(num);
		}
		Collections.sort(arrList, (a, b) -> {
			if (mp.get(a).equals(mp.get(b))) {
				return Integer.compare(a, b);
			}
			return Integer.compare(mp.get(b), mp.get(a));
		});
		System.out.println("Sorted by frequency: ");
		for (int num : arr) {
			System.out.println(num + " ");
		}
		System.out.println();
		sc.close();
		}
}
