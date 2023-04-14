package ch02.sec06;

public class StringExample {
	public static void main(String[] args) {
		
 // String : import 안해도 됨		
		String name = "홍길동";
		String job = "프로그래머";
		System.out.println(name);
		System.out.println(job);
		
		String str = "나는 \"자바\"를 배웁니다.";   // "자바\" : 문장 속 " "
		System.out.println(str);
		
		str = "번호\t이름\t직업 ";            //t : tab 키를 누른 것과 같음
		System.out.println(str);

	System.out.println("나는\n");
	System.out.println("자바를\n");   // ("자바를\n사용하여\n객체지향\n"); : 문장 속 줄바꾸기
	System.out.println("배웁니다.");
	}
}
