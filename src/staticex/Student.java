package staticex;
/*
 staticex 패키지의 Student 클래스
 static 변수에 대해 알아본다
 
 인스턴스마다 따로 생성되는 변수가 아닌,
 클래스 공통으로 사용하는 변수를 static 변수(정적 변수)로 선언한다
 
 static 변수는 인스턴스가 생성될 때 생성되는 변수가 아니라
 프로그램이 실행되어 메모리에 올라갈 때 메모리 공간(데이터영역)이 할당되며 프로그램이 종료될 때 까지 메모리에 상주한다
 static 변수는 모든 인스턴스가 공유한다
 */
public class Student {
	public static int serialNum = 1000;
	public int studentId;
	public String studentName;
	public int grade;
	public String address;
	
	public Student(String name) {
		this.studentName = name;
		this.studentId = serialNum++;
	}
	
	public int getStudentId() {
		return studentId;
	}
}
