package Autoboxing;

public class AutoBoxing {
	
	//This is process through which primitive data-type is converted into object.
	
	public static void main(String[] args) {
		
		int a = 14;           //it is primitive type
		//now we are converting it into object explicitly
		Integer obj = new Integer(a);
		//through Autoboxing
		Integer obj1 = a;
		Integer obj2 = a;
		
		System.out.println(a);
		System.out.println(obj);
		System.out.println(obj1);
		System.out.println(obj2);
		
	}

}
