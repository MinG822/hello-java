package variable;
/*
 variable ��Ű���� Conversion Ŭ����
 �� ��ȯ�� ���ؼ� �˾ƺ���.
 
 ���� �ٸ� �ڷ����� �������� ������ ������ �� ���� �ڷ������� ���ϵȴ�.
 ����Ʈ ũ�Ⱑ ���� �ڷ������� ū �ڷ������� �� ��ȯ, 
 �� ������ �ڷ������� �� ������ �ڷ������� �� ��ȯ��
 �ڵ�����(����������) �߻��Ѵ�.
 ���� �� ��찡 �ڵ����� ����ȯ�� �� �� �ִ� ������ �ڷ��� �ս��� �߻����� �ʱ� ����.
 
 �� �ݴ��� ���� ��������� �� ��ȯ�� ���־�� �Ѵ�.
 */
public class Conversion {

	public static void main(String[] args) {
		// ������ ����ȯ
		byte bNum = 10;
		int iNum = bNum;
		System.out.println(iNum);
		float fNum = iNum;
		System.out.println(fNum);
		double dNum = fNum + iNum;
		System.out.println(dNum);
		
		// ����� ����ȯ
		byte biNum = (byte)iNum;
		System.out.println(biNum);
		int diNum = (int)dNum;
		System.out.println(diNum);
		
		char ch1 = 'A';
		System.out.println((int)ch1);
		int ch2 = 65;
		System.out.println((char)ch2);
		
		double dNum1 = 1.2;
		float fNum1 = 0.9F;
		
		int iNum3 = (int)dNum1 + (int)fNum1; // 1 + 0
		int iNum4 = (int)(dNum1 + fNum1); // 2.1 -> 2
		System.out.println(iNum3);
		System.out.println(iNum4);
	}

}
