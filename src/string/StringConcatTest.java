package string;
/*
 * string 패키지의 StringConcatTest 클래스
 * 문자열 변수의 경우 concat 이 어떻게 이루어지는지 확인해본다
 * 
 * concat 메서드는 객체의 문자열과 매개변수의 문자열이 합쳐진 새로운 문자열을 반환하며
 * 객체의 문자열을 변화시키지 않는다
 * 한편 객체의 문자열이 생성될 때는 final 예약어로 생성되기 때문에 (불변)
 * concat 으로 만들어진 문자열은 새로운 주소값을 가진다
 * 
 */
public class StringConcatTest {

	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("def");
		System.out.println(System.identityHashCode(str1));
		
		str1 = str1.concat(str2);
		System.out.println(str1);
		System.out.println(System.identityHashCode(str1));
	}

}
