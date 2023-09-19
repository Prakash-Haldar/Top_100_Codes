import java.util.Scanner;
public class Sum_of_the_Numbers_in_a_String {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = sc.nextLine();
		int sum = 0;
		StringBuilder tempNum = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (Character.isDigit(c)) {
				tempNum.append(c);
			} else {
				if (tempNum.length() > 0) { 
					sum += Integer.parseInt(tempNum.toString());
					tempNum.setLength(0); 
				}
			}
		}
		if (tempNum.length() > 0) {
			sum += Integer.parseInt(tempNum.toString());
		}

		System.out.println("Sum of numbers in the string: " + sum);
		sc.close();
	}
}
