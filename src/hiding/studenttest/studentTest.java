package hiding.studenttest;

import hiding.student.Student;

public class studentTest {

	public static void main(String args[]) {
		Student mon = new Student();
//		mon.studentName = "monjimon"; // private ���� : field studentName is not visible error
		
		System.out.println(mon.getStudentName()); // null 
		mon.setStudentName("mon");
		System.out.println(mon.getStudentName()); // null 
//		mon.address = "default ����"; // default ���� : Student.address is not visible error
		mon.studentId = 3; // public ���� : �ܺο��� ���� ����
//		mon.grade = 2; // protected ���� : ���� ��Ű�� ���ΰ� �ƴ϶� not visible error �߻�
	}
}
