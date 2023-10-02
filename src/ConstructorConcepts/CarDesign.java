package ConstructorConcepts;

import java.util.ArrayList;

public class CarDesign {

	String name;
	String Color;
	int Price;
	double mileage;
	char isAvialable;
	boolean iselectric;
	
	ArrayList<String> featuresList;
	
	
	
	public CarDesign(String name, String color) {
		super();
		this.name = name;
		Color = color;
	}



	public CarDesign(String name, String color, int price, char isAvialable) {
		super();
		this.name = name;
		Color = color;
		Price = price;
		this.isAvialable = isAvialable;
	}



	public CarDesign(String name, String color, int price, double mileage, char isAvialable, boolean iselectric,
			ArrayList<String> featuresList) {
		super();
		this.name = name;
		Color = color;
		Price = price;
		this.mileage = mileage;
		this.isAvialable = isAvialable;
		this.iselectric = iselectric;
		this.featuresList = featuresList;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
