package classpart;
/*
classpart ��Ű���� StudentTest Ŭ����
Student Ŭ������ �׽�Ʈ�ϱ� ���� Ŭ����

���� ��Ű���� Ŭ������ ����ϱ� ������ import �� �ʿ����
*/
public class StudentTest {

	public static void main(String[] args) {
		Student studentKim = new Student();
		studentKim.studentName = "����";
		
		System.out.println(studentKim.studentName);
		studentKim.setStudentName("������");
		System.out.println(studentKim.studentName);
		System.out.println(studentKim.getStudentName());
	}

}
