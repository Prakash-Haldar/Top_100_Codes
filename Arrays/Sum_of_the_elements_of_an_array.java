import java.util.Scanner;

public class Sum_of_the_elements_of_an_array {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of array");
		int n=sc.nextInt();
		int [] arr= new int[n];
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int ans=0;
		for(int i=0;i<n;i++) {
			ans+=arr[i];
		}
		System.out.println("Sum of Elements :"+ans);
		sc.close();
	}
}
