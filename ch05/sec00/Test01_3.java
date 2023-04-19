// calculator2
package ch05.sec00;

public class Test01_3 {

	public static void main(String[] args) {
		
		int i=10;
		int j=2;
		int t='+';
		String panden =" ";
		int result = calculate(i, j, 't');
		
		if (t =='+')
				panden="덧셈";
		else if (t =='-')
				panden="뺄셈";
		else if (t =='*')
				panden="곱셈";
		else
				panden="나눗셈";
	 	
	 	
		System.out.println("두 수의 "+ panden +"의 결과 : "+ result);
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
