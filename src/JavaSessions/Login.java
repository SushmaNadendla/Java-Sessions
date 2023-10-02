package JavaSessions;

public class Login {

	String username;
	String password;
	String url;
	String title;
	
	public static void main(String[] args) {
		
		Login googlelogin=new Login();
		googlelogin.username="Sushma";
		googlelogin.password="Test123";
		googlelogin.url="https://www.google.com/";
		googlelogin.title="Google Main Page";
		System.out.println(googlelogin.username);
		System.out.println(googlelogin.password);
		System.out.println(googlelogin.url);
		System.out.println(googlelogin.title);
		System.out.println("-----------------------------");
		
		
		Login amazonlogin=new Login();
		amazonlogin.username="Simmy";
		amazonlogin.password="123Bar";
		amazonlogin.url="https://www.amazon.com/";
		amazonlogin.title="Amazon Login Page";
		
		System.out.println(amazonlogin.username);
		System.out.println(amazonlogin.password);
		System.out.println(amazonlogin.url);
		System.out.println(amazonlogin.title);
		System.out.println("-----------------------------");
	}

}
