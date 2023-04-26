package ch07.sec10.exam01;

public class SmartPhone extends Phone {
	
	// 생성자 선언
	public static String owner;
	
	// Phone 생성자 호출
	SmartPhone(String String) {
		super(owner);
	}
	
	// 메소드 선언
	void inernetSearch() {
		System.out.println("인터넷 검색을 합니다.");
	}

}
