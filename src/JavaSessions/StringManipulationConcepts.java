package JavaSessions;

public class StringManipulationConcepts {

	public static void main(String[] args) {
		
		String str="My name is Sushma Nadendla";
		System.out.println(str.length());
		
		int len=str.length();
		int li=0;
		System.out.println(li);
		int hi=len-1;
		System.out.println(hi);
		System.out.println(str.charAt(5));
		System.out.println(str.charAt(25));
		//System.out.println(str.charAt(28));//StringIndexOutOfBoundsException
		System.out.println(str.indexOf('s'));//first occurence of S
		System.out.println(str.indexOf('n',10 ));
		System.out.println(str.indexOf("name"));
		System.out.println(str.indexOf("Hello"));//-1
		
		String Message="welcome khusi";
		if(Message.indexOf("Khushi")>=0) {
			System.out.println("Khusi is correct message");
		}
		else {
			System.out.println("Khusi is wrong message");
		}
		System.out.println(Message.toUpperCase());
		System.out.println(Message.toLowerCase());
		//trim
		String S="    hello world   ";
		System.out.println(S);
		System.out.println(S.trim());
		
		String text="    9800";
		System.out.println(text.trim());
		
		//replace
		String dob="22-05-1990";
		System.out.println(dob.replace('-', '/'));
		
		String s1=" Hello Java and happy with Java";
		System.out.println(s1.replace("Java", "Python"));
		
		//contains
		
		String s2="My Hapiness is doing workouts";
		System.out.println(s2.contains("workouts"));
		if(s2.contains("Workouts")) {
			System.out.println("Good morning");
		}
		
		//concat
		String s11="Hello";
		String s12=" Selenium";
		System.out.println(s11.concat(s12).concat(" Test Automation"));
		
		//Comparison
		String s3="this is sushma";
		String s4="this is Nadendla";
		System.out.println(s3.equals(s4));
		System.out.println(s3.equalsIgnoreCase(s4));//ignores upper or lower case
		
		//substring
		String s5="this is my order id 9006";
		System.out.println(s5.substring(11));
		System.out.println(s5.substring(0, 16));
		System.out.println(s5.substring(17, 24));
		System.out.println(s5.substring(s5.indexOf("id")+3,s5.length()));
	
	//split
		
		String test="Subbu ;Abbu ;Thrishu ;Gyan ;Suju ;Harshith ";
		String arr[]=test.split(";");
		System.out.println(arr[0]);
	
		for (String e:arr) {
			System.out.print(e);
		}
	String Userdata="Sravan ; 36 ; Hamburg ;Germany ;9999 ; KPMG";
	String newarr[]=Userdata.split(";");
	
	for(String e:newarr) {
		System.out.println(e);
	}
	
	
	String data="xXTestxXxXJavaxXxXSessions";
	String dataArr[]=data.split("xX");
	System.out.println("0th value : "+dataArr[0]);
	System.out.println("1st value : "+dataArr[1]);
	System.out.println("2nd value : "+dataArr[2]);
	System.out.println("3rd value : "+dataArr[3]);
	
	
	String x="100";
	System.out.println(x+20);//10020
	
	int i=Integer.parseInt(x);
	System.out.println(i+20);//120
	
	
//	String y="200test";
//	System.out.println(y+20);
//	
//	int p=Integer.parseInt(y);//Number format exception
//	System.out.println(p+20);
	
	//String to double 
	
	String ds="12.33";
	System.out.println(ds+100);
	
	double d=Double.parseDouble(ds);
	System.out.println(d+100);
	
	
	
	
	
	
	
	
	
	
	}
	
	

}
