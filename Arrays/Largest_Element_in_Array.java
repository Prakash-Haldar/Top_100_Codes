import java.util.Scanner;

public class Largest_Element_in_Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Length of Array");
		int n = sc.nextInt();
		int[] arr = new int[n];
		int largest = arr[0];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {
				largest = arr[i];
			}
		}
		sc.close();
		System.out.println("Largest Element in This Array is : " + largest);
	}
}
