package loopexample;
/*
loopexample 패키지의 DoWhileLoop 클래스
do while 문에 대해 알아본다

do while 과 while 은 조건식 검사와 반복 수행의 순서가 다르다.
while 문에서 조건식이 맞지 않으면 반복 수행이 단 한번도 일어나지 않는다.
이와 달리 do while 은 무조건 한번 수행한 후 조건식을 검사한다.
*/

public class DoWhileLoop {

	public static void main(String[] args) {
		int sum = 0;
		int num = 1;
		
		do {
			sum += num;
			num ++;
		} while(num <= 10); // num 이 1부터 10 인 경우 까지 반복 수행
		
		System.out.println("1부터 10까지 합은 "+ sum + " 입니다.");
		
		do {
			System.out.println("실행 되는 코드");
		} while (num < 10);
	}

}
