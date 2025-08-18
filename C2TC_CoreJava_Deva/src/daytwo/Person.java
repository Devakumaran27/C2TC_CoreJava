package Day2;

public class Person {
	
	private int id ;
	private String address;
	private String name ;
	private int age;
	
	
	public Person() {
		
		System.out.println("Object Created");
		
}
	
	
	public Person(int id, String address, String name, int age) {
		super();
		this.id = id;
		this.address = address;
		this.name = name;
		this.age = age;
		
	}



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", address=" + address + ", name=" + name + ", age=" + age + "]";
	}
	
	

}
