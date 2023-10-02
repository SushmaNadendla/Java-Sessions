package ConstructorConcepts;

public class Employee {

	String name;
	int age;
	String dob;
	String City;
	boolean ispermanent;
	//Constructor
	//1. Name of the COnstructor will remain the class name
	
	public Employee() {
		System.out.println("Default Constructor");
	}
	
	public Employee(int a) {
		System.out.println("1 Parameter Constructor");
	}
	public Employee(int a,int b) {
		System.out.println("2 Parameter Constructor");
	}
	
	public Employee(String name) {
		this.name=name;
	}
	public Employee(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	public static void main(String[] args) {
		Employee ob=new Employee("Tarun");
	
		System.out.println(ob.name);
		
		Employee E1=new Employee("Mahesh",45);

		System.out.println(E1.name+" "+ E1.age);
		
		Employee E2=new Employee("Adithya","Bangalore");
		System.out.println(E2.name+" "+ E2.City);
		
		Employee E3=new Employee("Geethu",27," 25/06/1997","Mangalore",true);
		System.out.println(E3.name+" "+ E3.age+E3.dob+" "+ E3.City + " "+E3.ispermanent );
	}

	public Employee(String name, String city) {
		super();
		this.name = name;
		City = city;
	}

	public Employee(String name, int age, String dob, String city, boolean ispermanent) {
		super();
		this.name = name;
		this.age = age;
		this.dob = dob;
		this.City = city;
		this.ispermanent = ispermanent;
	}

}
