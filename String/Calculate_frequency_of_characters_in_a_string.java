import java.util.HashMap;
import java.util.Scanner;

public class Calculate_frequency_of_characters_in_a_string {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the String");
	String s= sc.nextLine();
	 HashMap<Character, Integer> mp = new HashMap<>();
     for (char ch : s.toCharArray()) {
         if (mp.containsKey(ch)) {
            mp.put(ch, mp.get(ch) + 1);
         } else {
           mp.put(ch, 1);
         }
     }

   
     for (Character ch : mp.keySet()) {
         System.out.println(ch + " : " + mp.get(ch));
     }
     sc.close();
}
}
