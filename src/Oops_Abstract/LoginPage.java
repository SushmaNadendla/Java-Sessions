package Oops_Abstract;

public class LoginPage extends Page{

	public LoginPage() {
		System.out.println("LoginPage constructor method");
	}
	@Override
	public void title() {
		System.out.println("LoginPage title method");
		}
	@Override
	public void url() {
		System.out.println("LoginPage url method");
	}
	@Override
	public void loading() {
		System.out.println("LoginPage Loading method");
		}

	public void dologin(String un,String Pwd) {
		System.out.println("Login with :" +un + Pwd);
	}
	
	public void dologin(String un,String Pwd,String email) {
		System.out.println("Login with :" +un + Pwd +email);
	}
	public static  void logo() {
		System.out.println("Page Logo method");
	}
}
