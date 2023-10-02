package JavaSessions;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<Object> ar=new ArrayList<Object>();
		ar.add(1);
		ar.add("Sushma");
		ar.add('F');
		ar.add(122609);

		
		//generics in Arraylist
		
		//int array list
		ArrayList<Integer> results=new ArrayList<Integer>();
		results.add(100);
		results.add(200);
		results.add(300);
		System.out.println(results.get(2));
		System.out.println(results.get(1));
		
		System.out.println("------------------------");
		
		//String Array 
		
		ArrayList<String> Employee=new ArrayList<String>();
		Employee.add("Sreemani");
		Employee.add("Sushma");
		Employee.add("Kalyani");
		Employee.add("Vikash");
		System.out.println(Employee.size());
		
		//Employee.remove(1);
		System.out.println(Employee.get(1));
		System.out.println("------------------------");
		
		// for loop
		for(int i=0;i<Employee.size();i++) {
			System.out.println(Employee.get(i));
			
		}
			System.out.println("------------------------");
			for(String e: Employee) {
				System.out.println(e);
			}
		
	}

}
