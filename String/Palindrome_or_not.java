import java.util.Scanner;

public class Palindrome_or_not {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = sc.nextLine();

		s = s.toLowerCase();

		Boolean flag = false;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
				flag = true;
				break;
			}
		}
		
		if (flag == true) {
			System.out.println("It is not Palindrome");
		} 
		else {
			System.out.println("it is palindrome");
		}
		sc.close();
	}
}
