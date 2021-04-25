package string;
/*
 * string 패키지의 StringCreateTest 클래스
 * String을 선언하는 두 가지 방법과 그 차이점을 알아본다
 * 
 * new 예약어를 사용하는 경우와 상수풀에 이미 생성된 문자열 상수를 가리키는 방식
 * 전자는 힙메모리에 해당 객체가 생성되지만
 * 후자는 문자열 상수를 가리키게 된다
 * 
 */
public class StringCreateTest {
	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");
		System.out.println(str1==str2);
		
		String str3 = "abc";
		String str4 = "abc";
		System.out.println(str3==str4);
	}
}
