import java.util.Scanner;

public class Maximum_frequency_of_character {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the String");
	String s1= sc.nextLine();
	int maxFreq=0;
	int hash[]= new int [256];
	char ans = 0;
	for(int i=0;i<s1.length();i++) {
		hash[s1.charAt(i)]++;
		if(hash[s1.charAt(i)]>maxFreq) {
			maxFreq=hash[s1.charAt(i)];
			ans=s1.charAt(i);
		}
	}
	System.out.println("The Maximum_frequency_of_character is "+ ans);
	sc.close();
	
}
}
