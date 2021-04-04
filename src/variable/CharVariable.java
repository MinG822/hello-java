package variable;
/*
 variable 패키지의 CharVariable 클래스
 문자 자료형을 알아본다.
 
 문자를 컴퓨터 내부에서 표현하기 위한 특정 정수 값(코드 값)의 모음을 문자세트
 문자를 해당 문자세트의 코드 값으로 변환하는 것을 문자인코딩
 반대로 코드 값을 다시 문자로 변환하는 것을 문자 디코딩
 
 문자 인코딩에는 아스키코드(1바이트), 유니코드(2바이트) 등이 있다.
 아스키는 영문자, 숫자, 특수 문자 등을 나타냄
 유니코드는 각 언어의 표준 인코딩을 정의
 유니코드의 1바이트는 아스키 코드 값과 호환됨
 
 자바의 문자는 유니코드(UTF-16)에 기반하여 문자를 표현
 자바의 문자 자료형이 char 형은 2바이트를 사용
 
 문자를 사용할 때는 작은 따옴표를 사용
 "Hello" 처럼 여러 개의 문자로 이루어진 문자열은 큰 따옴표를 사용하며,
 기본 자료형인 char 로 표현할 수 없으며, 대신 String 클래스를 사용할 수 있다.
 문자열은 끝에는 항상 널 문자('\0') 이 붙어 있는 특징이 있다.
 */

public class CharVariable {
	
	public static void main(String[] args) {
		char myChar = 'A'; //  문자에 해당하는 정수 값이 변수에 저장됨
		System.out.println(myChar);
		System.out.println((int)myChar);
		
		char ch2 = 66; // 문자 자료형 변수에 정수값을 대입하면
		System.out.println(ch2); // 해당 정수 값에 해당하는 문자를 출력한다.
		
		int ch3 = 67; // 정수 자료형 변수에 정수값을 대입
		System.out.println(ch3);
		System.out.println((char)ch3); // 정수 값에 해당하는 문자 출력
		
		char han = '한';
		char han2 = '\uD55C'; // 유니코드는 4비트를 사용하는 16진수 4자리(2바이트)로 글자를 나타낸다.
		
		System.out.println(han);
		System.out.println(han2);
		
		int a2 = -65;
		// char a1 = -65; 문자형 변수에 음수를 넣으면 오류가 발생
		System.out.println((char)a2); // 알 수 없는 문자라는 의미인 ? 가 출력
	}

}
