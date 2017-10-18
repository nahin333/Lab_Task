package mypackage;

public class MainClass {

	public static void main(String[] args) {
		
		 
		
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
