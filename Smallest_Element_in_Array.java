import java.util.Scanner;

public class Smallest_Element_in_Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Length of Array");
		int n = sc.nextInt();
		int[] arr = new int[n];
		int smallest = arr[0];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < smallest) {
				smallest = arr[i];
			}
		}
		sc.close();
		System.out.println("Smallest Element in This Array is : " + smallest);
	}
}
