import java.util.*;
public class Print_all_the_duplicates_in_String {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = sc.nextLine();
		int hash[] = new int[256];
		for (int i = 0; i < s.length(); i++) {
			hash[s.charAt(i)]++;
		}
		for (int i = 0; i < s.length(); i++) {
			if (hash[s.charAt(i)] > 1) {
				System.out.print(s.charAt(i));
				hash[s.charAt(i)] = 0;
			}
		}
		sc.close();

	}
}
