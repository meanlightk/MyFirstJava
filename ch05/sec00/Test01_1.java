package ch05.sec00;

public class Test01_1 {

	public static void main(String[] args) {
		
		int sum = add(3,5);
		int minus = nsub(3,5);
		
		System.out.println("두 수의 합: " + sum);
		System.out.println("두 수의 차: " + minus);
		
	}
	static int add(int a, int b) {
		return a+b;
	}
	static int nsub(int a, int b) {
		return a-b;
	}

}
