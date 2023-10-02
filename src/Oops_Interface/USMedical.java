package Oops_Interface;

public interface USMedical extends WHO,UN{
	//Interface cannot have method body 
	//only method prototype
	//only method declaration
	//cannot create object of interface 
	//all variables in interface are static and final by default
	//Child class should implement the parent interface or abstract methods 
	//100% abstraction in interface
	int minfee=10;
	//Abstract Methods: does not have method body
	public void orthoservices() ;
	public void physioservices();
	public void cardioservices();
	public void services911();
	public void totalDoctors(int Count);
	//After JDK 1.8 
    //1. We can have static methods in interface with method body
	public static void UShospitalAdmin() {
 	   System.out.println("US Hospital Admin method");
 	    }
	//2. can have default method
	default void billing() {
		System.out.println("Default billing method");
	}
}
