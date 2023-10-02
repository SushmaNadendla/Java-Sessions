package SuperKeyword;

public class Page {
	public Page() {
		System.out.println("Page Constructor");
	}
	public Page(int	time) {
		System.out.println("Page Constructor with time :" +time);
	}
	int loadTime =30;
	public void PageTitle() {
		System.out.println("Page Title method is called");
	}
}
