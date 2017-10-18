package mypackage;

public class Ship extends Water{
	public double speed()
	{
		System.out.println("speed in water  : ");
		return 25;
	}
	public boolean isRunning()
	{
		System.out.println("i(ship) can run on water");
		return true;
	}

	public void shipFunc()
	{
		System.out.println("I am a ship..");
	}
}
