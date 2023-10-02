package Oops_Abstract;

public class ApplicationTesting {

	public static void main(String[] args) {
		WhatsApp WA=new WhatsApp();
		WA.dbsetup();
		WA.envsetup();
		WA.Serversetup();
		WA.UILayerComponents();
	}
}
