package access_modifier.B;

import access_modifier.One;
import access_modifier.A.Two;

public class Three {
public static void main(String[] args) {
	Teen teen=new Teen();
	Two two=new Two();
	
	
}
}
class Teen extends Two{
	One one=new One();
	{
		System.out.println(one.eid);
		System.out.println(one.name);
	}
}