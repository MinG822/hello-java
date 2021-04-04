package variable;
/*
 variable ��Ű���� doubleVariable Ŭ����
 �Ǽ� �ڷ����� double �� float �� �˾ƺ���.
 
 �Ǽ��� ��ǻ�Ϳ��� ǥ���� �� �ε� �Ҽ��� ���, �� ������ ���� �κ��� ������ ��Ÿ����.
 �ڹٿ��� �Ǽ� �ڷ����� float �� double �� �ִµ�
 float ���� ��ȣ 1��Ʈ, ������ 8��Ʈ, ���� 23��Ʈ�� �� 32��Ʈ (4����Ʈ),
 double ���� ��ȣ 1��Ʈ, ������ 11��Ʈ, ���� 52��Ʈ�� �� 64��Ʈ (8����Ʈ) �̴�.
 
 �ڹٿ��� �Ǽ��� �⺻ �ڷ����� double �̴�.
 */
public class doubleVariable {
	public static void main(String[] args) {
		double dnum = 3.14;
		// float fnum = 3.14; 
		// cannot convert from double to float ������ �߻�
		// ��� Ǯ �޸𸮿� ����� 3.14(������)�� float �� fnum �� �����ϴ� �������� type mismatch ������ �߻���. Constant Ŭ������ ���Ǯ ����
		float fnum = 3.14f;
		
		System.out.println(dnum);
		System.out.println(fnum);
		
		for(int i = 0; i < 10000 ; i++) {
			dnum += 0.1;
		}
		System.out.println(dnum); // �ε� �Ҽ��� ����� ������ ǥ���Ǵ� ���� 0 �� ��Ÿ�� �� ���� ������ �ణ�� ������ �߻��� �� �ִ�.
		
	}
}
