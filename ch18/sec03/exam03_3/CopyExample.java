package ch18.sec03.exam03_3;

// 동영상 복사
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyExample {

	public static void main(String[] args) throws Exception {
		String originalFileName = "C:/temp/movie.mp4";
		String targetFileName = "C:/temp/movie2.mp4";

		InputStream is = new FileInputStream(originalFileName);
		OutputStream os = new FileOutputStream(targetFileName);

		byte[] data = new byte[1024];
		while (true) {
			int num = is.read(data);
			if (num == -1)
				break;
			os.write(data, 0, num);

		}
		os.flush();
		os.close();
		is.close();

		System.out.println("복사가 잘 되었습니다.");

	}

}
