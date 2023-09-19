import java.util.Scanner;

public class Count_number_of_vowels_consonants_spaces_in_String {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String s= sc.nextLine();
	int vowels=0;
	int consonants=0;
	int spaces = 0;
	s=s.toLowerCase();
	for(int i=0;i<s.length();i++) {
		if (s.charAt(i)==' ') {
			spaces++;
		}
		else if (s.charAt(i)=='a' ||s.charAt(i)=='e'||s.charAt(i)=='i'||
				 s.charAt(i)=='o'||s.charAt(i)=='u') {
			vowels++;
		}
		else if(s.charAt(i)>='a' && s.charAt(i)<='z') {
			consonants++;
		}
	}
	System.out.println("Vowels in this String : "+vowels);
	System.out.println("Consonants in this String : "+consonants);
	System.out.println("Spaces in this String : "+spaces);
	sc.close();
}
}
