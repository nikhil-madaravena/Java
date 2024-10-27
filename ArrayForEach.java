
import java.util.Scanner;

public class ArrayForEach {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter array size");
		int n = sc.nextInt();
		
		int[] b = {1,2,3,4,5,6,7};
		//array initialized 
		int[] a = new int[n];
		
		System.out.println("Enter array elements: ");
		for(int i = 0;i<n ;i++) {
			a[i] = sc.nextInt();
		}
		
		int sum=0;
		
		for(int i : a) {
			System.out.print(i + " ");
			sum += i;
		}
		
		System.out.println("\nSum of elements in array : "+sum);
		
		
	}
}
