import java.util.Scanner;

public class Adding_element_in_an_array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of array");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the Elements");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the number you want to add");
		int num = sc.nextInt();
		System.out.println("Enter the position where you want to add");
		int pos = sc.nextInt();
		pos = pos - 1;
		int[] newArr = new int[n + 1];
		for (int i = 0; i < pos; i++) {
			newArr[i] = arr[i];
		}
		newArr[pos] = num;
		for (int i = pos; i < n; i++) {
			newArr[i + 1] = arr[i];
		}
		arr = newArr;
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		sc.close();
	}
}
