
public class ThisKeyWord {
	int a;
	int b;
	
	public ThisKeyWord() {
		System.out.println("no-arg constructor");
	}
	
	public ThisKeyWord(int a) {
		this();
		this.a = a;
	}
	
	public ThisKeyWord(int a, int b) {
		this(a);
		this.b = b;
		this.display();
	}
	
	public void display() {
		System.out.println("a = "+a+"\nb = "+b);
	}
}
