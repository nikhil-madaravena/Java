
public class Demo {
		public void m1() {
			class Calci{
				public void sum(int a,int b) {
					int res = a+b;
					System.out.println("res : "+ res);
				}
				
			}
			
			Calci c = new Calci();
			c.sum(23, 54);
		}
	
}
