package reference;
/*
 reference 패키지의 Student 클래스
 참조자료형에 대해서 알아본다
 
 참조자료형은 변수의 선언 자료형이 클래스형
 
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
