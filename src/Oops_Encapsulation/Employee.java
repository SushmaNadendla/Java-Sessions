package Oops_Encapsulation;

public class Employee {

	public String name;
	public int age;
	private int salary;
	private String address;
	
	public void setsalary(int salary) {
		this.salary=salary;
	}

	public int getsalary() {
		return salary;
	}
	public void setdetails(int age, String address) {
		this.address=address;
		this.age=age;
		
	}
	public int getdetails() {
		return age;
			
	}
	public String getdetails1() {
		return address;
			
	}
}
