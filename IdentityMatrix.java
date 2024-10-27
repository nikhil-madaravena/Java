
import java.util.Scanner;

public class IdentityMatrix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter order of matrix(m,n) : ");
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int[][] a = new int[m][n];
		
		System.out.println("Enter array elements: ");
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		boolean isIdentity = true;
		
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				if(i==j) {
					if(a[i][j]!=1) {
						isIdentity = false;
						break;
					}
				}else {
					if(a[i][j]!=0) {
						isIdentity = false;
						break;
					}
				}
			}
		}
		
		if(isIdentity) {
			System.out.println("Is a Identity Matrix");
		}else {
			System.out.println("Not a Identity Matrix");
		}
		
	}
}
