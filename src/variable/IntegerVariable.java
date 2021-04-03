package variable;
/*
 variable 패키지의 IntegerVariable 클래스
 정수의 여러 자료형을 알아본다.
 
 변수는 컴퓨터 내부의 메모리 공간에 저장된다.
 메모리는 프로그램이 실행되는 작업 공간.
 즉 변수를 선언한다는 것은 선언한 변수 이름으로 어떤 위치에 있는 메모리를 어느 정도의 크기로 사용하겠다는 뜻이다.
 
 정수 자료형에는 byte(1바이트), short(2바이트), int(4바이트), long(8바이트)이 있다.
 각 자료형의 크기에 따라 나타낼 수 있는 수의 범위가 다르며, 이 범위를 초과하는 값을 대입하면 오류가 발생한다.
 int 는 정수를 표현할 때 가장 많이 사용하는 자료형으로, 컴퓨터에서 정수로 연산을 할 때 4바이트 단위로 처리하는 것이 가장 효율적이기 때문이다.
 int 가 기본 처리 단위이기 때문에 long 형이면서 값의 범위가 int 형이 표현할 수 있는 범위를 넘어갈 경우, 식별자인 L또는 l 을 숫자 뒤에 붙여야한다.
 다른 자료형의 값들은 int 형의 범위를 넘지 않기 때문에 식별자가 필요없다.
 */

public class IntegerVariable {

	public static void main(String[] args) {
		// byte errByte = 128;
		
		short sVal = 10;
		byte bVal = 20;
		System.out.println(sVal + bVal); // 두 정수는 더하기 전에 모두 int 형으로 변환됨
		
		long lVal = 12345678900l;
		System.out.println(lVal);
		
	}

}
