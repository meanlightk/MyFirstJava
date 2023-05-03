package ch13.sec03.exam01;

public class GenericExample {

	// 제네릭 메소드
	public static <T> Box<T> boxing(T t) {
		Box<T> box = new Box<T>();
		box.set(t);
		return box;
	}

	public static void main(String[] args) {

		// 제네릭 메소드 호출
		Box<Integer> box1 = boxing(100);
		int FintValue = box1.get();
		System.out.println("intValue");

		Box<String> box2 = boxing("홍길동");
		String strValue = box2.get(); // 헝가리언 표기법
		System.out.println("strValue");

	}

}
