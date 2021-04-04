package variable;
/*
 variable 패키지의 boolVariable 클래스
 논리 자료형 boolean 을 알아본다
 
 boolean 은 2바이트며 true 와 false 두 가지 값만 가진다.
 */
public class BoolVariable {

	public static void main(String[] args) {
		boolean isMarried = true;
		System.out.println(isMarried);
		// boolean isRight = 0; boolean 에 정수를 대입할 수 없다.
		int isFalse = 0;
//		 System.out.println((boolean)isFalse); //정수는 boolean 형으로 변환할 수 없다.
		System.out.println(isFalse);
	}
}
