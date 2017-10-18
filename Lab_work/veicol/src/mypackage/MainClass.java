package mypackage;

public class MainClass {

	public static void main(String[] args) {
		
		 //code for varidic function...
		
		VariadicClass object = new VariadicClass();
		System.out.println("average1 : "+object.average(5.5,6.5,70.5));
		System.out.println("average2 : "+object.average(5.5,6.5,70.5,100.5,200.2));
		System.out.println();
		
		// code for variadic function ends here......
		
		Car ob1 = new Car();
		Bus ob2 = new Bus();
		Ship ob3 = new Ship();
		Boat ob4 = new Boat();
		Aeroplane ob5 = new Aeroplane();
		Helicopter ob6 = new Helicopter();
		
		
		NormalClass obb = new NormalClass();
		obb.doSomething(ob1);
		obb.doSomething(ob2);
		obb.doSomething(ob3);
		obb.doSomething(ob4);
		obb.doSomething(ob5);
		obb.doSomething(ob6);
		
		
		
	}

}
