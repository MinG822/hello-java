package string;
/*
 * string ��Ű���� StringConcatTest Ŭ����
 * ���ڿ� ������ ��� concat �� ��� �̷�������� Ȯ���غ���
 * 
 * concat �޼���� ��ü�� ���ڿ��� �Ű������� ���ڿ��� ������ ���ο� ���ڿ��� ��ȯ�ϸ�
 * ��ü�� ���ڿ��� ��ȭ��Ű�� �ʴ´�
 * ���� ��ü�� ���ڿ��� ������ ���� final ������ �����Ǳ� ������ (�Һ�)
 * concat ���� ������� ���ڿ��� ���ο� �ּҰ��� ������
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
