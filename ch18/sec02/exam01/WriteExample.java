package ch18.sec02.exam01;

// 바이트 출력 스트림
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample {

	public static void main(String[] args) {
		try {									// 실행 전 C:/TEMP 디렉토리 있어야 함
			OutputStream os = new FileOutputStream("C:/temp/test1.db"); 

			byte a = 10;
			byte b = 20;
			byte c = 30;

			os.write(a);
			os.write(b);
			os.write(c);

			os.flush();
			os.close();		// 출력 스트림을 닫아 사용한 메모리를 해제
		} catch (IOException e) {
			e.printStackTrace();	// Exception: 어떤 오류가 발생했는지 알려줌

		}

	}

}
