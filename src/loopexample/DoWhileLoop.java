package loopexample;
/*
loopexample ��Ű���� DoWhileLoop Ŭ����
do while ���� ���� �˾ƺ���

do while �� while �� ���ǽ� �˻�� �ݺ� ������ ������ �ٸ���.
while ������ ���ǽ��� ���� ������ �ݺ� ������ �� �ѹ��� �Ͼ�� �ʴ´�.
�̿� �޸� do while �� ������ �ѹ� ������ �� ���ǽ��� �˻��Ѵ�.
*/

public class DoWhileLoop {

	public static void main(String[] args) {
		int sum = 0;
		int num = 1;
		
		do {
			sum += num;
			num ++;
		} while(num <= 10); // num �� 1���� 10 �� ��� ���� �ݺ� ����
		
		System.out.println("1���� 10���� ���� "+ sum + " �Դϴ�.");
		
		do {
			System.out.println("���� �Ǵ� �ڵ�");
		} while (num < 10);
	}

}
