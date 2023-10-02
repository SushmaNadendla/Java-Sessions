package JavaSessions;

public class StaticArray_Assignment {

	public static void main(String[] args) {
//		String Players[]=new String[4];
//		Players[0]="Sachin";
//		Players[1]="Virat";
//		Players[2]="Ganguly";
//		Players[3]="Dhoni";
//		Players[4]="Sewag";

		Object Player1[]=new Object[6];
		Player1[0]="Sachin ";
		Player1[1]=49;
		Player1[2]=" Chennai Super Kings";
		Player1[3]= 1973;
		Player1[4]=" M ";
		Player1[5]= 18426;
		
		for(Object e:Player1) {
			System.out.print(e);
		}
		
		System.out.println();
		
	
		
		Object Player2[]=new Object[6];
		Player2[0]="Virat ";
		Player2[1]=34;
		Player2[2]=" Kolkata Knight Riders";
		Player2[3]= 1988;
		Player2[4]=" M ";
		Player2[5]= 106;
		
		for(Object e1:Player2) {
			System.out.print(e1);
		}
		
		System.out.println();
		
		Object Player3[]=new Object[6];
		Player3[0]="Dhoni ";
		Player3[1]=41;
		Player3[2]=" Kolkata Knight Riders";
		Player3[3]= 1981;
		Player3[4]=" M ";
		Player3[5]= 120;
		
		for(Object e2:Player3) {
			System.out.print(e2);
		}
		System.out.println();
	}

}
