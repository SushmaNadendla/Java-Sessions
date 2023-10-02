package Oops_Inheritance;

public class TestCar {

	public static void main(String[] args) {
		
		BMW B=new BMW();
	
		B.start();//Over ridden method
		B.stop();//inherited method
		B.refuel();
		B.AutoPark();//Child class method
		B.sunroof();
		
		Car C=new Car();
		C.start();// Parent class methods
		C.stop();
		C.refuel();
	//Top Casting: Child class object can be referred by parent class
		Car C1=new BMW();
		C1.start();//Child class method
		C1.stop();// Parent class methods
		C1.refuel();// Parent class methods
		
		
		//Multiple Inheritance cannot be allowed(Two parents)
		//Child can have only one parent class
		//Multi level inheritance is allowed(Grand parents)
		//cannot override the static methods because static methods are never related to object
		//Multiple inheritance is called Diamond problem
		Truck T=new Truck();
		T.Truck();
	}

}
