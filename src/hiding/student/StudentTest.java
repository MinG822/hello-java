package hiding.student;
/*
hiding.student ��Ű���� StudentTest Ŭ����
���� ���п� ���� �˾ƺ���

private �� ����� ������ �ܺ� �ڵ忡�� ����ϱ� ���ؼ� studentName �� ������ �� �ִ� public �޼��尡 �����Ǿ����

���������� ��������� ���� ������ �ʿ��� �� �����ϴ�
�����ص� ���͸� ���ؼ��� ������ ���Ե� �� �ִٸ� ��ȿ���� �ʴ� ���� ��������� �����Ǵ� ���� ���� �� �ִ� 

*/
public class StudentTest {
	public static void main(String args[]) {
		Student mon = new Student();
//		mon.studentName = "monjimon"; // field studentName is not visible error
		
		System.out.println(mon.getStudentName()); // null 
		mon.setStudentName("mon");
		System.out.println(mon.getStudentName()); // null 
		mon.address = "default ����";
	}
}
