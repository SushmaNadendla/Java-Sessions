package ExceptionHandling;

public class TryCatchConcept {

	public static void main(String[] args) {
		System.out.println("Test method A");
		System.out.println("Test method B");
		System.out.println("Test method C");
		//try catch block:
		try {
		int i=9/0;
		//once it finds the exception than it will not execute the try block it will directly jump to catch block
		//Parent of Exception class is throwable class
		//Two child classes for throwable class: Exception and Error
		//Throwable parent is object
		System.out.println("Hello");
		}
		catch(ArithmeticException e) {
			//catch block will be executed only if there is an exception in try block
			System.out.println("Some exception is coming ");
			e.printStackTrace();
		}
		System.out.println("Test method D");
		System.out.println("Test method E");
		System.out.println("Test method F");

	}

}
