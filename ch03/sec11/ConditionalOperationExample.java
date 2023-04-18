// 삼항 조건 연산자

package ch03.sec11;

import java.util.Scanner;

public class ConditionalOperationExample {

	public static void main(String[] args) throws Exception{
		Scanner scanner = new Scanner(System.in);
		
		
		while(true) {
			System.out.println("");
			System.out.print("");
			String data = scanner.nextLine();
			if(data.equals("q")) {
				break;
			}
		}
		int n=0;
		
		if (n >= 90) {
			System.out.println("등급은 A입니다.");				
		} else if (n >= 80) {
			
			System.out.println("등급은 B입니다.");	
		} else if (n >= 70) {
			
			System.out.println("등급은 C입니다.");	
		} else if (n >= 60) {
			
			System.out.println("등급은 D입니다.");	
		}else if (n >= 50) {
			System.out.println("등급은 E입니다.");
		} else {
			System.out.println("등급은 F입니다.");
			
			}

	
		
	}
}