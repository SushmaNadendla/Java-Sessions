package JavaSessions;

public class StringConcatination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="My name is SUSHMA";
		System.out.println(s1);
		
		String s2="4000";
		System.out.println(s2);
		
		double d1=12.22;
		double d2=10.30;
		
		int a=200;
		int b=400;
		
		String x="Hello";
		String y="Dad";
		
		System.out.println(a+b);// addition of integers
		System.out.println(x+y);// addition of two strings
		
		
		System.out.println(a+b+x+y);// addition of integers plus strings
		System.out.println(x+y+a+b);//execution will be left to right
		
		System.out.println(x+y+(a+b));//Arithmetic operation
		
		System.out.println("the value of a is : " +a);
		System.out.println("the value of a is : " +b);
		
		System.out.println("the sum of a and b is : " +(a+b));
		
		System.out.println(d1+d2);
		System.out.println(a+b+d1+d2);
		System.out.println(a+b+d1+d2+x+y);

	
		System.out.println(x+y+a+b+d1+d2);
		
		char c='a';
		char c1='b';
		System.out.println(c+c1);//ascii number will be added a=97 b=98
		System.out.println(c);
		System.out.println(c1-c);
		
		System.out.println(x+c);
	}

}
