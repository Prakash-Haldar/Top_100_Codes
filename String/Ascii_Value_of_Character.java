import java.util.Scanner;

public class Ascii_Value_of_Character {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Character :");
	char c = sc.next().charAt(0);
	int ascii = c;
	System.out.println("Ascii value of "+ c + " is "+ascii);
	sc.close();
}
}
