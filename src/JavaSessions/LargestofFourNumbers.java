package JavaSessions;

public class LargestofFourNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a, b,c,d;
		a=700;
		b=600;
		c=500;
		d=400;
		if (a>b && a>c) {
		System.out.println("The largest number is a: "  +a);
		}
		
		else if (b>c && b>d) {
			System.out.println("The largest number is b: "  +b);
			}
		else if(c>d) {
			System.out.println("The largest number is c: "  +c);
		}
		else {
			System.out.println("The largest number is d: "  +d);
		}
	}

}
