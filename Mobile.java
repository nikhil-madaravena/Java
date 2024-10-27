
public class Mobile {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Class c = Class.forName("Samsung");
		Object obj = c.newInstance();
		Samsung s1 = (Samsung)obj;
		
		s1.display();
		
	}
}