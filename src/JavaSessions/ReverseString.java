package JavaSessions;

public class ReverseString {

	public static void main(String[] args) {
//		String Str="sushma nadendla";
//		System.out.println(Str.length());
//		

	//	System.out.println(rev);
		
//		System.out.println(reversestring(null));
		
		String str="Automation";
		StringBuffer sb=new StringBuffer(str);
		StringBuffer s1=sb.reverse();
		System.out.println(sb.reverse());
	}

	public static String reversestring(String value) {
		int len=value.length();
		
//		if(value==null) {
//			System.out.println("Null value is paasses");
//			return null;
//		}
		
		if(len==1) {
			return value;
		}
		String rev="";
		for(int i=len-1;i>=0;i--) {
			rev=rev + value.charAt(i);
			
		}
		return rev;
	}
}
