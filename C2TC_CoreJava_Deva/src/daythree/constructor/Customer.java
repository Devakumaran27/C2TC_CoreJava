package daythree.constructor;

public class Customer {
	 private String customerName;
	 private int customerId;
	 private String customerCity;
	private String customerPhone;
	 
//	System.out.println(" Default Constructor");
	public Customer() {
		System.out.println("Default Constructor");
	}
	
	//System.out.println("Parameterized Constructor");
	//use of this keyword
	public Customer(String customerName, int customerId, String customerCity, String customerPhone) {
		
		this(); //calling default constructor
		
		System.out.println("Parameterized Constructor");
		this.customerName = customerName;
		this.customerId = customerId;
		this.customerCity = customerCity;
		this.customerPhone = customerPhone;
	}
	
	//Getter and Setters
	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerCity() {
		return customerCity;
	}
	

	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}
	
	public String getCustomerPhone() {
		return customerPhone;
	}
	
	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;

	}

	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", customerId=" + customerId + ", customerCity="
				+ customerCity + ", customerPhone=" + customerPhone + "]"; 
		
}
}