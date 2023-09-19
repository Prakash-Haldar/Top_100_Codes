import java.util.Arrays;
import java.util.Scanner;
public class Write_a_program_to_sort_characters_in_a_string {
public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter The String");
	String s= sc.next();
	char [] c = s.toCharArray();
	Arrays.sort(c);
	String ans = new String(c);
	System.out.println("After Sorting " +ans);
	sc.close();
}
}
