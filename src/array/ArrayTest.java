package array;
/*
 array ��Ű���� ArrayTest Ŭ����
 �迭�� ���ؼ� �˾ƺ���
 
 �迭�� �ڷ����� ���� �ڷ� ���� ���� �� ���� �����ϴ� ����
 
 �迭 ����
  - �ڷ���[] �迭�̸� = new �ڷ���[����]
  - �ڷ��� �迭�̸�[] = new �ڷ���[����]
 
 �迭 �ʱ�ȭ
 
 �迭�� �ε����� ���
 �迭�� ������ ��ġ�� ���� ��ġ�� ����
 */
public class ArrayTest {

	public static void main(String[] args) {
		// �迭 ���� : 
		int studentIds[] = new int[10];
		int[] studentIds2 = new int[10];
		// �迭 �ʱ�ȭ
		//int[] studentIds3 = new int[3] {101, 102, 103}; // error
		int[] studentIds3 = new int[] {101, 102, 103};
		int[] studentIds4 = {201, 202, 203};
		
		int[] studentIds5;
		// studentIds5 = {100, 102}; // error
		studentIds5 = new int[] {100, 102};
		// studentIds5[2] = 103; index out of range
		
		int[] num = new int[10];
		System.out.print("�ʱ�ȭ �� �迭 ���: ");
		for(int i = 0; i < num.length; i++) {
			System.out.print(num[i]);
			num[i] = i;
		}
		System.out.println();
		System.out.print("�ʱ�ȭ �� �迭 ���: ");
		for(int i = 0; i < num.length; i++) {
			System.out.print(num[i]);
		}
	}

}
