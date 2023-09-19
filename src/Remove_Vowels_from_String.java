import java.util.Scanner;

public class Remove_Vowels_from_String {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = sc.nextLine();

		StringBuilder result = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			char current = s.charAt(i);
			if (s.charAt(i) != 'a' && s.charAt(i) != 'e' && s.charAt(i) != 'i' && s.charAt(i) != 'o'
					&& s.charAt(i) != 'u' && s.charAt(i) != 'A' && s.charAt(i) != 'E' && s.charAt(i) != 'I'
					&& s.charAt(i) != 'O' && s.charAt(i) != 'U') {
				result.append(current);
			}
		}
		System.out.println("After removing vowels :" + result);
		sc.close();
	}
}
