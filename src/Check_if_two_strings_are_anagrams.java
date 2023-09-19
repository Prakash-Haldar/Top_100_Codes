import java.util.Arrays;
import java.util.Scanner;

public class Check_if_two_strings_are_anagrams {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String1");
		String s1 = sc.nextLine();
		System.out.println("Enter the String2");
		String s2 = sc.nextLine();
		char c1[] = s1.toCharArray();
		char c2[] = s2.toCharArray();
		Boolean flag = false;
		if (s1.length() != s2.length()) {
			System.out.println("It is not anagram");
		}
		Arrays.sort(c1);
		Arrays.sort(c2);
		for (int i = 0; i < s1.length(); i++) {
			if (c1 != c2) {
				flag = false;
				break;
			}
		}
		if (flag == false) {
			System.out.println("It is not Anagram");
		} else
			System.out.println("It is Anagram");

	}
}
