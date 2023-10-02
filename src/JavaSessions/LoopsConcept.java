package JavaSessions;

public class LoopsConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. While loop:
		//Print 1 to 10 or 100
		int i=1;//Initialization
		while(i<=5) {//Condition check
			System.out.println(i);
			//i=i+1 Increment or Decrement
			i++;
		}
		
		//2. For loop
		for(int p=0;p<=10;p++) {
			System.out.print(p);
			
		}
			
			//Print a to z
			for(char c='a';c<='z';c++) {
				System.out.println(c);
			}
			
			System.out.println("---------------------------");
			
			for(double d=1.1; d<=10;d++) {
				System.out.println(d);
			}
			System.out.println("---------------------------");
			
			//3. do while loop
			int p=1;
			do {
				System.out.println(p);
				p++;
				
			}
			while (p<=10);
			System.out.println("---------------------------");
			
			//4.for each loop
			int marks[]=new int[3];
			marks[0]=100;
			marks[1]=200;
			marks[2]=300;
			for(int e:marks) {
				System.out.println(e);
			}
			
			//5.for each loop method
			//6.Streams JDK 8
			
	}
	

}
