package JavaSessions;

public class StaticArrayList {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i[]=new int[3];
		
		i[0]=5;
		i[1]=10;
		i[2]=15;
	
		System.out.println("Li= " +0);
		int len=i.length;
		System.out.println("length =" +len);
		System.out.println("Hi =" +(len-1));
		
		System.out.println(i[0]);
		System.out.println(i[2]);
		
		System.out.println("-----------------------------------");
		
		//print the values from the Array
		for(int k=0; k<=2;k++) {
		System.out.println(i[k]);
		}
		System.out.println("-----------------------------------");
		//for each loop
		for (Integer e:i) {
			System.out.println(e);
		}
		
		//double array 
		double d[]=new double [2];
		d[0]=12.11;
		d[1]=23.24;
		System.out.println(d[0]);
		
		//char array
		char Letters[]= new char[2];
		Letters[0]='A';
		Letters[1]='P';
		System.out.println(Letters[1]);
		
		
		//string array
		String lang[]=new String[2];
		lang[0]="Python";
		lang[1]="Java";
		for(String e:lang) {
			System.out.println(e);
		}
		for(int p=0;p<=1;p++) {
			System.out.println(lang[p]);
		}
		System.out.println("-----------------------------------");
		//Object Array
		Object ob[]=new Object[4];
		ob[0]="Sushma";
		ob[1]=32;
		ob[2]='F';
		ob[3]=122609;
		
		for(Object e: ob) {
			System.out.println(e);
		}
	}

}
