package mypackage;

public class Car extends Land{
	public double speed()
	{
		System.out.println("my speed in land  : ");
		return 120;
	}
	public boolean isRunning()
	{
		System.out.println("i(car) can run on land");
		return true;
	}
	public void carFunc()
	{
		System.out.println("I am a car..");
	}

}
