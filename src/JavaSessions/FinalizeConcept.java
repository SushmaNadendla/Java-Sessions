package JavaSessions;

import ConstructorConcepts.Employee;

public class FinalizeConcept {

	public static void main(String[] args) {
		FinalizeConcept obj=new FinalizeConcept();
		obj=null;
		

		
		System.gc();// is called in respective class
		System.out.println("Hello");

	}
	@Override
	public void finalize() {
		System.out.println("Finalize method is called by gc");
	}

}
