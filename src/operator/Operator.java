package operator;
/*
 operator ��Ű���� Operator Ŭ����
 �⺻ �����ڿ� ���ؼ� �˾ƺ���.
 
 �����ڴ� ���꿡 ����ϴ� ��ȣ, ���� ���꿡 ����ϴ� ��
 �ʿ�� �ϴ� ���� ������ ���� ���� ������, ���� ������, ���� �����ڷ� ���� �� ����
 ������ �켱������ ���� > ���� > ���� ������
 
 ���� ������ = �� ���� �����ڷ� ���� ������ �� ���� ������ ����
 ��ȣ �����ڴ� +, -�� ���� ������
 ��� �����ڴ� ��Ģ ���꿡�� ����ϴ� +, -, *, /, %
 
 ���� ������ ++, -- �� ���� �����ڷ� �������� ���̳� �� ����� ���� 1��ƴ �ø��ų� ���̴µ�, ����ϴ� ��ġ�� ���� ����� �޶�����.
 ���� �����ڰ� �ǿ����� �տ� ������ ������ ������ ���� (; ����) �����ǰ�, �ڿ� ������ ������ ������ ���� �����ȴ�.
 
 ���� ������ >, <, >=, <=, !=, == �� ���� �������̴�
 ���� �������� ��� ���� true �Ǵ� false �� ��ȯ�ȴ�.
 
 �� ������ &&, ||, !�� �� ������ �������� �Ǵ��ϸ� ���� �������̴�.
 �켱���� ���� ������ > �� ������
 
 ���� ���� ������ +=, -= ���� ���� �����ڿ� �ٸ� �����ڸ� ������ �ϳ��� ������ó�� ����ϴ� ���� �������̴�.
 
 ���� �����ڴ� ���� �����ڷ� �־��� ���ǽ��� ���� ���� ������ ��쿡 �ٸ� ��� ���� ���´�
 */

public class Operator {

	public static void main(String[] args) {
		int mathScore = 90;
		int engScore = 70;
		int korScore = 97;
		
		int totalScore = mathScore + engScore + korScore;
		System.out.println(totalScore);
		
		double avgScore = totalScore / 3.0; 
		// double avgScore = totalScore / 3; int ������ ������ �Ǹ� int / int �� �Ǿ� �Ҽ��� �ڸ��� ���� �Ҵ´�. 
		System.out.println(avgScore);
		
		int gameScore = 150;
		
		int lastScore1 = ++gameScore;
		System.out.println(lastScore1);
		
		int lastScore2 = --gameScore;
		System.out.println(lastScore2);
		
		int value = 10;
		int num = ++value;
		System.out.println(num);
		System.out.println(value);
		
		int num2 = value++;
		System.out.println(num2);
		System.out.println(value);
		
		int myAge = 27;
		boolean isOlderThan25 = (myAge > 25);
		System.out.println(isOlderThan25);
		
		boolean isAllTrue = (5>3) && (5>2);
		boolean isOneTrue = (5>3) || (5<2); // �ι�° ���� ù��° ���� ���� ��� ���� ���� �ʴ´�
		boolean isNotBigger = !(5>3);
		
		int i = 10;
		boolean firstTrue = isAllTrue || ((i = i - 5) < 10 );
		System.out.println(i);
		
		int fatherAge = 45;
		int motherAge = 47;
		
		char isFatherOlderThanMother = (fatherAge > motherAge) ? 'T' : 'F';
		System.out.println(isFatherOlderThanMother);
	}
}
