
class Cal{
	public int add(int a,int b) {
		return (a+b);
	}
	public int add(int a,int b,int c) {
		return (a+b+c);
	}
	public double add(double a,double b) {
		return (a+b);
	}
	public double add(int a,double b) {
		return (double)(a+b);
	}
	
	public double add(double a,int b) {
		return (double)(a+b);
	}
}

public class MethodOverloadingDemo {
	public static void main(String[] args) {
		Cal c = new Cal();
		c.add(12, 32);
		c.add(12,32,54);
		
	}
}

/* if two methods with same name but different parameters */