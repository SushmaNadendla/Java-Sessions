package JavaSessions;

public class StringImmutable {

	public static void main(String[] args) {
		String s1="Sushma";
		String s2="sravan";
		String s3=s1.concat(s2);
		System.out.println(s1);
		System.out.println(s3);

		String s4="Sushma";
		String s5="Sushma";
		System.out.println(s4==s5);//different memory location and different objects
		System.out.println(s4.equals(s5));//will check the value
	}

}
