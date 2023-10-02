package JavaSessions;

public class PaymentsMethod {
//can not create a method inside method
	public static void main(String[] args) {
		//create the object:
		PaymentsMethod Pay=new PaymentsMethod();
		Pay.UPI();
		Pay.Internetbanking("Sushma", "1234");
		Pay.Card(9004,233);

	}
	//1. no input and no return
	//void does not return any value
	//return type: void
	public void UPI() {
		System.out.println("This payment method is done my UPI");
	}
	//2.no input but some return type
	//return type: int ,String,
	public String Internetbanking(String username,String pwd) {
		
		String login="true";
		System.out.println("Login is successfull");
		return login;
	}
	//3.some input and some return
	public int Card(int mobile,int cvv) {
		System.out.println("Payment is done through card");
		int z= mobile+ cvv;
		return z;
	}
}