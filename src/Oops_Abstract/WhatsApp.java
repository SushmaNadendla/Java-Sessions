package Oops_Abstract;

import JavaSessions.Application;

public class WhatsApp extends Application{
	@Override
	public void Serversetup() {
		System.out.println("DO the Server setup");
	}
	@Override
	public void dbsetup() {
	System.out.println("DO the DB setup");
	}
	@Override
	public void envsetup() {
		System.out.println("Do the env setup");
		}

}
