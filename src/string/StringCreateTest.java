package string;
/*
 * string ��Ű���� StringCreateTest Ŭ����
 * String�� �����ϴ� �� ���� ����� �� �������� �˾ƺ���
 * 
 * new ���� ����ϴ� ���� ���Ǯ�� �̹� ������ ���ڿ� ����� ����Ű�� ���
 * ���ڴ� ���޸𸮿� �ش� ��ü�� ����������
 * ���ڴ� ���ڿ� ����� ����Ű�� �ȴ�
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
