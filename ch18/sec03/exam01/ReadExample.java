package ch18.sec03.exam01;

// 바이트 입력 스트림
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample {

	public static void main(String[] args) {

		try {
			InputStream is = new FileInputStream("C:/temp/test1.db");

			while (true) {
				int data = is.read();
				if (data == -1) // BOF, EOF
					break;
				System.out.println(data);
			}
			is.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
			/*
			 * } catch (Exception e) { e.printStackTrace();
			 *  또 다른 에러가 발생할 수 있는 상황에 작성
			 */
		}

	}
}
