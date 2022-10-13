package org.emp;

public class Employee {
	
	private void empId() {
		System.out.println("12345");

	}
	private  static void empName() {
		System.out.println("senthil kumar");

	}
	private void empDop() {
		System.out.println("14/04/1995");  

	}
	private void emphone() {
		System.out.println("8667089668");

	}
	private void empemail() {
		System.out.println("senthilkumar140495@gmail.com");
	}
	private void empaddress() {
		System.out.println("selva nagar,thadakovil,aravakurichi,karur");
	}
	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.empId();
		emp.empName();
		emp.empDop();
		emp.emphone();
		emp.empemail();
		emp.empaddress();
	}
	
}
