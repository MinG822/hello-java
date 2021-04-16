package array;
import java.util.ArrayList;
/*
array 패키지의 Student 클래스
배열을 응용해 수강하는 과목들의 성적을 출력하는 학생 객체를 테스트해본다.
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
