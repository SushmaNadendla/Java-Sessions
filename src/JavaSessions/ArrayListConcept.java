package JavaSessions;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> Ar=new ArrayList<Integer>();
		
		System.out.println(Ar.size());//0
		
		Ar.add(10);//1 Physical capacity is always the array size
		Ar.add(20);
		Ar.add(100);
		System.out.println(Ar.get(2));
		
		System.out.println(Ar.size());
		Ar.add(30);
		Ar.add(40);
		Ar.add(50);
		System.out.println(Ar.size());//6
		System.out.println(Ar.get(0));//10
		System.out.println("------------------------");
		//for loop to print all the values in array list
		
		for(int i=0;i<Ar.size();i++) {
			System.out.println(Ar.get(i));
		}
	}

}
