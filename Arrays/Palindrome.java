import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = sc.next();
		boolean flag = true;
		int start = 0;
		int end = s.length() - 1;
		while (start < end) {
			if (s.charAt(start) != s.charAt(end)) {
				flag = false;
				break;

			}
			start++;
			end--;
		}
		if (flag == true) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}
		sc.close();
	}

}
