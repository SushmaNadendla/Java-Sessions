package JavaSessions;

import java.util.ArrayList;

public class ArrayList_ColorsAssignment {

	public static void main(String[] args) {
		ArrayList<String> Colors=new ArrayList<String>();
		Colors.add("Blue");
		Colors.add("Pink");
		Colors.add("White");
		Colors.add("Black");
		Colors.add("Yellow");
		Colors.add("Sky Blue");
		Colors.add("Green");
		Colors.add("Orange");
		Colors.add("Red");
		System.out.println(Colors.size());
		
		for(int i=0;i<Colors.size();i++) {
			System.out.println(Colors.get(i));
		}
		System.out.println("---------------------------");

		for(String e:Colors) {
			System.out.println(e);
		}
	}

}
