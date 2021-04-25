package string;
/*
 * string 패키지의 StringBufferBuilderTest 클래스
 * 문자열을 변경하는 데 메모리 효율적인 StringBuffer, StringBuilder 클래스에 대해 알아본다
 * 
 * concat 은 문자열이 수정될 ㄸ대마다 메모리가 많이 낭비됨
 * StringBuffer 와 StringBuilder 는 내부에 변경가능한 char[] 를 변수로 가지고 있음
 * 두 클래스로 문자열을 연결할 때 char[] 배열이 확장됨
 * 전자는 쓰레드 세이프, 후자는 쓰레드 세이프하지 않으며
 * 후자의 경우가 실행속도가 조금 더 빠름
 */
public class StringBufferBuilderTest {

	public static void main(String[] args) {
		StringBuffer buffer = new StringBuffer("abc");
		StringBuilder builder = new StringBuilder("abc");
		
		System.out.println(System.identityHashCode(buffer));
		System.out.println(System.identityHashCode(builder));
		
		buffer.append("def");
		builder.append("def");

		System.out.println(System.identityHashCode(buffer));
		System.out.println(System.identityHashCode(builder));
		
		System.out.println(System.identityHashCode(buffer.toString()));
		System.out.println(System.identityHashCode(builder.toString()));
	}

}
