package loopexample;
/*
 loopexample ��Ű���� WhileLoop Ŭ����
 while ���� ���� �˾ƺ���
 
 ���ǽ��� ���� ���� �ݺ� ����Ǵ� ���
 ������ �ݺ��Ǿ�� �� ��쿣 ���ǽ��� �׻� ���̸� �ȴ�.
 */

public class WhileLoop {
	public static void main(String[] args) {
		int num = 1;
		int sum = 0;
		
		while(num <= 10) { // ���ǽ��� ���� ���� �ݺ� ����, num �� 1���� 10 �� ��� ���� �ݺ� ����
			sum += num;
			num++;
		}
		
		System.out.println("1���� 10���� ���� "+ sum + " �Դϴ�.");
		
		while (num < 10) {
			System.out.println("���� ���� �ʴ� �ڵ�");
		}
	}

}
