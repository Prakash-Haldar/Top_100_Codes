import java.util.Scanner;

public class Average_of_all_the_elements_in_the_array {
	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the length of array");
	int n=sc.nextInt();
	int [] arr=new int[n];
	System.out.println("Enter the elements");
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
	}
	int sum=0;
	for (int i : arr) {
		sum+=i;
	}
	double average=(double)sum/n;
	
	System.out.println("Average of Elements : "+average);
	sc.close();
}
}
