package Oops_Encapsulation;

public class Company {

	public String name;
	public int empcount;
	private int shareprice;
	
	public String getceoname() {
		return "TOM";
	}
	
	private int totalshareprice() {
		return 1000;
	}
	public static void main(String[] args) {
		
		Company obj= new Company();
		obj.name="IBM";
		obj.empcount=600;
		obj.shareprice=500;
		obj.getceoname();
		obj.totalshareprice();
		System.out.println(obj.name+" "+obj.empcount+" "+obj.shareprice+" "+obj.getceoname()+" "+obj.totalshareprice());
		
	}

}
