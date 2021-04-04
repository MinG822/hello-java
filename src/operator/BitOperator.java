package operator;
/*
 operator ��Ű���� BitOperator Ŭ����
 ��Ʈ �����ڿ� ���� �˾ƺ���.
 
 ��Ʈ �����ڴ� ��Ʈ ���� ������� �Ѵ�
 ��ȣȭ, ����ŷ(� ������ Ư�� ��Ʈ�� ������), �޸� �뷮�� �����ϰų� ����� �����ؼ� �ӵ��� ������ �� ������ �ϱ� ���ؼ�, �Ǵ� Ư�� ���� ����ų� ������ �� ����Ѵ�.
 
 ��Ʈ �� �����ڴ� ��Ʈ ������ &,|,^,~ ������ �̷������.
 ^ (XOR) �����ڴ� ���� ���̸� 0, �ٸ� ���̸� 1
 ~ (����) �����ڴ� ��Ʈ 0�� 1��, 1�� 0���� �ٲٴ� ������
 
 ��Ʈ �̵� ������(shift)�� <<, >>, >>> �� ������ �ִ�
 << �������� ��Ʈ�� �̵��ϴ� ������
 >> ���������� ��Ʈ�� �̵��ϴ� ������, ���ʿ� ä������ ��Ʈ ���� ���� ���� ��ȣ ��Ʈ
 >>> >>�� ���������� ��ȣ��Ʈ�� ���� ���� ���ʿ� ä������ ��Ʈ ���� ������ 0
 */
public class BitOperator {

	public static void main(String[] args) {
		int num1 = 8;
		int num2 = 10;
		System.out.println(Integer.toBinaryString(num1));
		System.out.println(Integer.toBinaryString(num2));
		int result = num1 & num2;
		System.out.println(result);
		
		int result2 = num1 | num2;
		System.out.println(result2);
		
		int result3 = num1 ^ num2;
		System.out.println(result3);
		
		System.out.println(~num1); // ��ȣ��Ʈ�� 0���� 1�� �ٲ�� ������ ��
		System.out.println(-(~num1)); // ������ �ٲﰪ���� ��ȣ�� �ٲٸ� ������ num1 �� �޶����� ��
		System.out.println(~num2);
		
		System.out.println(num1 << 3); // num1 * 2^3 
		System.out.println(num1 >> 3); // num1 / 2^3
		System.out.println(Integer.toBinaryString(-num1));
		System.out.println(-num1 >> 3);
		System.out.println(Integer.toBinaryString(-num1 >> 3));
		System.out.println(-num1 >>> 3);
		System.out.println(Integer.toBinaryString(-num1 >>> 3));
	}

}
