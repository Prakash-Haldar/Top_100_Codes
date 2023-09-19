import java.util.Scanner;

public class Remove_spaces {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the String");
	String s = sc.nextLine();
	String ans = s.replaceAll("\\s+", "");
	System.out.println(ans);
	sc.close();
}
}
