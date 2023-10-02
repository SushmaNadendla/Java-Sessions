package ConstructorConcepts;

import java.util.ArrayList;

public class TestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CarDesign car_alto= new CarDesign("Alto", "Blue");
		System.out.println(car_alto.name+" "+ car_alto.Color);
		
		CarDesign car_BMW= new CarDesign("BMW 520D","Red",90, 'Y');
		System.out.println(car_BMW.name+" "+ car_BMW.Color+" "+ car_BMW.Price+" "+car_BMW.isAvialable);
		
		ArrayList<String> audiQ5features=new ArrayList<String>();
		audiQ5features.add("Auto Parking");
		audiQ5features.add("Turbo Q Engine");
		audiQ5features.add("Sun roof");
		audiQ5features.add("Rear Camera");
		audiQ5features.add("Lane Assist");
		
		CarDesign audiQ5=new CarDesign("Audi","White",85,14.4,'Y',false,audiQ5features);
		System.out.println(audiQ5.name+" "+audiQ5.Color+" "+audiQ5.Price+" "+audiQ5.featuresList);
		
	
	}


}
