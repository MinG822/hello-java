package string;
/*
 * string ��Ű���� StringBufferBuilderTest Ŭ����
 * ���ڿ��� �����ϴ� �� �޸� ȿ������ StringBuffer, StringBuilder Ŭ������ ���� �˾ƺ���
 * 
 * concat �� ���ڿ��� ������ ���븶�� �޸𸮰� ���� �����
 * StringBuffer �� StringBuilder �� ���ο� ���氡���� char[] �� ������ ������ ����
 * �� Ŭ������ ���ڿ��� ������ �� char[] �迭�� Ȯ���
 * ���ڴ� ������ ������, ���ڴ� ������ ���������� ������
 * ������ ��찡 ����ӵ��� ���� �� ����
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
