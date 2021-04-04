package loopexample;
/*
loopexample 패키지의 ForLoop 클래스
For 문에 대해 알아본다

For 문의 조건문에는 변수의 초기화식, 조건식, 증감식이 필요하다 
초기화식, 
조건식 검사, 조건식이 참인 경우 반복문 수행, 증감식 수행, 
다시 조건식 검사, 조건식이 거짓인 경우 반복문을 수행하지 않고 종료.

for문을 가장 많이 사용하는 이유는 반복 횟수를 관리할 수 있기 때문
while 문에서는 초기화, 조건 비교, 증감식을 따로 구현해서 for 문보다 가독성이 더 좋지 않다.

for 문의 초기화식, 조건식, 증감식은 생략가능하다
*/

public class ForLoop {
	public static void main(String args[]) {
		int sum = 0;
		for (int num = 1; num <= 10; num ++) {
			sum += num;
		}
		System.out.println("1부터 10까지 합은 "+ sum + " 입니다.");
		
		int i  = 0;
		for(; i < 1; i++) {
			System.out.println("초기화식이 없어도 실행됩니다");
		}
		
		// 어떤 연산 결과 값이 나왔을 때 바로 for 문의 수행을 멈추려면 조건식을 생략하고 실행문 내에 if 문을 사용해 중단할 수 있다.
		for(int j = 0; ; j++) { 
			if (j > 3) {
				System.out.println("조건식이 없어도 실행됩니다.");
				System.out.println(j+ "번째 반복하고 중단합니다.");
				break;
			}
		}
		
		// 증감식 연산이 복잡하거나 다른 변수의 연산 결과 값에 좌우될 때 증감식을 생략하고 for 문 내에 넣을 수 있다
		for(int j = 0; j < 3;) {
			j = (++j) % 10;
			System.out.println("증감식이 없어도 없어도 실행됩니다.");
			System.out.println("변수 값: "+ j);
		}
		
		// 모든 요소를 생략하고 무한 반복 할 수 있다
		for(;;) {
			System.out.println("초기화식과 조건식, 증감식이 없어도 없어도 실행됩니다.");
			break;
		}
		
		// 증첩 for 문
		for(int dan = 2; dan <=9; dan++) {
			for(int times = 1; times<=9; times ++) {
				System.out.println(dan + "X" + times + "=" + dan * times); // 문자열로 형변환이 이루어져서 출력됨
				System.out.println(dan + 'X' + times + '=' + dan * times); // char 자료형이 int 자료형으로 변환되 덧셈이 이루어짐
			}
			System.out.println(); // 한줄 띄어서 출력
		}
		
		for(int num = 1; num < 10; num++) {
			if (num%2 == 0) {
				continue;
			}
			System.out.println("10 이하의 홀수 "+num);
		}
		
		for(int num = 1; num < 5 ; num++) {
			System.out.println(num);
			if (num%3 == 0) {
				System.out.println("3의 배수인 경우엔 그만 둔다");
				break;
			}
		}
		
	}
	
}
