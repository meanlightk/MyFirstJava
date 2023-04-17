// 삼항 조건 연산자

package ch03.sec11;

import java.util.Scanner;

public class ConditionalOperationExample {

	public static void main(String[] args) throws Exception{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("점수 입력: ");
		String strX = scanner.nextLine();
		int x = Integer.parseInt(strX);

		System.out.println("등급은 ");
		String strY = scanner.nextLine();
		int y = Integer.parseInt(strY);
		
		if (x >= 90) {
			System.out.println(" A입니다.");				
		} else if (x >= 80) {
			
			System.out.println("등급은 B입니다.");	
		} else if (x >= 70) {
			
			System.out.println("등급은 C입니다.");	
		} else if (x >= 60) {
			
			System.out.println("등급은 D입니다.");	
		}else if (x >= 50) {
			System.out.println("등급은 E입니다.");
		} else {
			System.out.println("등급은 F입니다.");
			
			}

		while(true) {
			System.out.println("점수: ");
			String data = scanner.nextLine();
			if(data.equals("q")) {
				break;
			}
		}
		
	}
}