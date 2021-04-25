package object;
/*
 * object ��Ű���� EqualsTest Ŭ����
 * Object Ŭ������ �⺻�޼��� �� equals() �޼��忡 ���� �˾ƺ���
 * 
 * equals �޼���� �� �ν��Ͻ��� �ּ� ���� ����� boolean ���� ��ȯ�Ѵ�
 * �ּ� ���� ���ٸ� ���� �ν��Ͻ��ε�, �ٸ� �ּҰ��� ���� ���� ���� �ν��Ͻ���� ������ �� ����
 * ������ ���ϼ��� �ƴ϶� ���� ���ϼ��� ������ ���� equals �޼��带 �������Ͽ� ����Ѵ� 
 * ������� ��ü�� �����ϸ� ���� �޸� ��ġ�� �����ϱ� ������ equals �޼����� ��ȯ���� true�̴� (���������� ����).
 * �׷��� ���ڿ�Ÿ�� ���� �� ���� ���� ���ڿ��̶�� equals �޼���� ���� �� true �� ���� ���´� (�������� ����).
 * 
 * ���� == ��ȣ�� equals �� �޸� �� ��ü�� �޸� �ּ� ���� ���Ѵ�
 * 
 * �л� ��ȣ, �̸��� ��������� ���� �л� ��ü�� ����� ��ȣ�� �̸��� ���ٸ� ���� �л����� ��Ÿ������ equals �޼��带 �������غ���
 * 
 * 
 */

public class EqualsTest {
	public static void main(String args[]) {
		String aString = new String("abc");
		String bString = aString;
		String cString = new String("abc");
		
		System.out.println(aString.equals(bString));
		System.out.println(aString == bString);
		
		System.out.println(aString.equals(cString));
		System.out.println(aString == cString);
		
		Student studentA = new Student(123, "a");
		Student studentB = new Student(123, "a");
		
		System.out.println(studentA.equals(studentB));
		System.out.println(studentA == studentB);
	}
}
