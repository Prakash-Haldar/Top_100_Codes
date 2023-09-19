import java.util.HashMap;
import java.util.Scanner;

public class Find_Non_repeating_characters_of_a_String {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s;
		System.out.println("Enter The String");
		s = sc.nextLine();
		HashMap<Character, Integer> mp = new HashMap<>();
		for (char ch : s.toCharArray()) {
			if (mp.containsKey(ch)) {
				mp.put(ch, mp.get(ch) + 1);
			} else {
				mp.put(ch, 1);
			}
		}

		for (Character ch : mp.keySet()) {
			if (mp.get(ch) == 1) {
				System.out.print(ch + " ");
			}
			sc.close();
		}
	}
}
