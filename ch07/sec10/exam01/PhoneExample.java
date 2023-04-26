package ch07.sec10.exam01;

public class PhoneExample {

	public static void main(String[] args) {
		// Phone phone = new Phone(); -> Phone의 생성자=>Phone(String owner)

		SmartPhone smartPhone = new SmartPhone("홍길동");

		smartPhone.turnOn();		// Phone의 메소드
		smartPhone.inernetSearch();
		smartPhone.turnOff();		// Phone의 메소드

	}
}