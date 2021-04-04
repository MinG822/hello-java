package variable;
/*
 variable 패키지의 doubleVariable 클래스
 실수 자료형인 double 과 float 을 알아본다.
 
 실수를 컴퓨터에서 표현할 땐 부동 소수점 방식, 즉 지수와 가수 부분을 나누어 나타낸다.
 자바에서 실수 자료형은 float 과 double 이 있는데
 float 형은 부호 1비트, 지수부 8비트, 가수 23비트로 총 32비트 (4바이트),
 double 형은 부호 1비트, 지수부 11비트, 가수 52비트로 총 64비트 (8파이트) 이다.
 
 자바에서 실수의 기본 자료형은 double 이다.
 */
public class doubleVariable {
	public static void main(String[] args) {
		double dnum = 3.14;
		// float fnum = 3.14; 
		// cannot convert from double to float 에러가 발생
		// 상수 풀 메모리에 저장된 3.14(더블형)를 float 형 fnum 에 대입하는 과정에서 type mismatch 에러가 발생함. Constant 클래스의 상수풀 참고
		float fnum = 3.14f;
		
		System.out.println(dnum);
		System.out.println(fnum);
		
		for(int i = 0; i < 10000 ; i++) {
			dnum += 0.1;
		}
		System.out.println(dnum); // 부동 소수점 방식은 지수로 표현되는 값이 0 을 나타낼 수 없기 때문에 약간의 오차가 발생할 수 있다.
		
	}
}
