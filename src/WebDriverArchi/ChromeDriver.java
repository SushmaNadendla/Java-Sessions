package WebDriverArchi;

public class ChromeDriver implements WebDriver{

	public ChromeDriver() {
		System.out.println("Launch google chrome browser");
	}
	@Override
	public void get(String url) {
	System.out.println("launching url " +url);
	}

	@Override
	public void gettitle() {
		System.out.println("title is " +  "Google");
	}

	@Override
	public void getpageurl() {
	System.out.println("Url is " + "http://google.com");
	}

	@Override
	public void findElement(String locator) {
	System.out.println("find the element with " +locator);
	}

	@Override
	public void quit() {
		System.out.println("Quit browser");
	}

}
