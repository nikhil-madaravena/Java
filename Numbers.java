
public class Numbers {
	public int sumOfNumbers(int m,int n) {
		int sum=0;
		for(int i=m;i<=n;i++) {
			sum+=i;
		}
		return sum;
	}
	
	public double avgOfNumbers(int m,int n) {
		double avg = (double)sumOfNumbers(m,n)/(n-m+1);
		return avg;
	}
	
	public int productOfNumbers(int m,int n) {
		int product = 1;
		for(int i=m; i<=n; i++) {
			product *= i;
		}
		return product;
	}
}
