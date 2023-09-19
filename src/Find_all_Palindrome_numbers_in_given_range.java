import java.util.*;

public class Find_all_Palindrome_numbers_in_given_range {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Starting Number");
		int n = sc.nextInt();
		System.out.println("Enter the Last Number");
		int m = sc.nextInt();
		for (int i = n; i <= m; i++) {
			int original = i;
			int rev = 0;
			int rem;
			int temp = i;
			while (temp != 0) {
				rem = temp % 10;
				rev = (rev * 10) + rem;
				temp = temp / 10;
			}
			if (original == rev) {
				System.out.print(original + " ");
			}
		}
		sc.close();
	}

}
