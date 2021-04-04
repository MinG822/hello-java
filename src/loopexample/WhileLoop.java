package loopexample;
/*
 loopexample 패키지의 WhileLoop 클래스
 while 문에 대해 알아본다
 
 조건식이 참인 동안 반복 실행되는 경우
 무한히 반복되어야 할 경우엔 조건식이 항상 참이면 된다.
 */

public class WhileLoop {
	public static void main(String[] args) {
		int num = 1;
		int sum = 0;
		
		while(num <= 10) { // 조건식이 참인 동안 반복 실행, num 이 1부터 10 인 경우 까지 반복 수행
			sum += num;
			num++;
		}
		
		System.out.println("1부터 10까지 합은 "+ sum + " 입니다.");
		
		while (num < 10) {
			System.out.println("실행 되지 않는 코드");
		}
	}

}
