package Oops_Encapsulation;

public class TestComp {

	public static void main(String[] args) {
			Company c1=new Company();
			c1.name="Infor";
			
			c1.empcount=2000;
			c1.getceoname();
			
			Employee e1=new Employee();
			e1.setsalary(20000);
			System.out.println(e1.getsalary());
			e1.setdetails(23, "Bangalore");
			System.out.println(e1.getdetails());
			System.out.println(e1.getdetails1());

	}

}
