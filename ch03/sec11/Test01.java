package ch03.sec11;

public class Test01 {

	public static void main(String[] args) {
		String a = "abc";              //내용은 같지만, 메모리 위치가 다름 => 결과 다름
		String b = new String("abc");  // new : 별도의 메모리 공간을 만들어라
		
		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(b));
		
		String c = "abc";             
		String d = "aabc";  
		
		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(b));
	}

}



	