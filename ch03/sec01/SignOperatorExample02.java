// 1~100 사이에서 5의 배수만 출력하기 (단, %를 사용)
package ch03.sec01;

public class SignOperatorExample02 {

	public static void main(String[] args) {
	for(int i=0; i<=100; i++)
		if(i%5==0 && i!=0)
			System.out.println(i);
	}

}
