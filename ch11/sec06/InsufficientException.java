package ch11.sec06;

// 일반 예외로 선언
public class InsufficientException extends Exception {

	// 두 개의 생성자 선언
	public InsufficientException() {

	}

	public InsufficientException(String message) {
		super(message);

	}

}
