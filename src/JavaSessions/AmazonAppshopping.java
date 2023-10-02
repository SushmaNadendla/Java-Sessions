package JavaSessions;

public class AmazonAppshopping {

	public static void main(String[] args) {
		AmazonApp shop=new AmazonApp();
		shop.login(889723, 0345)
		    .search("Iphone 14pro max")
		    .addtocart("Iphone 14pro max")
		    .payment("800 00 3434 8090")
		    .logout();
		
		System.out.println("--------------------------");
		shop.login("sushmanadendla@gmail.com", "Sushma123")
	    	.addtocart("Iwatch 6 series")
	    	.payment("8090 5467 5876 900")
	    	.logout();
		System.out.println("--------------------------");
		shop.login("sushmanadendla@gmail.com", "Sushma123")
			.logout();
	}

}
