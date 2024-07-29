package Unboxing;

public class UnBoxing {
	
	public static void main(String[] args) {
		
		//suppose value is given in object form
		Integer obj = new Integer(15);
		
		//we want to convert Object into Integer explicitly
		int a = obj.intValue();
		
		//through Unboxing method
		int a1 = obj;
		
		System.out.println(obj);
		System.out.println(a);
		System.out.println(a1);
	}

}
