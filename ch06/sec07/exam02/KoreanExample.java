package ch06.sec07.exam02;

public class KoreanExample {

	public static void main(String[] args) {

		// Korean 객체 선언
		Korean01_1 k1 = new Korean01_1("박자바", "011225-1234567");
		
		// Korean 객체 데이터 읽기
		System.out.println("k1.nation : " +k1.nation);
		System.out.println("k1.name : " +k1.name);
		System.out.println("k1.ssn : " +k1.ssn);
		System.out.println();
	
	
	
		// Korean 객체 선언
		Korean01_1 k2 = new Korean01_1("김자바", "930525-0654321");
			
		// Korean 객체 데이터 읽기
		System.out.println("k1.nation : " +k2.nation);
		System.out.println("k1.name : " +k2.name);
		System.out.println("k1.ssn : " +k2.ssn);
	
	}
}
