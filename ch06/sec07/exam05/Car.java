package ch06.sec07.exam05;

public class Car {

	// 필드 선언
		String company = "현대자동차";
		String model;
		String color;
		int maxSpeed;
	
		//생성자 선언 -> 필드 없는 생성자
		public Car() {
			super();
			
		}
		
		public Car(String model) {
			super();
			this.model = model;
		}

		// 모델, 컬러
		public Car(String model, String color) {
			super();
			this.model = model;
			this.color = color;
		}

		// 모델, 컬러, 스피드
		public Car(String model, String color, int maxSpeed) {
		super();
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		
		}
	}
