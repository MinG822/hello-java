package array;
import java.util.ArrayList;
/*
array ��Ű���� Student Ŭ����
�迭�� ������ �����ϴ� ������� ������ ����ϴ� �л� ��ü�� �׽�Ʈ�غ���.
*/
public class StudentTest {

	public static void main(String[] args) {
		Student mong = new Student("mong");
		ArrayList<Subject> candiSubjects = new ArrayList<Subject>();
		
		candiSubjects.add(new Subject("java"));
		candiSubjects.add(new Subject("python"));
		candiSubjects.add(new Subject("javascript"));
		
		mong.addSubjects(candiSubjects);  
		
		for(int i = 0; i < candiSubjects.size(); i ++) {
			candiSubjects.get(i).setScore((int)(Math.random()*100));
		}
		
		mong.showStudent();

		for(int i = 0; i < mong.subjects.size(); i++) {
			mong.subjects.get(i).showScore();
		}
		
		
	}

}
