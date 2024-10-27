
import java.util.Scanner;

public class SwitchExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a value : ");
		int n = sc.nextInt();
		
		switch(n) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3: 
			System.out.println("Wednesday");
			break;
		default:
			System.out.println("only 1,2,3");
		}
	}
}