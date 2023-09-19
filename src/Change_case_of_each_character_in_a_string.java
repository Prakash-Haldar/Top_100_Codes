import java.util.*;
public class Change_case_of_each_character_in_a_string {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the string");
	String s= sc.nextLine();
	StringBuffer ans= new StringBuffer();
	for(int i=0;i<s.length();i++) {
		int ascii= (int)s.charAt(i);
		if(ascii>=65 && ascii<=90) {
			ans.append((char)+(ascii+32));
		}
		else if(ascii>=97 && ascii<=122) {
			ans.append((char)+(ascii-32));
		}
		else if (s.charAt(i) == ' ')
	        ans.append(' ');
	}
	System.out.println(ans);
	sc.close();
}
}
