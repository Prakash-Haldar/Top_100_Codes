import java.util.*;
public class Change_every_letter_with_next_lexicographic_alphabet {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the String");
	String s=sc.nextLine();
	StringBuffer ans = new StringBuffer();
	for (int i = 0; i < s.length(); i++) {
		int ascii=(int)(s.charAt(i));
		
		if(ascii==90) {
			ans.insert(i,(char)(65));
		}
		else if (ascii==122) {
			ans.insert(i,(char)(97));
		}
		else if (ascii>=65 && ascii<90 || ascii>=97 && ascii<122) {
			ans.insert(i,(char)(ascii+1));
		}
	}
	System.out.println(ans);
	sc.close();
	
}
}
