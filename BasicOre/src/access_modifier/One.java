package access_modifier;

import access_modifier.A.Two;

public class One {
	private String privateVar = "I am Private";
	public int eid = 10;
	public String name = "sanjay";

	public static void main(String[] args) {
		One one = new One();// parent class object
		Ek ek = new Ek();
		Two two = new Two();
		
		//Four f = new Four(); we cannot class four object becuse that is default
		//in java only those class has public which has dot class file
		System.out.println("Access from class :" + one.eid);
		System.out.println("Access from class :" + one.name);

	}

	void usePrivateVariable() {
		System.out.println("Use method block to call private method outside the class");

	}
}

class Ek extends One {
	{
		One one = new One();

		System.out.println("Access from sub class :" + one.eid);
		one.usePrivateVariable();
	}

}

class Six extends Two {

	{
		 
		System.out.println(z);
	}
}
