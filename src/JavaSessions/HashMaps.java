package JavaSessions;

import java.util.HashMap;

public class HashMaps {

	public static void main(String[] args) {
		//Hash maps stores the data in Key and value format
		//Virtual Capacity by default for Hash map is 16
		HashMap<String,String> emp=new HashMap<String,String>();
		emp.put("A", "Tom");
		emp.put("B", "Jerry");
		emp.put("C", "Tim");
		emp.put("D", "Jessie");
		System.out.println(emp.get("B"));
		System.out.println(emp.size());
		emp.put("E", "Tiger");
		emp.put("F", "Jimmy");
		emp.put("G", "Mango");
		emp.put("H", "Deer");
		emp.put("I", "Apple");
		emp.put("J", "Beetroot");
		emp.put("K", "Cat");
		emp.put("L", "Frog");
		emp.put("M", "Gir");
		emp.put("N", "Hat");
		emp.put("O", "Ink");
		emp.put("P", "Kite");

		System.out.println(emp);
		System.out.println(emp.size());
		emp.put("Q", "Test");
		System.out.println(emp.size());
	}

}
