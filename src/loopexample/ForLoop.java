package loopexample;
/*
loopexample ��Ű���� ForLoop Ŭ����
For ���� ���� �˾ƺ���

For ���� ���ǹ����� ������ �ʱ�ȭ��, ���ǽ�, �������� �ʿ��ϴ� 
�ʱ�ȭ��, 
���ǽ� �˻�, ���ǽ��� ���� ��� �ݺ��� ����, ������ ����, 
�ٽ� ���ǽ� �˻�, ���ǽ��� ������ ��� �ݺ����� �������� �ʰ� ����.

for���� ���� ���� ����ϴ� ������ �ݺ� Ƚ���� ������ �� �ֱ� ����
while �������� �ʱ�ȭ, ���� ��, �������� ���� �����ؼ� for ������ �������� �� ���� �ʴ�.

for ���� �ʱ�ȭ��, ���ǽ�, �������� ���������ϴ�
*/

public class ForLoop {
	public static void main(String args[]) {
		int sum = 0;
		for (int num = 1; num <= 10; num ++) {
			sum += num;
		}
		System.out.println("1���� 10���� ���� "+ sum + " �Դϴ�.");
		
		int i  = 0;
		for(; i < 1; i++) {
			System.out.println("�ʱ�ȭ���� ��� ����˴ϴ�");
		}
		
		// � ���� ��� ���� ������ �� �ٷ� for ���� ������ ���߷��� ���ǽ��� �����ϰ� ���๮ ���� if ���� ����� �ߴ��� �� �ִ�.
		for(int j = 0; ; j++) { 
			if (j > 3) {
				System.out.println("���ǽ��� ��� ����˴ϴ�.");
				System.out.println(j+ "��° �ݺ��ϰ� �ߴ��մϴ�.");
				break;
			}
		}
		
		// ������ ������ �����ϰų� �ٸ� ������ ���� ��� ���� �¿�� �� �������� �����ϰ� for �� ���� ���� �� �ִ�
		for(int j = 0; j < 3;) {
			j = (++j) % 10;
			System.out.println("�������� ��� ��� ����˴ϴ�.");
			System.out.println("���� ��: "+ j);
		}
		
		// ��� ��Ҹ� �����ϰ� ���� �ݺ� �� �� �ִ�
		for(;;) {
			System.out.println("�ʱ�ȭ�İ� ���ǽ�, �������� ��� ��� ����˴ϴ�.");
			break;
		}
		
		// ��ø for ��
		for(int dan = 2; dan <=9; dan++) {
			for(int times = 1; times<=9; times ++) {
				System.out.println(dan + "X" + times + "=" + dan * times); // ���ڿ��� ����ȯ�� �̷������ ��µ�
				System.out.println(dan + 'X' + times + '=' + dan * times); // char �ڷ����� int �ڷ������� ��ȯ�� ������ �̷����
			}
			System.out.println(); // ���� �� ���
		}
		
		for(int num = 1; num < 10; num++) {
			if (num%2 == 0) {
				continue;
			}
			System.out.println("10 ������ Ȧ�� "+num);
		}
		
		for(int num = 1; num < 5 ; num++) {
			System.out.println(num);
			if (num%3 == 0) {
				System.out.println("3�� ����� ��쿣 �׸� �д�");
				break;
			}
		}
		
	}
	
}
