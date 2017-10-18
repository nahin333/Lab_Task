package mypackage;

public class Helicopter extends Air{
	public double speed()
	{
		System.out.println("my speed in air  : ");
		return 200;
	}
	public boolean isRunning()
	{
		System.out.println("i(helicopter) can run on air");
		return true;
	}
	
	public void helicopterFunc()
	{
		System.out.println("I am a helicopter..");
	}
}
