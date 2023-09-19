import java.util.*;
public class Palindrome_number_or_not {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Number");
	int n=sc.nextInt();
	
	int original=n;
	int rev=0;
	int digit=0;
	
	while(n!=0) {
		digit=n%10; 
		rev=(rev*10)+digit;
		n=n/10;
	}
	if(rev==original) {
		System.out.println("It is Palindrome");
	}
	else {
		System.out.println("It is not Palindrome");
	}
	sc.close();
}
}
