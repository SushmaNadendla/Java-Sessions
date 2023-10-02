package ExceptionHandling;

public class ThrowsKeyword {
//Throws keyword is to pass the exception from one method to other method 
	public void method1()throws ArithmeticException {
		System.out.println("M1 method");
		method2();
	}
	public void method2() throws ArithmeticException{
		System.out.println("M2 method");
		method3();
	}
	public void method3() throws ArithmeticException{
		System.out.println("M3 method");
		method4();
	}
	public void method4() throws ArithmeticException{
		System.out.println("M4 method");
		int i=9/0;
	}
	public static void main(String[] args)throws ArithmeticException {
		ThrowsKeyword obj=new ThrowsKeyword();
		try {
		obj.method1();
		}
		catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception is coming ");
		}
		System.out.println("Say Bye");
	}
}
