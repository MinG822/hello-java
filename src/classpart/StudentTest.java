package classpart;
/*
classpart ��Ű���� StudentTest Ŭ����
Student Ŭ������ �׽�Ʈ�ϱ� ���� Ŭ����

���� ��Ű���� Ŭ������ ����ϱ� ������ import �� �ʿ����

new ������ �����ڸ� ȣ���� �����ϸ� Ŭ������ ���� ����� �� �ֵ��� �޸� ����(�� �޸�)�� �Ҵ�޴´ٴ� ��
�ν��Ͻ��� ����Ű�� Ŭ������ ������ ���� ���� �Ǵ� ���� �ν��Ͻ���� �ϸ�, ������ ����������� ��

���������� ��Ʈ�����ڸ� ����� �ν��Ͻ��� ��������� �޼��带 ������ ����� �� ����
�ν��Ͻ��� �����Ǹ� ���޸𸮿� �ش� �ν��Ͻ��� ������ �����.
��������� �ν��Ͻ��� �����̱� ������ �ν��Ͻ� ������� �Ҹ�

�Ʒ� main �Լ� ���ø޸��� studentKim ������ ���޸𸮿� ����� �޸𸮸� ����Ű�Եȴ�
�� studentKim ������ ���Ե� ���� ���޸��� �ش� �ν��Ͻ��� �ּ�

���������� ����ϸ� Ŭ�����̸�@�ּҰ�(�ؽ��ڵ�) �� ����
�ؽ��ڵ�� �ڹٰ���ӽſ��� ��ü�� �����Ǿ��� �� �Ҵ��ϴ� ���� �ּ� ��
�̸� ���� ���������� ���Ե� �ν��Ͻ��� ������ �� ����, �׷��� �ּҰ��� �������̶�� ��

*/
public class StudentTest {

	public static void main(String[] args) {
		Student studentKim = new Student();
		studentKim.studentName = "����";
		
		System.out.println(studentKim.studentName);
		studentKim.setStudentName("������");
		System.out.println(studentKim.studentName);
		System.out.println(studentKim.getStudentName());
		
		Student studentMon = new Student();
		studentMon.studentName = "��";
		
		System.out.println(studentKim);
		System.out.println(studentMon);
	}

}
