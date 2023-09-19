import java.util.Scanner;

public class Remove_brackets_from_an_algebraic_expression {
public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter the expression");
	String s=sc.nextLine();
	StringBuilder result= new StringBuilder();
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)!='(' && s.charAt(i)!=')') {
			result.append(s.charAt(i));
		}
	}
	System.out.println("After removing brackets "+ result);
	sc.close();
}
}
