package JavaSessions;

public class LargestofThreeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a, b,c;
		a=25;
		b=78;
		c=87;
		if (a>b && a>c) {
		System.out.println("The largest number is "  +a);
		}
		
		else if (b>c) {
			System.out.println("The largest number is "  +b);
			}
		else {
			System.out.println("The largest number is "  +c);
		}
		
}
}
