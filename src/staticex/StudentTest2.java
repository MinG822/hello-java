package staticex;
/*
staticex ��Ű���� StudentTest Ŭ����
static ������ ���� �˾ƺ���

Ŭ���� ������ �ν��Ͻ� �������� �����̹Ƿ� �ν��Ͻ����� ���� �����Ǿ�
�ν��Ͻ��� �ƴ� Ŭ���� �̸����ε� ������ ����� �� ����
*/
public class StudentTest2 {

	public static void main(String[] args) {
		System.out.println(Student2.getSerialNum());
		Student2 mon = new Student2("mon");
		System.out.println(mon.getStudentId());
		System.out.println(Student2.getSerialNum());
		Student2.setSerialNum(3000);
		System.out.println(Student2.getSerialNum());
		Student2 anotherMon = new Student2("mon2");
		System.out.println(anotherMon.getStudentId());
		System.out.println(Student2.getSerialNum());
	}

}
