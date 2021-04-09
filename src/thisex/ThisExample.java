package thisex;
/*
 thisex ��Ű���� ThisExample Ŭ����
 this �� ���ؼ� �˾ƺ���
 
 this �� ������ �ν��Ͻ� �ڽ��� ����Ű�� ����
 this.year = year; �� ���� �޸�(�� �޸�)�� ������ �ν��Ͻ��� year ���� ��ġ�� ����Ű�� , �� ������ ��ġ�� �Ű����� ���� ������ 
 Ŭ������ �����ڿ��� �ٸ� �����ڸ� ȣ���ϴ� �Լ��� this �� ����� �� �ִ�.
 */
class BirthDay {
	// �� ���� ���� ���� Ŭ������ ���� �� �� ������ public �� �ڹ� ���ϸ�� ���� �� ����� �� �ִ�
	int day;
	int month;
	int year;
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public void printThis() {
		System.out.println(this);
	}
}

public class ThisExample {
	public static void main(String[] args) {
		BirthDay bDay = new BirthDay();
		bDay.setYear(2000);
		System.out.println(bDay); // �������� ��� -> Ŭ�����̸�@�޸��ּ�
		bDay.printThis(); // this ��� �޼��� ȣ�� -> Ŭ�����̸�@�޸��ּ�
	}
}
