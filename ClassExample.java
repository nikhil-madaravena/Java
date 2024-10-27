
class A{
	public void m() {
		System.out.println("hi");
	}
}
public class ClassExample {
	public static void main(String[] args) {
		A a = new A();
		A b = a;
		
		b.m();
		
		
	}
}
