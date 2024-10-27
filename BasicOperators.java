
import java.util.Scanner;

public class BasicOperators {
	
	public int add(int a,int b) {
		return a+b;
	}
	
	public int subtract(int a,int b) {
		return a-b;
	}
	
	public int mul(int a,int b) {
		return a*b;
	}
	
	public double div(int a,int b) {
		return (double)a/b;
	}
	
	public static void main(String[] args) {
		
		BasicOperators b = new BasicOperators();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter value of a: ");
		int a = sc.nextInt();
		System.out.println("Enter value of b: ");
		int c = sc.nextInt();
		
		System.out.println("Addition : "+ b.add(a, c));
		System.out.println("Subtract : "+ b.subtract(a, c));
		System.out.println("Multiply : "+ b.mul(a, c));
		System.out.println("Division : "+ b.div(a, c));
		
		sc.close();
	}
}
