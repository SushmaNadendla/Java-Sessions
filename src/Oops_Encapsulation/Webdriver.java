package Oops_Encapsulation;

public class Webdriver {


	public void launchBrowser(String Browser) {
		if(Browser.equals("Chrome")) {
			launchchrome();
		}
		else if(Browser.equals("Firefox")) {
			launchchrome();
		}
		else {
			System.out.println("Please pass the correct browser");
		}
	}

	public void launchchrome() {
		System.out.println("Check Chrome Version");
		System.out.println("Check OS Version");
		System.out.println("Launch Chrome");
	}
	public void launchfirefox() {
		System.out.println("Check Firefox Version");
		System.out.println("Check OS Version");
		System.out.println("Launch Firefox");
	}
	

}
