package JavaSessions;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListMethods {

	public static void main(String[] args) {
	ArrayList<String> Test=new ArrayList<String>();
	Test.add("Suju");
	Test.add("Gyan");
	Test.add("Abbu");
	
	System.out.println(Test);
	System.out.println(Test.size());
	// Clear method to clear the Array list
	Test.clear();
	//Clone -Shallow copy Clone method is used  to copy  array list
	System.out.println(Test);
	System.out.println(Test.size());
	ArrayList<String> Test1=new ArrayList<String>();
	Test1.add("Thrishu");
	Test1.add("Harsith");
	Test1.add("Subbu");
	System.out.println(Test1);
	
	System.out.println("------------------------");
	//ArrayList<String> Test2 = (ArrayList<String>)Test1.clone();
	//System.out.println(Test2);
	
	//contains is used to check the values on array list returns boolean value
	System.out.println(Test1.contains("Suchi"));
	System.out.println("------------------------");
	//index 
	System.out.println(Test1.indexOf("Harsith"));
	
	System.out.println(Test1.indexOf("Harsith")>0);
	System.out.println("------------------------");
	
	ArrayList<String> ar=new ArrayList<String>(2);
	ar.add("Blues");
	ar.add("Skin");
	System.out.println(ar);
	ar.ensureCapacity(10);//define the capacity with the number specified
	
	//for each :jdk 1.8 with lamda
	ar.forEach(e -> System.out.println(e));
	Test1.forEach(e1 -> System.out.println(e1));
	ar.forEach(e -> System.out.println(e.toLowerCase()));
	
	System.out.println("------------------------");
	
	ArrayList<String> StudentList= new ArrayList<String>();
	
	StudentList.add("Vikash");
	StudentList.add("Sunitha");
	StudentList.add("Neethu");
	StudentList.add("Priya");
	
	System.out.println(StudentList);
	//Sort used to order based on alphabetical order
	Collections.sort(StudentList);
	
	System.out.println(StudentList);
	
	Collections.sort(StudentList,Collections.reverseOrder() );
	
	System.out.println(StudentList);
	}
}
