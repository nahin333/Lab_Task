package mypackage;

public class Air implements Vehicle{
	@Override
	public double speed()
	{
		System.out.print("speed in land  : ");
		return 100.50;
	}
	@Override
	public boolean isRunning()
	{
		return true;
	}
}
