import java.util.Scanner;
import java.util.Vector;
public class Rotate_array_by_K_elements {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter th length of array");
	int n=sc.nextInt();
	int [] arr=new int[n];
	System.out.println("Enter the Elements");
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
	}
	System.out.println("Enter the K value");
	int k=sc.nextInt();
	Vector<Integer> ans = new Vector<>();
	for(int i=k;i<n;i++) {
		ans.add(arr[i]);
	}
	for(int i=0;i<k;i++) {
		ans.add(arr[i]);
	}
	for (int i = 0; i < ans.size(); i++) {
		System.out.print(ans.get(i)+" ");
	}
	sc.close();
}
}
