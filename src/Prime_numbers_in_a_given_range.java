import java.util.*;

public class Prime_numbers_in_a_given_range {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Number");
		int n = sc.nextInt();
		System.out.println("Enter the Last Number");
		int m = sc.nextInt();

		for (int i = n; i <= m; i++) {
			Boolean Flag= true;
			  if (i == 2) {
	                Flag = false;
	            } else {
	                for (int j = 2; j <= Math.sqrt(i); j++) {
	                    if (i % j == 0) {
	                        Flag = false;
	                        break;
	                    }
	                }
	            }
			if (Flag == true)
				System.out.print(i + " ");
		}
		sc.close();
	}
}
