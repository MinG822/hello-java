package staticex;
/*
staticex ��Ű���� StudentTest Ŭ����
static ������ ���� �˾ƺ���

Ŭ���� ������ �ν��Ͻ� �������� �����̹Ƿ� �ν��Ͻ����� ���� �����Ǿ�
�ν��Ͻ��� �ƴ� Ŭ���� �̸����ε� ������ ����� �� ����
*/
public class StudentTest {

	public static void main(String[] args) {
		System.out.println(Student.serialNum);
		Student mon = new Student("mon");
		System.out.println(mon.getStudentId());
		System.out.println(Student.serialNum);
		Student anotherMon = new Student("mon2");
		System.out.println(anotherMon.getStudentId());
		System.out.println(Student.serialNum);
	}

}
