package reference;
/*
 reference ��Ű���� Student Ŭ����
 �����ڷ����� ���ؼ� �˾ƺ���
 
 �����ڷ����� ������ ���� �ڷ����� Ŭ������
 
 */
public class Student {
	int studentId;
	String studentName;
	Subject korean;
	Subject math;
	Subject english;
	
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}
	
	public void showStudent() {
		System.out.println(this.studentName);
	}
	
	public void setSubjects(Subject subKor, Subject subMath, Subject subEng) {
		this.korean = subKor;
		this.math = subMath;
		this.english = subEng;
	}
	
	public void showStudnetSubjectScore( ) {
		this.korean.showSubject();
		this.math.showSubject();
		this.english.showSubject();
	}
}
