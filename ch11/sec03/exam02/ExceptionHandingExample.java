package ch11.sec03.exam02;

// Exception : 문제를 발견할 수는 있지만, 구체적으로 알아낼 수는 없다.
public class ExceptionHandingExample {

	public static void main(String[] args) {

		String[] array = { "100", "1oo" };

		for (int i = 0; i <= array.length; i++) {
			try {
				int value = Integer.parseInt(array[i]);
				System.out.println("array[" + i + "]: " + value);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("배열 인덱스가 초과됨: " + e.getMessage());
			} catch (Exception e) {
				System.out.println("실행에 문제가 있습니다.");

			}
		}
	}

}
