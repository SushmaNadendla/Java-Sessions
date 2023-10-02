package Oops_Abstract;

public abstract  class Page {
//cannot create object of abstract class
	
	public Page() {
		System.out.println("Page Constructor method");
	}
	public abstract void title();
	public abstract void url();
	public abstract void loading();
	
	public void header() {
		System.out.println("Page Header method");
		
	}
	public static  void logo() {
		System.out.println("Page Logo method");
	}
}
