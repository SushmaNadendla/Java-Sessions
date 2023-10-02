package JavaSessions;

public class IfElseCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="IE";
		//Nested if: It will consume lot of time as it will execute all the if statements 
		
		if (s1.equals("Chrome")) {
			System.out.println("Launch Chrome");
		}
		if (s1.equals("Firefox")) {
			System.out.println("Launch Firefox");
		}
		if (s1.equals("IE")) {
			System.out.println("Launch IE");
		}
		
		
		//if else if 
		
		if (s1.equals("Safari")) {
			System.out.println("Launch Safari");
		}
		else if (s1.equals("Firefox")) {
			System.out.println("Launch Firefox");
		}
		
		else if (s1.equals("Edge")){
			System.out.println("Launch Edge");
		}
		else {
			System.out.println("Please pass the correct browser");
		}
	}

}
