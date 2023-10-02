package JavaSessions;

public abstract class Application {
	
	//all methods are abstract in nature
	//no non abstract methods
	
	public abstract void Serversetup();
	public abstract void dbsetup();
	public abstract void envsetup();
	
	public void UILayerComponents() {
		System.out.println("Application UI Layer Components");
	}

}
