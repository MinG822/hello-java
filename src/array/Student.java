package array;
import java.util.ArrayList;
/*
 array ��Ű���� Student Ŭ����
 �迭�� ������ �����ϴ� ������� ������ ����ϴ� �л� ��ü�� ����� ����
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
		System.out.println(studentId + "�� " + studentName + " �Դϴ�.");
	}
	
	public void showSubjects() {
		for(int i = 0; i < subjects.size(); i++) {
			subjects.get(i).showScore();
		}
	}
	
}
