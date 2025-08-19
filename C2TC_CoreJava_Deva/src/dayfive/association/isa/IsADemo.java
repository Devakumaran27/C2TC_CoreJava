package dayfive.association.isa;

public class IsADemo {
	public static void main(String[] args) {

		Employee employee = new Employee("Devakumaran", 27, "IT");
		Manager manager = new Manager("Sakthi", 7, "Hr", 8);

		System.out.println(employee);
		System.out.println("---------------------------------------------------------------");
		System.out.println(manager);
	}

}
