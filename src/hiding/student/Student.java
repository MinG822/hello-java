package hiding.student;
/*
 hiding.student 패키지의 Student 클래스
 정보 은닉에 대해 알아본다

 클래스 내부의 변수나 메서드, 생성자에 대한 접근을 지정할 수 있는 예약어를 접근 제어자라고 함
 private 로 선언한 변수나 메서드는 외부 클래스에서 사용할 수 없음
 public 로 선언한 변수나 메서드는 외부 클래스에서 사용할 수 있음
 
 */
public class Student {
	public int studentId; // public 외부 클래스 어디서나 접근할 수 있음
	private String studentName; // private 같은 클래스 내부에서만 접근할 수 있음
	protected int grade; // protected 같은 패키지 내부 & 상속 관계의 클래스에서만 접근할 수 있음
	String address; // deafult 같은 패키지 내부에서만 접근할 수 있음
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
}
