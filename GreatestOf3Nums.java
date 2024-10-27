
import java.util.Scanner;

public class GreatestOf3Nums {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a value : ");
		int a = sc.nextInt();
		System.out.println("Enter b value : ");
		int b = sc.nextInt();
		System.out.println("Enter c value : ");
		int c = sc.nextInt();
		
		if(a>b) {
			if(a>c) {
				System.out.println("A is greater");
			}
		}
		else if(b>c) {
			System.out.println("B is greater");
		}
		else {
			System.out.println("C is greater");
		}
	}
}
