import java.util.Scanner;

public class Remove_Characters_from_first_String_present_in_the_Second_String {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String 1");
		String s1 = sc.nextLine();
		System.out.println("Enter the String 2");
		String s2 = sc.nextLine();
		StringBuffer ans = new StringBuffer();
		for (int i = 0; i < s1.length(); i++) {
			int flag = 0;
			for (int j = 0; j < s2.length(); j++) {
				if (s1.charAt(i) == s2.charAt(j)) {
					flag = 1;
				}
			}
			if(flag==0) {
				ans.append(s1.charAt(i));
			}
		}

		System.out.println("Required ans "+ans);
		sc.close();
	}
}
