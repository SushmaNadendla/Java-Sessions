package JavaSessions;

import java.util.ArrayList;

public class ArrayListInsertAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> Family=new ArrayList<String>();
		Family.add( "Suju");
		Family.add( "Subbu");
		Family.add( "Thrishu");
		Family.add( "Harsith");
		Family.add( "Abbu");
		Family.add( "Gyan");
		System.out.println(Family.get(0));
		System.out.println(Family.get(5));
		Family.add(0, "Ram");
		Family.add(6, "Sita");
		System.out.println(Family.get(0));
		System.out.println(Family.get(6));
		System.out.println(Family);
	}

}
