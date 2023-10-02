package WebDriverArchi;



public class GoogleAppTest {
static WebDriver driver;
	public static void main(String[] args) {
		//ChromeDriver driver=new ChromeDriver();

		//FirefoxDriver driver=new FirefoxDriver();
		//top casting
		String browser="Chrome";
		if(browser.equals("Chrome")) {
			driver=new ChromeDriver();
		}
		else if (browser.equals("Firefox")) {
			driver=new FirefoxDriver();
		}else if (browser.equals("Safari")) {
			driver=new Safari();
		}
		else {
			System.out.println("Please pass the correct browser");
		}
		
		driver.get("http://google.com");
		driver.gettitle();
		driver.getpageurl();
		driver.findElement("username");
		driver.quit();
		
	}

}
