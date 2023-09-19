import java.util.Scanner;
public class Equilibrium_index_of_an_array {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the length of array ");
	int n= sc.nextInt();
	int [] arr = new int[n];
	System.out.println("Enter the Elements");
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
	}
	int leftsum=0;
	int rightsum=0;
	for(int i=0;i<n;i++) {
		leftsum=0;
		for(int j=0;j<i;j++) {
			leftsum += arr[j];
		}
		rightsum=0;
		for(int j=i+1;j<n;j++) {
			rightsum+=arr[j];
		}
		if(leftsum==rightsum) {
			System.out.println("Equilibrium at index of :"+i);
			break;
		}
	}
	sc.close();
	}
}
