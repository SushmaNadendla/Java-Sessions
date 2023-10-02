package Oops_Interface;

public class OxfordgroupofCollege implements USOxford,UKOxford,IndiaOxford{

	@Override
	public void Engineering() {
		System.out.println("India-Engineering method is called");
	}

	@Override
	public void BSC() {
		System.out.println("India-BSC method is called");
	}

	@Override
	public void Commerece() {
		System.out.println("India-Commerece method is called");
	}

	@Override
	public void Arts() {
		System.out.println("India-Arts method is called");
		}

	@Override
	public void BusinessLaw() {
		System.out.println("UK-Business Law method is called");
		}

	@Override
	public void MBA() {
		System.out.println("UK-MBA method is called");
	}

	@Override
	public void MasterofScience() {
		System.out.println("US- Master of Science is called");
		
	}

	@Override
	public void BusinessManagement() {
		System.out.println("US- Business Management is called");
	}

	@Override
	public void StudentTest() 
		{
			System.out.println("University Student Test method");
		}
		
	
	}

	

