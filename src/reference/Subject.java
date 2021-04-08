package reference;
/*
reference 패키지의 Subject 클래스
참조자료형에 대해서 알아본다

*/
public class Subject {
	String subjectName;
	int scorePoint;
	
	public Subject(String subjectName, int scorePoint) {
		this.subjectName = subjectName;
		this.scorePoint = scorePoint;
	}
	
	public void showSubject() {
		System.out.println(this.subjectName + " 과목의 점수는 "+ this.scorePoint + "입니다");
	}
}
