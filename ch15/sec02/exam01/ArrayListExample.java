package ch15.sec02.exam01;

// 게시판
import java.util.ArrayList;
import java.util.List;
// import java.util.*; : import가 많을때 사용(3개 이상)

public class ArrayListExample {

	public static void main(String[] args) {
		
		// ArrayListExample 컬렉션 생성
		List<Board> list = new ArrayList<>();

		// 객체 추가
		list.add(new Board("제목1", "내용1", "글쓴이1")); // 레코드1
		list.add(new Board("제목2", "내용2", "글쓴이2")); // 레코드2
		list.add(new Board("제목3", "내용3", "글쓴이3")); // 레코드3 ...
		list.add(new Board("제목4", "내용4", "글쓴이4"));
		list.add(new Board("제목5", "내용5", "글쓴이5"));

		// 저장된 총 객체 수 얻기 -> 총 객체수를 얻으면 좋은 점: List(record)가 배열 형태로 -> Page를 알 수 있음
		int size = list.size();
		System.out.println("총 객체 수: + size");
		System.out.println();

		// 특정 인덱스의 객체 가져오기 -> 상세보기
		Board board = list.get(2);
		System.out.println(board.getSubject() + "\t" + board.getContent() + "\t" + board.getWriter()); // 상세 보기를 하겠다는 것.

		System.out.println();

		// 모든 객체를 하나씩 가져오기
		for (int i = 0; i < args.length; i++) {
			Board b = list.get(i);
			System.out.println(b.getSubject() + "\t" + board.getContent() + "\t" + board.getWriter());
		}
		System.out.println();

		// 모든 객체를 하나씩 가져오기 -> 제목만 가져오기 - 목록보기 (간단히)
		/*
		 * for (int i = 0; i < args.length; i++) { Board b = list.get(i);
		 * System.out.println(b.getSubject();
		 */

		// 객체 삭제 -> 끝에서부터 삭제해야함
		list.remove(2);
		list.remove(2);

		// 향상된 for 문으로 모든 객체를 하나씩 가져오기
		for (Board b : list) {
			System.out.println(b.getSubject() + "\t" + board.getContent() + "\t" + board.getWriter());
		}

	}

}
