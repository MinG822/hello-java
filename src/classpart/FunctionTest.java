package classpart;
/*
 classpart ��Ű���� FunctionTest Ŭ����
 Ŭ���� �޼��带 �����Ѵ�
 
 �Լ��� ��ȯ���� �ڷ� ���� �Լ� �̸� �տ� ���δ�. 
 ���� �Լ��� ��ȯ���� ������ void �� �� ��ȯ���� ������ ��Ÿ����
 
 �Լ��� ȣ��Ǹ� �� �Լ����� ���� �޸� ������ �Ҵ� �Ǹ�, �� �޸� ������ �����̶�� �θ���
 �Ʒ� Ŭ�������� main �Լ��� ȣ��Ǿ� main �Լ����� ����� �޸� ������ ���ÿ� �����Ǹ�,
 main �Լ����� add �Լ��� ȣ�� �Ǿ� ���ÿ� ���Ӱ� �����ȴ�.
 add �Լ��� ������ ������, �ش� �Լ����� �Ҵ��ߴ� �޸𸮰����� �����Ѵ�.
 add �Լ��� �Ѱ��ִ� �Ű������� main ���� ����ϴ� ������ ���� �ٸ� �޸� ������ ����Ѵ�
 �Լ� ���ο����� ����ϴ� ������ ���������� �ϰ�, ���������� ���� �޸𸮿� �����ȴ�
 
 �������� ���̽�� �ٸ���. 
 ���� �Լ����� ���� �Լ��� ������ �� �� �ִ� ���̽�� �޸�
 �ڹٿ����� ���� �Լ��� ���� �Լ��� ������ ���� ���� �� �� ����.
 �޸� ��� ����� ���� �ٸ� �� �ϴ�
 
 int �� ������ �޸� �ּҴ� �ᱹ ��� Ǯ������ �ش� ���� �޸� �ּ��̰�
 ���� ������ ���� ������Ű�ų� �ϸ� �ش� ������ �޸� �ּҰ� �޶�����
 ���̽㿡���� int �� ������ ���� ��������� �� ���������� �޸� �ּҰ� �޶�����?
 
 �޼���� Ŭ���� ������ ����ϴ� �Լ��� �⺭ ������ ����� �� �ִ�
 
 �ϳ��� �Լ����� �ϳ��� ����� �����ؾ��Ѵ�.
 �Լ� �̸��� ĳ�����̽�
 */
public class FunctionTest {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		
		int sum = add(num1, num2);
		System.out.println(num1 + " + " + num2 + " = " + sum + " �Դϴ�");
		System.out.println("10 �� �޸� �ּ�"+ System.identityHashCode(10));
		System.out.println("n1�� �޸� �ּ�" + System.identityHashCode(num1));
		int test = 1;
		scopeTest(test);
		System.out.println(test);
	}
	
	public static int add(int n1, int n2) {
		System.out.println("n1 �� �޸� �ּ� "+System.identityHashCode(n1));
		int result = n1 + n2;
		n1 += 1;
		System.out.println("n1 �� ���� ������ �� �޸� �ּ� "+System.identityHashCode(n1));
		return result;
	}
	
	public static void scopeTest(int tnum) {
		tnum += 1;
	}

}
