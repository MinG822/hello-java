package array;
/*
array 패키지의 Subject 클래스
배열을 응용해 수강과목 이름과 성적을 알려주는 객체를 만들어본다
*/
public class Subject {
	String name;
	int score;
	
	public Subject(String name) {
		this.name = name;
	}
	
	public void setScore(int score) {
		System.out.println("Subject "+ name+"의 점수를 기록합니다 : "+score + " 점");
		this.score = score;
	}
	
	public void showScore() {
		if (score == 0) {
			System.out.println("Subject "+ name+"의 점수는 아직 존재하지 않습니다.");
		} else {
			System.out.println("Subject "+ name+"의 점수는 "+score + " 점입니다.");
		}
	}

}
