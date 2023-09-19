import java.util.*;
public class Check_if_number_is_prime_or_not {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = sc.nextInt();
		Boolean flag = false;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				flag = true;
				break;
			}
		}
		if (flag == true) {
			System.out.println("It is not Prime no");
		} else {
			System.out.println("It is Prime no");
		}
		sc.close();

	}
}
