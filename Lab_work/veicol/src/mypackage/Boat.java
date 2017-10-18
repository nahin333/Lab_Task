package mypackage;

public class Boat extends Water{
	public double speed()
	{
		System.out.println("speed in water  : ");
		return 10;
	}
	public boolean isRunning()
	{
		System.out.println("i(boat)can run on water");
		return true;
	}
	public void boatFunc()
	{
		System.out.println("I am a boat..");
	}

}
