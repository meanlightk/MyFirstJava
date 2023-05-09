package ch17.sec03;


// 파이프라인
import java.util.Arrays;
import java.util.List;
// import java.util.stream.IntStream; - 방법1
// import java.util.stream.Stream; 	  - 방법1

public class StreamPipeExample {

	public static void main(String[] args) {

		List<Student> list = Arrays.asList(new Student("홍길동", 10), new Student("신용권", 20), new Student("유미선", 30)

		);

		// 방법1
	/*	Stream<Student> studentStream = list.stream();

		// 중간처리(학생 객체를 점수로 매핑)
		IntStream scoreStream = studentStream.mapToInt(student -> student.getScore());

		// 최종처리 (평균 점수)
		double avg = scoreStream.average().getAsDouble();
    */
		
		
		// 방법2 -> 방법1의 내용을 간단하게 만든 것 (파이프라인)
		double avg = list.stream().mapToInt(Student -> Student.getScore()).average().getAsDouble();

		System.out.println("평균 점수: " + avg);
	}

}
