package mypackage;

public class VariadicClass {
	double average(double...list)
	{
		double sum = 0.0;
		for (double x: list)
		{
			sum += x;
		}
		return sum/list.length;
	}
}
