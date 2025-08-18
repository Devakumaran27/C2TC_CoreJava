package daythree.constructor;

import java.util.Scanner;

public class ConstructorDemo {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String name, city;
		int id;
		String phone;
		System.out.print("Enter Customer Id : ");
		id=sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("Enter Customer Phone : ");
		phone=sc.nextLine();

		System.out.print("Enter Customer Name : ");
		name=sc.nextLine();
		
		System.out.print("Enter Customer City : ");
		city=sc.nextLine();

		
		System.out.println(" ");
		
		System.out.println("default constructor");
		Customer c1=new Customer(); 
		c1.setCustomerName(name);
		c1.setCustomerId(id);
		c1.setCustomerCity(city);
		c1.setCustomerPhone(phone);
	
		System.out.println(c1);
		
		System.out.print("Enter Customer Id : ");
		id=sc.nextInt();
		
		sc.nextLine();
		System.out.print("Enter Customer Name : ");
		name=sc.nextLine();
		
		System.out.print("Enter Customer City : ");
		city=sc.nextLine();
		
		System.out.print("Enter Customer Phone : ");
		phone=sc.nextLine();
		
		System.out.println("parameterized constructor ");
		
		Customer c2=new Customer(name, id, city, phone); 
		System.out.println(c2);
		

	}

}