package ifexample;
/*
 ifexample ��Ű���� ifExample Ŭ����
 ���ǹ� if else ���� �����Ѵ�
 */
public class ifExample {
	public static void main(String args[]) {
		int age = 7;
		if (age >= 8) {
			System.out.println("�б��� �ٴմϴ�.");
		} else if (age >= 3) {
			System.out.println("��ġ���� �ٴմϴ�.");
		} else {
			System.out.println("�б��� ��ġ���� �ٴ��� �ʽ��ϴ�");
		}
		
		char isPreSchoolAge = (age >= 8) ? 'F': (age >= 3) ? 'T' : 'F';
		System.out.println(isPreSchoolAge);
	}
}
