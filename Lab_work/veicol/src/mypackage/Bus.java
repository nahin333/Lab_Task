package mypackage;

public class Bus extends Land{
	public double speed()
	{
		System.out.print("my speed in land  : ");
		return 60;
	}
	public boolean isRunning()
	{
		System.out.println("i(bus) can run on land");
		return true;
	}
	public void busFunc()
	{
		System.out.println("I am a car..");
	}

}
