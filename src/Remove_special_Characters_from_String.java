import java.util.Scanner;
public class Remove_special_Characters_from_String {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = sc.nextLine();
		StringBuffer ans = new StringBuffer();
		for (int i = 0; i < s.length(); i++) {
			int ascii = (int) s.charAt(i);

			if ((ascii >= 65 && ascii <= 90) || (ascii >= 97 && ascii <= 122))
				ans.append(s.charAt(i));
		}

		System.out.println(ans);
		sc.close();
	}
}
