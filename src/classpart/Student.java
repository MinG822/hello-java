package classpart;
/*
 classpart 패키지의 Student 클래스
 객체지향 프로그래밍과 클래스에 대해 알아본다.
 
 객체란 의사나 행위가 미치는 대상
 객체지향 프로그래밍은 객체를 기반으로 하는 프로그래밍
 객체를 정의하고, 각 객체간 기능을 제공하고, 객체 간 협력을 프로그래밍 한다
 
 클래스로 객체를 구현할 수 있다.
 클래스 내부에 객체의 속성을 나타내는 변수는 멤버변수, 기능을 구현한 함수를 메서드(멤버 함수)라 함
 위와 같이 클래스로 객체를 구현하는 것을 클래스를 정의한다라고 표현
 
 클래스 이름은 대문자로
 클래스의 전체이름은 classpart.Student 로 
 클래스의 이름이 같아도 다른 패키지에 속해 있으면 연관이 없음
 클래스 파일 안에 여러 클래스 가 있을 수 있지만 public 클래스는 단 하나여야하고 public 클래스의 이름과 자바 파일 이름은 같아야한다
 classpart 패키지 아래 두 개의 클래스 파일을 만들었다
 패키지는 클래스 파일의 묶음으로
 소스코드를 계층구조로 관리할 수 있도록 한다
 
 main 함수는 자바가상머신(JVM)이 프로그램을 시작하기 위해 호출하는 함수, 클래스 내부에 만들지만클래스의 메서드가 아니다
 아래처럼 클래스 내부에 main 함수를 만들면 이 클래스가 프로그램의 시작클래스가 됨
 이와 같이 클래스 내부에 main 함수를 호출해 테스트를 수행하면 모든 클래스가 main 함수를 포함 해야 하는데,
 그럴 필요 없이 따로 테스트용 클래스를 생성할 수 있다 
 */
public class Student {
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public void showStudentInfo() {
		System.out.println(studentName + "," + address);
	}
	
	
	public String getStudentName( ) {
		return studentName;
	};
	
	public void setStudentName(String name) {
		studentName = name;
	}
	
	public static void main(String[] args) {
		Student studentKim = new Student();
		studentKim.studentName = "먼지";
		
		System.out.println(studentKim.studentName);
		studentKim.setStudentName("먼지몬");
		System.out.println(studentKim.studentName);
		System.out.println(studentKim.getStudentName());
	}
	
}
