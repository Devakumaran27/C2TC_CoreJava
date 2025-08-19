package dayfive.association.hasa;

public class Exceutor {
	

	public static void main(String[] args) {
		Address address = new Address("15, moogambigai nagar", "Nainarmandapam", "Puducherry", "605004");
		Person person = new Person("Devakumaran", address);
		person.displayInfo();
	}

}
