package variadic;

public class VariadicClass {
	double average(double...lst)
	{
		double s = 0.0;
		for (double x: lst)
		{
			s += x;
		}
		return s/lst.length;
	}
}
