import java.util.Scanner;

public class second_largest_and_second_smallest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of array");
		int n=sc.nextInt();
		int[]arr=new int[n];
		
		int smallest=Integer.MAX_VALUE; int sec_smallest=Integer.MAX_VALUE;
		int largest=Integer.MIN_VALUE;  int sec_largest=Integer.MIN_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]<smallest) {
				sec_smallest=smallest;
				smallest=arr[i];
			}
			else if(arr[i]<sec_smallest && arr[i]>smallest)
			{
				sec_smallest=arr[i];
			}
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>largest) {
				sec_largest=largest;
				largest=arr[i];
			}
			else if(arr[i]>sec_largest && arr[i]<largest) {
				sec_largest=arr[i];
			}
		}
		System.out.println("Second Smallest :"+sec_smallest);
		System.out.println("Second Largest :"+sec_largest);
		sc.close();
	}
	
}
