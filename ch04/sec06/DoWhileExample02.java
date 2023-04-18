package ch04.sec06;

import java.util.Scanner;

public class DoWhileExample02 {
	
	
	// - id : ezen / password: 12345 → 아이디가 맞아야 비밀번호로 넘어가는 것임-3번 이내에 통과하면 ok, 초과하면 get out! 출력되는 프로그램 작성
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("아이디와 패스워드를 입력하세요.");
		String strId = "";
		String strPwd = "";

		System.out.print("아이디: ");
		strId = scanner.nextLine();
		
		if(!"ezen".equals(strId)) {
			System.out.println("아이디가 틀렸습니다.");
			return;
		}
		for(int i=0; i<3; i++) {
			System.out.println("비밀번호를 입력하세요.");
			strPwd = scanner.nextLine();
			
			if("12345".equals(strPwd)) {
				System.out.println("OK");
				break;
			}
			else if(i != 2) 
				System.out.println("비밀번호가 틀렸습니다. (남은 재입력 횟수3회) 횟수:" + (i+1));			
			 else {
				System.out.println("Get Out!");
			 }
	System.out.println();
	System.out.println("프로그램을 종료합니다.");
		}
	}
}

