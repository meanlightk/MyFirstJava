package ch16.sec02.exam02;

public class Button {

	public static interface ClickListner {
		// 추상 메소드
		void onClick();
	}

	private ClickListner clickListner;

	public void setClickListner(ClickListner clickListner) {
		this.clickListner = clickListner;
	}

	public void click() {
		this.clickListner.onClick();
	}

}
