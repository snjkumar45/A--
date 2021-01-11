package access_modifier.A;

import access_modifier.One;

public class Two {
	protected int z=100;
	private int a=101;
	One one=new One();
	{
		System.out.println("access from subpackage class"+one.eid);
		System.out.println("access from subpackage class"+one.name);
		
		System.out.println("this is private :"+a);
	}
	public static void main(String[] args) {
		Four f=new Four();
	}

}
 class Four extends One{
	Two t=new Two();
	{
		System.out.println("this is protected"+t.z);
	}
}
 