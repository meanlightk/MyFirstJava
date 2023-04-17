// 삼항 조건 연산자

package ch03.sec11;

import java.net.SecureCacheResponse;
import java.util.Scanner;

public class ConditionalOperationExample02 {

	public static void main(String[] args) {
		int score = 49;
//		char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'c' );  => if문으로 짜기		
		
		
		if (score > 90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A입니다.");				
		} else if (score > 80) {
			System.out.println("점수가 80보다 큽니다.");
			System.out.println("등급은 B입니다.");	
		} else if (score > 70) {
			System.out.println("점수가 70보다 큽니다.");
			System.out.println("등급은 C입니다.");	
		} else if (score > 60) {
			System.out.println("점수가 60보다 큽니다.");
			System.out.println("등급은 D입니다.");	
		}else if (score >= 50) {
			System.out.println("점수가 50보다 큽니다.");
			System.out.println("등급은 E입니다.");
		} else {
			System.out.println("점수가 50보다 작습니다.");
			System.out.println("등급은 F입니다.");

		}
		
	}
}