package ch03.sec02;

public class OverflowUnserflowExample {

	public static void main(String[] args) {
	
		final byte MAX = 127;
		final byte MIN = -128;
		final String RED = "#ff000";
		
		System.out.println("MIN=" + MIN);
		
		byte i = 17;
		System.out.println(i);
		
		i = 127;
		System.out.println(i);
		
		i = -128;
		System.out.println(i);		
	}

}