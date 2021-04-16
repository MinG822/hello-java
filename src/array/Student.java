package array;
import java.util.ArrayList;
/*
 array 패키지의 Student 클래스
 배열을 응용해 수강하는 과목들의 성적을 출력하는 학생 객체를 만들어 본다
 */
public class Student {
	private static int serialNum;
	public int studentId;
	private String studentName;
	public ArrayList<Subject> subjects = new ArrayList<Subject>();
	
	public Student(String studentName) {
		this.studentId = serialNum ++;
		this.studentName = studentName;
	}
	
	public void addSubjects(ArrayList<Subject> subjects) {
		for(int i = 0; i < subjects.size(); i++) {
			this.subjects.add(subjects.get(i));
		}
	}
	
	public void showStudent() {
		System.out.println(studentId + "번 " + studentName + " 입니다.");
	}
	
	public void showSubjects() {
		for(int i = 0; i < subjects.size(); i++) {
			subjects.get(i).showScore();
		}
	}
	
}
