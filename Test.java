

public class Test {
	public static void main(String[] args) {
		Banking b = new Banking();
		
		Banking.Account acc = b.new Account();
		acc.display();
		
		Demo d = new Demo();
		
		d.m1();
	}
	
}
