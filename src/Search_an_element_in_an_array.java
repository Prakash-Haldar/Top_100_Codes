import java.util.Scanner;

public class Search_an_element_in_an_array {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the length of array you want : ");
	int n= sc.nextInt();
	System.out.println("Enter the elements : ");
	int [] arr = new int [n];
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
	}
	System.out.println("Enter the element you want to search : ");
	int search=sc.nextInt();
	Boolean found=false; 
	for(int i=0;i<n;i++) {
		if (arr[i]==search) {
			System.out.println("Yes,The element is present in the index of : "+ i );
			found=true;
			break;
		}
		
	}
	if(!found) {
	System.out.println("No this element is not present");
	}
	sc.close();
	}
}
