import java.util.Scanner;
public class Find_the_largest_word_in_a_String {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = sc.nextLine();
		String[] words = s.split("\\s+");
		String largestWord = "";
		int largestWordLength = 0;

		for (String word : words) {
			if (word.length() > largestWordLength) {
				largestWord = word;
				largestWordLength = word.length();
			}
		}

		System.out.println("Lagest Word in the String :" + largestWord);
		sc.close();
	}
}
