import java.util.Scanner;

public class Count_the_number_of_words_in_a_given_string {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The String");
		String s= sc.nextLine();
		int spaces=0;
		int words=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==' ' && s.charAt(i+1)!=' ') {
				spaces++;
			}
		}
		words=spaces+1;
		System.out.println("No of Words in the String :"+ words);
		sc.close();
	}
}
