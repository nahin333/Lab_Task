package mypackage;

public class Land implements Vehicle{
	
	@Override
	public double speed()
	{
		System.out.println("speed in land  : ");
		return 100.50;
	}
	@Override
	public boolean isRunning()
	{
		return true;
	}

}
