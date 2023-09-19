import java.util.Arrays;
import java.util.Scanner;

public class find_Median_of_the_given_Array {
public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter the length of array");
	int n= sc.nextInt();
	int [] arr= new int[n];
	System.out.println("Enter the Elements");
	for (int i =0;i<n;i++) {
		arr[i]=sc.nextInt();
	}
	Arrays.sort(arr);
	double median=0.0;
	
	if(n%2==0) {
		median=(arr[n/2-1]+arr[n/2])/2.0;
	}
	else  {
		median=arr[n/2];
	}
	System.out.println("Median of the array is : "+ median);
	sc.close();
}
}
