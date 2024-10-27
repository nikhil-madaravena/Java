
class Employee{
	int id;
	String name;
	
	public Employee initialize(Employee emp) {
		emp.id = 23;
		emp.name = "Name";
		
		return emp;
	}
}

public class ObjectPassing {
	public static void main(String[] args) {
		Employee emp = new Employee();
		Employee e = emp.initialize(emp);
		
		System.out.println("Emp Name "+ e.name);
		System.out.println("Emp Id "+ e.id);
	}
}
