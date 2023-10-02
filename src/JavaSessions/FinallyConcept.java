package JavaSessions;

public class FinallyConcept {

	public static void main(String[] args) {
		int p=10;
		
		try {
			int div=p/2;
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception is coming");
		}
		finally {
			System.out.println("in finally block");
		}
		System.out.println("Hello");
		System.out.println(getmarks("Sushma"));
	}
	

	public static int getmarks(String name) {
		
		if(name.equals("Sushma")) {
			try {
				int i=9/0;
			}
			catch(Exception e) {
				return 98;
			}
			finally {
				return 80;
			}
			}
			
		
		else if (name.equals("Sravan")) {
			return 10;
		}
		else  {
			System.out.println("Name is not found");
			return -1;
		}
	}

}
