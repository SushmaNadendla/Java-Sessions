package JavaSessions;

public class IncrementAndDecrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Post increment
		int a=1;
		int b=a++;
		System.out.println(a);//2
		System.out.println(b);//1
		
		int c= -99;
		int d=c++;//execution is always left to right so c will be given to d first than c is incremented
		System.out.println(c);//-98
		System.out.println(d);//-99
		
		int h=-1000;
		int i=h++;
		System.out.println(h);
		System.out.println(i);
		
		
//Pre increment
		
		int m=100;
		int n=++m;
		System.out.println(m);//first it will increment the value and than increased value will be assigned to 
		System.out.println(n);
		
		int x=-99;
		int y=++x; 
		System.out.println(x);//-98
		System.out.println(y);
		
// Post Decrement
		int u=2;
		int w=u--;
		System.out.println(u);//first give the value of u to w than decrease the value by one 1
		System.out.println(w);//2 
		
		
//Pre Decrement
		int p=5;
		int q=--p;
		System.out.println(p);//4
		System.out.println(q);//4
	
		int total=100;
		System.out.println(total++);
		System.out.println(total);
		
		int balance=999;
		System.out.println(++balance);
		System.out.println(balance);
	
	}

}
