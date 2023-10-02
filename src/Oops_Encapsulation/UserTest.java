package Oops_Encapsulation;

public class UserTest {

	public static void main(String[] args) {
		User user=new User();
		//Can access them using 3 ways
		//1.directly calling them through object created
		user.name="Bhanvitha";
		System.out.println(user.name);
	//2. using constructor
	User U1=new User("Deepa",38,100);
	    System.out.println(U1.name+" "+U1.age+" "+U1.id);
	//3. using getter and setter
	    User U2=new User();
	    U2.setname("Pushpa");
	    U2.setage(39);
	    U2.setid(300);
	    System.out.println(U2.getname()+" "+U2.getage()+" "+U2.getid());
	    
}
}
