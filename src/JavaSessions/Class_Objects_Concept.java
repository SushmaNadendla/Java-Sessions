package JavaSessions;


public class Class_Objects_Concept {

	//Class Variables
	String name;
	int age;
	double salary;
	boolean isActive;

	public static void main(String[] args) {
		
		//create object of this class
		//new keyword
		
		Class_Objects_Concept c1=new Class_Objects_Concept();
		
		System.out.println(c1.name);
		System.out.println(c1.age);
		System.out.println(c1.salary);
		System.out.println(c1.isActive);
		c1.name="Tom";
		c1.age=20;
		c1.salary=12.000;
		c1.isActive=true;
		System.out.println("-------------------------------");
		System.out.println(c1.name);
		System.out.println(c1.age);
		System.out.println(c1.salary);
		System.out.println(c1.isActive);
				
		System.out.println("-------------------------------");
		Class_Objects_Concept c2=new Class_Objects_Concept();
	
	
		c2.name="Tarun";
		c2.age=40;
		c2.salary=25000.000;
		c2.isActive=true;
		System.out.println(c2.name);
		System.out.println(c2.age);
		System.out.println(c2.salary);
		System.out.println(c2.isActive);
	}
	

}
