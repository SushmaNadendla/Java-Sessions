package Oops_Encapsulation;

public class User {

	public String name;
	public int age;
	public int id;
	public User(String name, int age, int id) {
		super();
		this.name = name;
		this.age = age;
		this.id = id;
	}
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name=name;
	}
	public int getage() {
		return age;
	}
	
	public void setage(int age) {
		this.age=age;
	}
	public int getid() {
		return id;
	}
	public void setid(int id) {
		this.id=id;
	}
}
