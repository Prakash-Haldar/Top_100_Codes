import java.util.Scanner;

public class Capitalize_first_and_last_character_of_each_word_of_a_string {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter a string:");
	        String input = sc.nextLine();
	        StringBuilder sb = new StringBuilder(input);
	        int size = input.length();

	        for (int i = 0; i < size; i++) {
	            if ((i == 0 || i == (size - 1)) && Character.isLowerCase(input.charAt(i))) {
	                sb.setCharAt(i, Character.toUpperCase(input.charAt(i)));
	            } else if (input.charAt(i) == ' ') {
	                if (i > 0 && Character.isLowerCase(input.charAt(i - 1))) {
	                    sb.setCharAt(i - 1, Character.toUpperCase(input.charAt(i - 1)));
	                }
	                if (i < size - 1 && Character.isLowerCase(input.charAt(i + 1))) {
	                    sb.setCharAt(i + 1, Character.toUpperCase(input.charAt(i + 1)));
	                }
	            }
	        }

	        String capitalizedString = sb.toString();
	        System.out.println("Capitalized String: " + capitalizedString);
	        sc.close();
	    }
	}


