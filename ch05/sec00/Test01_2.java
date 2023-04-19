// calculator
package ch05.sec00;

public class Test01_2 {

	public static void main(String[] args) {
		
		int i=10;
		int j=2;
		int t='+';
		
		int result = calculate(i, j, 't');
		
		if (t =='+')
				System.out.println("두 수의 덧셈의 결과 : "+result);
		else if (t =='-')
				System.out.println("두 수의 뺄셈의 결과 : "+result);
		else if (t =='*')
				System.out.println("두 수의 곱의 결과 : "+result);
		else
				System.out.println("두 수의 나눗셈의 결과 : "+result);
	 	
	 	
		System.out.println("연산의 결과값 : " + result);
		
		
	}
	static int calculate(int a, int b, char c) {
		switch(c) { 
		case '+' : 
			return a+b;
		case '-' : 
			return a-b;
		case '*' : 
			return a*b;
		case '/' : 
			return a/b;
		default : 
			return 0;
		
		}

	}

}
