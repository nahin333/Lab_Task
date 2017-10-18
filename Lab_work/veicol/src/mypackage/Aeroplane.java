package mypackage;

public class Aeroplane extends Air{
	
	public double speed()
	{
		System.out.println("my speed in air  : ");
		return 300;
	}
	public boolean isRunning()
	{
		System.out.println("i(aeroplane) can run on air");
		return true;
	}
	
	public void aeroplaneFunc()
	{
		System.out.println("I am an aeroplane..");
	}

}
