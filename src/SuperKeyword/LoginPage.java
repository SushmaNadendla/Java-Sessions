package SuperKeyword;

public class LoginPage extends Page{
	public LoginPage(int time) {
		super(time);//Super keyword should be the first statement in the default constructor
		System.out.println("Login Page Constructor");
	}

	int loadTime =20;

	void loading() {
		System.out.println("login page load time is : " +loadTime);
		System.out.println("page load time is : " +super.loadTime);
		PageTitle();
		super.PageTitle();
		
	}
	public void PageTitle() {
		System.out.println("Login Page Title method is called");
	}
}
