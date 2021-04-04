package variable;
/*
 variable 패키지의 Constant 클래스
 상수와 리터럴을 알아본다.
 
 변수와 달리 상수는 변하지 않는 값
 상수는 final 예약어를 사용해 선언한다
 한번 선언한 상수는 변하지 않는다
 프로그램 내부에서 반복적으로 사용하고 변하지 않아야하는 값을 상수로 선언해서 사용하면 편리 (DRY)
 
 리터럴은 프로그램에서 사용하는 모든 숫자, 문자, 논리값
 리터럴은 프로그램이 시작할 때 시스템에 같이 로딩되어 특정 메모리 공간인 상수 풀(constant pool)에 놓인다.
 이후 변수에 어떤 값이 대입될 때 상수풀에 있는 리터럴 값이 변수 메모리에 복사되는 것
 
 자바에서 정수를 표현하는 메모리의 기본 크기는 4바이트. 상수풀에서도 마찬가지. 그래서 long 형은 식별자가 필요한 것
 실수도 마찬가지로 모든 실수 리터럴은 double 형이기 때문해 float 형은 식별자가 필요하다.
 */
public class Constant {
	public static void main(String args[]) { // main 의 매개변수가 값이 비어 있으면 실행되지 않음. 왜지?
		final double PI = 3.14;
		final int MAX_NUM = 100;
		final int MIN_NUM;
		
		System.out.println(MAX_NUM);
//		System.out.println(MIN_NUM); // 사용하기 전에 초기화 하지 않으면 오류 발생 (상수든 변수든 마찬가지)
		MIN_NUM = 0; 
		System.out.println(MIN_NUM);
//		MAX_NUM = 1000; // 상수는 값을 변경할 수 없음. 오류 발생
		
	}
}
