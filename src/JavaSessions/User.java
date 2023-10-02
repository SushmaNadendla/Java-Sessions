package JavaSessions;

public class User {

	String name;
	int age;
	String City;
	
	public static void main(String[] args) {
		User US1=new User();
		US1.name="Ram";
		US1.age=25;
		US1.City="Bangalore";
		
		User US2=new User();
		US2.name="Sita";
		US2.age=21;
		US2.City="Hyderabad";
		
		User US3=new User();
		US3.name="Hari";
		US3.age=20;
		US3.City="Pune";
		
		System.out.println(US1.name+ " " + US1.age + " " + US1.City );
		System.out.println(US2.name+ " " + US2.age + " " + US2.City );
		System.out.println(US3.name+ " " + US3.age + " " + US3.City );

		System.out.println("-------------------------------------");
		US1=US2;
		System.out.println(US1.name+ " " + US1.age + " " + US1.City );
		System.out.println(US2.name+ " " + US2.age + " " + US2.City );
		System.out.println(US3.name+ " " + US3.age + " " + US3.City );
	
		System.out.println("-------------------------------------");
		
		US2=US3;
		System.out.println(US1.name+ " " + US1.age + " " + US1.City );
		System.out.println(US2.name+ " " + US2.age + " " + US2.City );
		System.out.println(US3.name+ " " + US3.age + " " + US3.City );
		System.out.println("-------------------------------------");
		
		US3=US1;
		System.out.println(US1.name+ " " + US1.age + " " + US1.City );
		System.out.println(US2.name+ " " + US2.age + " " + US2.City );
		System.out.println(US3.name+ " " + US3.age + " " + US3.City );
	}

}
