package mypackage;

public class NormalClass {
	
	public void doSomething(Vehicle ob)
	{
		System.out.println("\n");
		if (ob instanceof Car)
		{
			Car object = (Car) ob;
			object.carFunc();
		}
		else if (ob instanceof Bus)
		{
			Bus object = (Bus) ob;
			object.busFunc();
		}
		else if (ob instanceof Ship)
		{
			Ship object = (Ship) ob;
			object.shipFunc();
		}
		else if (ob instanceof Boat)
		{
			Boat object = (Boat) ob;
			object.boatFunc();
		}
		else if (ob instanceof Aeroplane)
		{
			Aeroplane object = (Aeroplane) ob;
			object.aeroplaneFunc();
		}
		else if (ob instanceof Helicopter)
		{
			Helicopter object = (Helicopter) ob;
			object.helicopterFunc();
		}		
	}

}
